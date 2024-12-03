package com.example.Atividade.Controller;

import com.example.Atividade.Model.Turma;
import com.example.Atividade.Model.AtividadeEvento;
import com.example.Atividade.Repository.CriancaRepository;
import com.example.Atividade.Repository.TurmaRepository;
import com.example.Atividade.Repository.AtividadeEventoRepository;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

/**
 *
 * @author Deylon
 */
@Controller
public class TelaController {

    @Autowired
    private CriancaRepository criancaRepository;

    @GetMapping("/lista-criancas")
    public String listaCriancas(Model model) {
        // Recupera todas as crianças do repositório
        model.addAttribute("criancas", criancaRepository.findAll());
        return "lista-criancas"; // Redireciona para a página de lista de crianças
    }

    @Autowired
    private TurmaRepository turmaRepository;

    @Autowired
    private AtividadeEventoRepository atividadeEventoRepository;

    @GetMapping("/")
    public String index() {
        return "index";
    }

    @GetMapping("/cadastro-criancas")
    public String cadastroCriancas(Model model) {
        model.addAttribute("criancas", criancaRepository.findAll());
        return "cadastro-criancas";
    }

    @GetMapping("/gerenciamento-turmas")
    public String gerenciamentoTurmas(Model model) {
        // Listando todas as turmas do banco de dados
        model.addAttribute("turmas", turmaRepository.findAll());
        return "gerenciamento-turmas";
    }

    @PostMapping("/gerenciamento-turmas")
    public String adicionarTurma(@RequestParam String nomeTurma, @RequestParam String horariosTurma) {
        // Garantir que os dados foram recebidos corretamente
        if (nomeTurma == null || nomeTurma.isEmpty()) {
            // Se o nome da turma for nulo ou vazio, não podemos salvar
            return "redirect:/gerenciamento-turmas"; // Redirecionar de volta para a lista de turmas
        }

        // Criando uma nova turma
        Turma turma = new Turma(nomeTurma, horariosTurma);
        // Salvando a turma no banco de dados
        turmaRepository.save(turma);
        return "redirect:/gerenciamento-turmas";
    }

    @RestController
    @RequestMapping("/gerenciamento-turmas-json")
    public class TurmaRestController {

        @Autowired
        private TurmaRepository turmaRepository;

        @GetMapping
        public List<Turma> listarTurmas() {
            return turmaRepository.findAll();
        }
    }

    @GetMapping("/atividades-eventos")
    public String atividadesEventos(Model model) {
        model.addAttribute("atividades", atividadeEventoRepository.findAll());
        return "atividades-eventos";
    }

    @PostMapping("/atividades-eventos")
    public String adicionarAtividade(@RequestParam String nome,
            @RequestParam String data,
            @RequestParam String descricao) {
        AtividadeEvento atividade = new AtividadeEvento(nome, data, descricao);
        atividadeEventoRepository.save(atividade);
        return "redirect:/atividades-eventos";
    }
}
