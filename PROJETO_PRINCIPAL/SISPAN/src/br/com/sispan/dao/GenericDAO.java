package br.com.sispan.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import br.com.sispan.interfaces.Bean;

public class GenericDAO {
	
	private EntityManager entityManager;
	
	public  GenericDAO(EntityManager entityManager){
		this.entityManager = entityManager;
	}
	
	private void cadastrar(Bean model){
		entityManager.persist(model);
	}
	private void alterar(Bean model){
		entityManager.merge(model);
	}
	
	public void salvar(Bean model){
		if(model.getId() != null){
			this.alterar(model);
		}else{
			this.cadastrar(model);
		}
	}
	public void excluir(Bean model){
		entityManager.remove(model);		
	}
	
	public List<Bean> listar(String query){
		Query cursor = entityManager.createQuery(query);
		return cursor.getResultList();
	}

}
