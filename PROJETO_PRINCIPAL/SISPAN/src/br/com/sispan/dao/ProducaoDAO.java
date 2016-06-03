package br.com.sispan.dao;

import javax.persistence.EntityManager;

import br.com.sispan.model.Producao;

public class ProducaoDAO extends GenericDAO{
	
	public ProducaoDAO(EntityManager entityManager) {
			// TODO Auto-generated constructor stub
		super(entityManager);
	}

	public Producao consultar(Long id){
		return entityManager.getReference(Producao.class, id);
	}

}
