package br.com.sispan.dao;

import javax.persistence.EntityManager;

import br.com.sispan.model.Supplier_Product;

public class Supplier_ProductDAO extends GenericDAO {

	  
	public Supplier_ProductDAO(EntityManager entityManager) {
		super(entityManager);
	}

	public Supplier_Product consultar(Long id){
		return entityManager.getReference(Supplier_Product.class, id);
	}
	
}
