
package com.example.Atividade.Repository;

import com.example.Atividade.Model.Crianca;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author Deylon
 */

@Repository
public interface CriancaRepository extends JpaRepository<Crianca, Long> {
}
