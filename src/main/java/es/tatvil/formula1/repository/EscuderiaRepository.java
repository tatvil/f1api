package es.tatvil.formula1.repository;

import es.tatvil.formula1.dto.EscuderiaDTO;
import es.tatvil.formula1.dto.PilotoDTO;
import java.util.List;

public interface EscuderiaRepository {
    List<EscuderiaDTO> findAll();
    List<PilotoDTO> findPilotosPorEscuderia(Long escuderiaId);
}