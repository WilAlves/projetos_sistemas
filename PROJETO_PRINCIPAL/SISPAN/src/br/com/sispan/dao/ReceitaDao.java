package br.com.sispan.dao;

import javax.persistence.EntityManager;
import br.com.sispan.model.Receita;

public class ReceitaDao extends GenericDAO{

	public ReceitaDao(EntityManager entityManager) {
		super(entityManager);
		// TODO Auto-generated constructor stub
	}
	
	public Receita consultar(Long id){
		return entityManager.getReference(Receita.class,id);
	}
	

}
