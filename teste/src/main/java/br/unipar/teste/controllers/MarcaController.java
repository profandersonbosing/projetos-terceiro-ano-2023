package br.unipar.teste.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/marca")
public class MarcaController {

	@GetMapping
	public String findAll() {
		return "OLA MUNDOOOOO";
	}
	
	
}
