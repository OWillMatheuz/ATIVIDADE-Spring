package org.generation.hello.controller;
import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("/objetivos")

public class ObjetivosController {
	
	@GetMapping
	public List<String> getobjetivos() {
        List<String> objetivos = Arrays.asList("Persistência", " Trabalho em Equipe", " e ", " Orientação ao Detalhe");
        return objetivos;
	}
}
