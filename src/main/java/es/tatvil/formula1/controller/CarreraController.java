package es.tatvil.formula1.controller;

import es.tatvil.formula1.entity.Carrera;
import es.tatvil.formula1.repository.CarreraRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/carreras")
public class CarreraController {

    @Autowired
    private CarreraRepository carreraRepository;

    @GetMapping
    public List<Carrera> getAllCarreras() {
        return carreraRepository.findAll();
    }
}