package br.com.sispan.dao;

import javax.persistence.EntityManager;

import br.com.sispan.model.Usuario;

public class UsuarioDAO extends GenericDAO {

	  
	public UsuarioDAO(EntityManager entityManager) {
		super(entityManager);
	}

	public Usuario consultar(Long id){
		return entityManager.getReference(Usuario.class, id);
	}

	
	
}
