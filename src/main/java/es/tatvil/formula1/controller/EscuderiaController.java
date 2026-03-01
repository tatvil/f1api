package es.tatvil.formula1.controller;

import es.tatvil.formula1.dto.EscuderiaDTO;
import es.tatvil.formula1.dto.PilotoDTO;
import es.tatvil.formula1.repository.EscuderiaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/f1/api/escuderias")
public class EscuderiaController {

    @Autowired
    private EscuderiaRepository escuderiaRepository;

    @GetMapping
    public List<EscuderiaDTO> getEscuderias() {
        return escuderiaRepository.findAllDTO(); // aquí ya devuelve DTO
    }
}