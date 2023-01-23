package org.generation.hello.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController //ctrl + shift + o para importar, informa que é um controller
@RequestMapping("/helloworld")//Informa o endereço da web

public class helloController {
	@GetMapping // pega informação do metodo e exibe
	public String hello() {
		return "Hello World!, Sejam Bem vindos ao Spring!";
	}
	
	
}
