package br.com.sispan.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import br.com.sispan.interfaces.Bean;
import br.com.sispan.util.JPAUtil;

public class GenericDAO {
	
	
	
	
  	public void salvar(Bean model) {
		EntityManager entityManager = JPAUtil.getEntityManager();
		entityManager.getTransaction().begin();
		if (model.getId() != null) {
			entityManager.persist((entityManager.contains(model)?model:entityManager.merge(model)));
		} else {
			entityManager.merge(model);
		}
		entityManager.getTransaction().commit();
		entityManager.close();
	}

	public Bean consultar(Class c, Long id) {
		EntityManager entityManager = JPAUtil.getEntityManager();
		return entityManager.getReference(c, id);
	}

	public void excluir(Bean b) {
		EntityManager entityManager = JPAUtil.getEntityManager();
		entityManager.getTransaction().begin();
		entityManager.remove((entityManager.contains(b) ? b : entityManager.merge(b)));
		entityManager.getTransaction().commit();
		entityManager.close();
	}

	public List listar(String query) {
		EntityManager entityManager = JPAUtil.getEntityManager();
		Query cursor = entityManager.createQuery(query);
		return cursor.getResultList();
	}
}
