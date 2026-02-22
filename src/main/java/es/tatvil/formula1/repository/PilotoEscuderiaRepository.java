package es.tatvil.formula1.repository;

import es.tatvil.formula1.entity.PilotoEscuderia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PilotoEscuderiaRepository extends JpaRepository<PilotoEscuderia, Long> {
}