package es.tatvil.formula1.repository;

import es.tatvil.formula1.dto.PilotoDTO;
import java.util.List;

public interface PilotoRepository {
    List<PilotoDTO> findPilotosConEscuderia();
    PilotoDTO findPilotoById(Long id);
}