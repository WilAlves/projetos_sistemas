package br.com.sispan.dao;

import javax.persistence.EntityManager;

import br.com.sispan.model.Ingrediente;

public class IngredienteDAO extends GenericDAO{

	public IngredienteDAO(EntityManager entityManager) {
		super(entityManager);
		// TODO Auto-generated constructor stub
	}
	
	public Ingrediente consultar(Long id){
		return entityManager.getReference(Ingrediente.class,id);
	}
	

}

