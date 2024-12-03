
package com.example.Atividade.Repository;

import com.example.Atividade.Model.AtividadeEvento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


/**
 *
 * @author Deylon
 */

@Repository
public interface AtividadeEventoRepository extends JpaRepository<AtividadeEvento, Long> {
}
