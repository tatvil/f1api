package es.tatvil.formula1.repository;

import es.tatvil.formula1.entity.Piloto;
import es.tatvil.formula1.entity.PilotoEscuderia;
import es.tatvil.formula1.dto.PilotoDTO;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface PilotoRepository extends JpaRepository<Piloto, Long> {
    
	@Query("""
			SELECT new es.tatvil.formula1.dto.PilotoDTO(
			    p.numero,
			    p.codigo,
			    p.nombre,
			    p.apellido,
			    e.nombre,
			    p.nacionalidad
			)
			FROM PilotoEscuderia pe
			JOIN pe.piloto p
			JOIN pe.escuderia e
			WHERE pe.temporada.id = 1
			""")
			List<PilotoDTO> findPilotosConEscuderia();
}