
package com.example.Atividade.Repository;

import com.example.Atividade.Model.Turma;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
/**
 *
 * @author Deylon
 */

@Repository
public interface TurmaRepository extends JpaRepository<Turma, Long> {
}
