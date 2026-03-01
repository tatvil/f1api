package es.tatvil.formula1.repository;

import es.tatvil.formula1.dto.EscuderiaDTO;
import es.tatvil.formula1.dto.PilotoDTO;
import es.tatvil.formula1.entity.Escuderia;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface EscuderiaRepository extends JpaRepository<Escuderia, Long> {
	    @Query("SELECT new es.tatvil.formula1.dto.EscuderiaDTO(e.id, e.nombre) FROM Escuderia e")
	    List<EscuderiaDTO> findAllDTO();  // método nuevo, no sobrescribe findAll()
	 
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
			    WHERE e.id = :escuderiaId
			""")
			List<PilotoDTO> findPilotosPorEscuderia(@Param("escuderiaId") Long escuderiaId);
}