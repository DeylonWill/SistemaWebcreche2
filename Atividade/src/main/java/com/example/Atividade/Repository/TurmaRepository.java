
package com.example.Atividade.Repository;

import com.example.Atividade.Model.Turma;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Deylon
 */

@Repository
public class TurmaRepository {
    private final List<Turma> turmas = new ArrayList<>();

    public List<Turma> findAll() {
        return turmas;
    }

    public void save(Turma turma) {
        turmas.add(turma);
    }
}
