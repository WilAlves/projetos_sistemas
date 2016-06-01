package br.com.sispan.dao;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JPAUtil {
	
	private static EntityManagerFactory emf = Persistence.createEntityManagerFactory("id");
	
	public static EntityManager geEntityManager(){
		return emf.createEntityManager();
	}

}
