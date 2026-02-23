package es.tatvil.formula1.controller;

import es.tatvil.formula1.dto.PilotoDTO;
import es.tatvil.formula1.entity.Piloto;
import es.tatvil.formula1.repository.PilotoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/f1/api/pilotos") // ajustamos al endpoint que usa tu JS
public class PilotoController {

    @Autowired
    private PilotoRepository pilotoRepository;

    // Devuelve pilotos con escudería usando DTO
    @GetMapping
    public List<PilotoDTO> getPilotos() {
        return pilotoRepository.findPilotosConEscuderia();
    }

    // Devuelve un piloto por ID (si quieres)
    @GetMapping("/{id}")
    public Piloto getPilotoById(@PathVariable Long id) {
        return pilotoRepository.findById(id).orElse(null);
    }
}