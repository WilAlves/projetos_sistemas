package br.com.sispan.dao;

import javax.persistence.EntityManager;

import br.com.sispan.model.Fornecedor;

public class FornecedorDAO extends GenericDAO {

	  
	public FornecedorDAO(EntityManager entityManager) {
		super(entityManager);
	}

	public Fornecedor consultar(Long id){
		return entityManager.getReference(Fornecedor.class, id);
	}
	
}
