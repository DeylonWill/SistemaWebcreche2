
package com.example.Atividade.Controller;


import com.example.Atividade.Model.Crianca;
import com.example.Atividade.Repository.CriancaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 *
 * @author Deylon
 */
@RestController
@RequestMapping("/api/criancas")
public class CriancaController {

    @Autowired
    private CriancaRepository criancaRepository;

    // Método POST para cadastrar uma criança
    @PostMapping
    public Crianca cadastrarCriança(@RequestBody Crianca crianca) {
        return criancaRepository.save(crianca);
    }
}
