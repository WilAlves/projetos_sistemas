package br.com.sispan.controller;

import java.io.Serializable;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.persistence.Query;
import javax.persistence.EntityManager;
import javax.persistence.Table;

import org.eclipse.jdt.internal.compiler.lookup.AnnotatableTypeSystem;

import br.com.sispan.dao.GenericDAO;
import br.com.sispan.dao.PlanoFidelidadeDAO;
import br.com.sispan.dao.FornecedorDAO;
import br.com.sispan.interfaces.Bean;
import br.com.sispan.util.JPAUtil;

public abstract class GenericMB implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8896371194744307879L;

	protected abstract Bean getBean();

	protected abstract void setBean(Bean b);

	public abstract void setLista(List<Bean>lista);

	public void salvar() {
		Bean b = getBean();
		try {
			System.out.println("salvando: " + b.getClass());
			EntityManager em = JPAUtil.getEntityManager();
			GenericDAO dao = new GenericDAO(em);
			em.getTransaction().begin();
			dao.salvar(b);
			em.getTransaction().commit();
			em.close();
			setBean(b.getClass().newInstance());
			FacesContext.getCurrentInstance().addMessage(null,
					new FacesMessage("Sucesso", b.getClass().getSimpleName() + " salvo com sucesso!"));
		} catch (InstantiationException e) {
			FacesContext.getCurrentInstance().addMessage(null,
					new FacesMessage("Falha", "Falha ao salvar: " + b.getClass().getSimpleName() + "\n" + e));
		} catch (IllegalAccessException e) {
			FacesContext.getCurrentInstance().addMessage(null,
					new FacesMessage("Falha", "Falha ao salvar: " + b.getClass().getSimpleName() + "\n" + e));
		}
	}

	public void excluir() {
		Bean b = getBean();
		System.out.println(b);
		EntityManager em = JPAUtil.getEntityManager();
		GenericDAO dao = new GenericDAO(em);
		em.getTransaction().begin();
		dao.excluir(b);
		em.getTransaction().commit();
		em.close();
	}

	
	/*public void carregaLista() {
		EntityManager em = JPAUtil.getEntityManager();
		listaPlanos = new PlanoFidelidadeDAO(em).listar("FROM PlanoFidelidade");
		em.close();
	}  */
	@PostConstruct
	public void carregaLista() {
		Class c = getClass();
		String entityName = c.getSimpleName().replaceAll("(MB)$", "");
		this.carregaLista(" FROM " + entityName);
	}

	public void carregaLista(String sql) {
		this.carregaLista(sql, "", "", "");
	}

	@SuppressWarnings("unchecked")
	public void carregaLista(String sql, String whereClause, String orderClause, String groupClause) {
		EntityManager em = JPAUtil.getEntityManager();
		List  lista = new GenericDAO(em).listar(sql + " " + whereClause + " " + orderClause + " " + groupClause);
		setLista(lista);
		em.close();
	}
}
