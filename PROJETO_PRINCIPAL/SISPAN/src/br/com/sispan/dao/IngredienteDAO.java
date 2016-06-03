package br.com.sispan.dao;

import javax.persistence.EntityManager;

import br.com.sispan.model.Ingredientes;

public class IngredienteDAO extends GenericDAO {

		  
	 	public IngredienteDAO(EntityManager entityManager){
			// TODO Auto-generated constructor stub
			super(entityManager);
		}

		public Ingredientes consultar(Long id){
			return entityManager.getReference(Ingredientes.class, id);
		}

}
