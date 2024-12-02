
package com.example.Atividade.Repository;

import com.example.Atividade.Model.AtividadeEvento;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Deylon
 */

@Repository
public class AtividadeEventoRepository {
    private final List<AtividadeEvento> atividades = new ArrayList<>();

    public List<AtividadeEvento> findAll() {
        return atividades;
    }

    public void save(AtividadeEvento atividadeEvento) {
        atividades.add(atividadeEvento);
    }
}
