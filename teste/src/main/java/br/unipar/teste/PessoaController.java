package br.unipar.teste;

import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "person")
public class PessoaController {
	
	@Autowired
	private PessoaRepository pessoaRepository;
	
	@GetMapping(path = "/{id}")
	public Pessoa findById(@PathVariable Long id) {
		
		return pessoaRepository.findById(id).get();
		
	}
	
	@GetMapping
	public List<Pessoa> findAllByNome(@RequestParam String nome) {
		System.out.println(nome);
		return pessoaRepository.findAll();
		
	}
	

}
