
package com.example.Atividade.Controller;

import com.example.Atividade.Model.Crianca;
import com.example.Atividade.Model.Turma;
import com.example.Atividade.Model.AtividadeEvento;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author Deylon
 */

@Controller
public class TelaController {

    private final List<Crianca> criancas = new ArrayList<>();
    private final List<Turma> turmas = new ArrayList<>();
    private final List<AtividadeEvento> atividades = new ArrayList<>();

    @GetMapping("/")
    public String index() {
        return "index";
    }

    @GetMapping("/cadastro-criancas")
    public String cadastroCriancas(Model model) {
        model.addAttribute("criancas", criancas);
        return "cadastro-criancas";
    }

    @PostMapping("/cadastro-criancas")
    public String adicionarCrianca(@RequestParam String nome, 
                                    @RequestParam String responsavel, 
                                    @RequestParam int idade, 
                                    @RequestParam String contato) {
        Crianca crianca = new Crianca(nome, responsavel, idade, contato);
        criancas.add(crianca);
        return "redirect:/cadastro-criancas";
    }

    @GetMapping("/gerenciamento-turmas")
    public String gerenciamentoTurmas(Model model) {
        model.addAttribute("turmas", turmas);
        return "gerenciamento-turmas";
    }

    @PostMapping("/gerenciamento-turmas")
    public String adicionarTurma(@RequestParam String nome, 
                                  @RequestParam String horarios) {
        Turma turma = new Turma(nome, horarios);
        turmas.add(turma);
        return "redirect:/gerenciamento-turmas";
    }

    @GetMapping("/atividades-eventos")
    public String atividadesEventos(Model model) {
        model.addAttribute("atividades", atividades);
        return "atividades-eventos";
    }

    @PostMapping("/atividades-eventos")
    public String adicionarAtividade(@RequestParam String nome, 
                                      @RequestParam String data, 
                                      @RequestParam String descricao) {
        AtividadeEvento atividade = new AtividadeEvento(nome, data, descricao);
        atividades.add(atividade);
        return "redirect:/atividades-eventos";
    }
}
