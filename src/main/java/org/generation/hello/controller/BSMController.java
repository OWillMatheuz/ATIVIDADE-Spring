package org.generation.hello.controller;
import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("/bsms")

public class BSMController {
	 @GetMapping
	    public List<String> getBSMs() {
	        List<String> bsms = Arrays.asList("Comunicação", "Mentalidade de Crescimento", "Orientação ao Detalhe", "Orientação ao Futuro", "Persistência", "Proatividade", "Responsabilidade Pessoal", "Trabalho em Equipe");
	        return bsms;
	    }
}
