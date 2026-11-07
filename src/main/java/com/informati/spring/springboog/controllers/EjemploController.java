package com.informati.spring.springboog.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.HashMap;
import java.util.Map;

@RestController
public class EjemploController {
    
    // Inciso B: Endpoint que regresa informacion de una lista simulada (Materias)
    @GetMapping("/materias")
    public Map<String, String> obtenerMaterias() {
        Map<String, String> materias = new HashMap<>();
        materias.put("Materia1", "Programacion Web");
        materias.put("Materia2", "Calidad de Sistemas");
        materias.put("Materia3", "Taller de Investigacion 2");
        return materias;
    }
}