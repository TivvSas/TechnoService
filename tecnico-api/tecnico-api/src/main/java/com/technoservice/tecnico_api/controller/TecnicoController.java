package com.technoservice.tecnico_api.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.technoservice.tecnico_api.service.TecnicoService;

import lombok.RequiredArgsConstructor;

@RestController // Indica que esta clase es un controlador REST
@RequestMapping("/api/v1/tecnicos") // Define la ruta base del controlador
@RequiredArgsConstructor// Genera constructor con atributos final

public class TecnicoController {
    private final TecnicoService tecnicoService;

    
}
