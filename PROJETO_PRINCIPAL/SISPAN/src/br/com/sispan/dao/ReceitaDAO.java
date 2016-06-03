package br.com.sispan.dao;

import javax.persistence.EntityManager;
import br.com.sispan.model.Receita;

public class ReceitaDAO extends GenericDAO{
	
	public ReceitaDAO(EntityManager entityManager) {
		// TODO Auto-generated constructor stub
		super(entityManager);
	}

	public Receita consultar(Long id){
		return entityManager.getReference(Receita.class, id);
	}
}
