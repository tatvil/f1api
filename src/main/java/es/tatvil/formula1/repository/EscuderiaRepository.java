package es.tatvil.formula1.repository;

import es.tatvil.formula1.entity.Escuderia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EscuderiaRepository extends JpaRepository<Escuderia, Long> {
}