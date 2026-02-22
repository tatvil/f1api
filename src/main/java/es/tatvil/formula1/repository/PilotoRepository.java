package es.tatvil.formula1.repository;

import es.tatvil.formula1.entity.Piloto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PilotoRepository extends JpaRepository<Piloto, Long> {
    // Aquí puedes añadir consultas personalizadas si quieres
}