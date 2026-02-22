package es.tatvil.formula1.controller;

import es.tatvil.formula1.entity.Escuderia;
import es.tatvil.formula1.repository.EscuderiaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/escuderias")
public class EscuderiaController {

    @Autowired
    private EscuderiaRepository escuderiaRepository;

    @GetMapping
    public List<Escuderia> getAllEscuderias() {
        return escuderiaRepository.findAll();
    }
}