package br.unipar.teste.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.bind.DefaultValue;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.unipar.teste.model.Marca;
import br.unipar.teste.model.dto.ExceptionDTO;
import br.unipar.teste.services.MarcaService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@RestController
@RequestMapping(path = "/marca")
@Api(description = "Controlador Rest Responsavel pela Operações que representam o objeto de Negócios Marca")
public class MarcaController {
	
	@Autowired
	private MarcaService marcaService;

	@PostMapping
	@ApiOperation(value = "Operação Responsavel pela Inserção de uma Nova Marca no Sistema")
	public Marca insert(@RequestBody @Valid Marca marca) throws Exception {	
		
		return marcaService.insert(marca);
		
	}
	
	@PutMapping
	public Marca edit(@RequestBody Marca marca) throws Exception {
		
		return marcaService.edit(marca);
	}
	
	@GetMapping
	public List<Marca> findAll() throws Exception {
		
		return marcaService.findAll();
		
	}
	
	@GetMapping(path = "/{id}")
	public Marca findById(@PathVariable Long id) throws Exception {
		
		return marcaService.findById(id);
		
	}
	
	@GetMapping(path = "/filter")
	public List<Marca> findByFilters(@RequestParam("nome") String nome) throws Exception {
		
		return marcaService.findByFilters(nome);
		
	}
	
	
}
