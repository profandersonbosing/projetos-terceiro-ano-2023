package br.unipar.teste.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/prova")
public class ProvaController {
	@GetMapping(path = "{id}/calcular")
	public String calcular(
			@PathVariable("id") int id,
			@RequestParam("numero1") int numero1, 
			@RequestParam("numero2") int numero2) {	
		return "Resultado "+id+" = "+(numero1 + numero2);
	}
}
