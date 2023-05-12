package br.unipar.teste.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.unipar.teste.model.Marca;
import br.unipar.teste.services.MarcaService;

@RestController
@RequestMapping(path = "/marca")
public class MarcaController {
	
	@Autowired
	private MarcaService marcaService;

	@PostMapping
	public Marca insert(@RequestBody Marca marca) throws Exception {
		
		return marcaService.insert(marca);
	}
	
	
}
