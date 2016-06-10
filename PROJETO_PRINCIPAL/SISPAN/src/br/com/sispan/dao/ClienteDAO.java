package br.com.sispan.dao;

import javax.persistence.EntityManager;

import br.com.sispan.model.Cliente;

public class ClienteDAO extends GenericDAO {

	  
	public ClienteDAO(EntityManager entityManager) {
		super(entityManager);
	}

	public Cliente consultar(Long id){
		return entityManager.getReference(Cliente.class, id);
	}

	private EntityManager entityManager() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
