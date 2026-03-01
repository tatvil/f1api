package es.tatvil.formula1.controller;

import es.tatvil.formula1.dto.PilotoDTO;
import es.tatvil.formula1.repository.PilotoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/pilotos")
public class PilotoController {

    @Autowired
    private PilotoRepository pilotoRepository;

    @GetMapping
    public List<PilotoDTO> getPilotos() {
        return pilotoRepository.findPilotosConEscuderia();
    }

    @GetMapping("/{id}")
    public PilotoDTO getPilotoById(@PathVariable Long id) {
        return pilotoRepository.findPilotoById(id);
    }
}