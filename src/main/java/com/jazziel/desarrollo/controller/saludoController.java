package com.jazziel.desarrollo.controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class saludoController {
    @GetMapping("/saludo")

    public String holaMundo() {
        return "Hola mundo desde Spring Boot!";
    }
}

