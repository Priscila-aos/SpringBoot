package br.com.generation.farmacia.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.generation.farmacia.model.ProdutoModel;

@Repository

public interface ProdutoRepository  extends JpaRepository<ProdutoModel, Long>{
	
	public List<ProdutoModel> findAllByTituloContainingIgnoreCase(String titulo);
	
}
