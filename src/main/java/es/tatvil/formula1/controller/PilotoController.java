package es.tatvil.formula1.controller;

import es.tatvil.formula1.entity.Piloto;
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
    public List<Piloto> getAllPilotos() {
        return pilotoRepository.findAll();
    }

    @GetMapping("/{id}")
    public Piloto getPilotoById(@PathVariable Long id) {
        return pilotoRepository.findById(id).orElse(null);
    }
}