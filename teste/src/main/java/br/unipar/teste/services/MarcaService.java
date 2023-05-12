package br.unipar.teste.services;

import org.springframework.stereotype.Service;

import br.unipar.teste.model.Marca;


@Service
public class MarcaService {

	public Marca insert(Marca marca) throws Exception {
		System.out.println("PASOOOOOOOOOOOOU");
		validarMarca(marca);
		
		return marca;
		
	}
	
	private void validarMarca(Marca marca) throws Exception {
		
		if (marca.getNome() == null ||
			marca.getNome().isBlank() || 
			marca.getNome().isEmpty()) {
			throw new Exception("Descricao da Marca Não pode ser vazia");
		}
		
		if (marca.getNome().length() > 255) {
			throw new Exception("Tamanho da Descrição deve ser menor que 255 caracteres");
		}
		
	}
	
}
