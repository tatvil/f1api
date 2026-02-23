package es.tatvil.formula1.controller;

import es.tatvil.formula1.dto.PilotoDTO;
import es.tatvil.formula1.repository.PilotoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/f1/api/pilotos") // coincide con tu JS
public class PilotoController {

    @Autowired
    private PilotoRepository pilotoRepository;

    // Devuelve pilotos con escudería
    @GetMapping
    public List<PilotoDTO> getPilotos() {
        return pilotoRepository.findPilotosConEscuderia();
    }

    // Devuelve un piloto por ID (opcional)
    @GetMapping("/{id}")
    public PilotoDTO getPilotoById(@PathVariable Long id) {
        return pilotoRepository.findPilotosConEscuderia().stream()
                .filter(p -> p.getNumero().equals(id.intValue()))
                .findFirst()
                .orElse(null);
    }
}