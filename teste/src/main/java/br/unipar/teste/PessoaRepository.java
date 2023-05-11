package br.unipar.teste;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface PessoaRepository extends JpaRepository<Pessoa, Long>{

	//@Query
	//public List<Pessoa> findByNameContainsIgnoreCaseOrderByIdDesc(String nome);
	
}
