
package com.example.Atividade.Repository;

import com.example.Atividade.Model.Crianca;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Deylon
 */

@Repository
public class CriancaRepository {
    private final List<Crianca> criancas = new ArrayList<>();

    public List<Crianca> findAll() {
        return criancas;
    }

    public void save(Crianca crianca) {
        criancas.add(crianca);
    }
}
