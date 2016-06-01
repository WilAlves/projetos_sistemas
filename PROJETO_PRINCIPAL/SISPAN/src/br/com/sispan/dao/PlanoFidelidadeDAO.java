package br.com.sispan.dao;

import javax.persistence.EntityManager;

import br.com.sispan.model.PlanoFidelidade;

public class PlanoFidelidadeDAO extends GenericDAO {

	  
	public PlanoFidelidadeDAO(EntityManager entityManager) {
		super(entityManager);
	}

	public PlanoFidelidade consultar(Long id){
		return entityManager.getReference(PlanoFidelidade.class, id);
	}
	
}
