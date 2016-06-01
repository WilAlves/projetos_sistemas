package br.com.sispan.dao;

import javax.persistence.EntityManager;

import br.com.sispan.model.Produto;

public class ProdutoDAO extends GenericDAO {

	  
	public ProdutoDAO(EntityManager entityManager) {
		super(entityManager);
	}

	public Produto consultar(Long id){
		return entityManager.getReference(Produto.class, id);
	}
	
}
