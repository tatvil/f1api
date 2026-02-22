package es.tatvil.formula1.controller;

import es.tatvil.formula1.entity.Resultado;
import es.tatvil.formula1.repository.ResultadoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/resultados")
public class ResultadoController {

    @Autowired
    private ResultadoRepository resultadoRepository;

    @GetMapping
    public List<Resultado> getAllResultados() {
        return resultadoRepository.findAll();
    }
}