
package com.example.Atividade.Controller;

import com.example.Atividade.Model.Crianca;
import com.example.Atividade.Model.Turma;
import com.example.Atividade.Repository.CriancaRepository;
import com.example.Atividade.Repository.TurmaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Deylon
 */
@RestController
@RequestMapping("/api")
public class ApiController {
    @Autowired
    private CriancaRepository criancaRepository;

    @Autowired
    private TurmaRepository turmaRepository;

    @DeleteMapping("/criancas/{id}")
    public void deletarCrianca(@PathVariable Long id) {
        criancaRepository.deleteById(id);
    }

    @DeleteMapping("/turmas/{id}")
    public void deletarTurma(@PathVariable Long id) {
        turmaRepository.deleteById(id);
    }

    @GetMapping("/criancas/{id}")
    public Crianca obterCrianca(@PathVariable Long id) {
        return criancaRepository.findById(id).orElse(null);
    }

    @GetMapping("/turmas/{id}")
    public Turma obterTurma(@PathVariable Long id) {
        return turmaRepository.findById(id).orElse(null);
    }
}
