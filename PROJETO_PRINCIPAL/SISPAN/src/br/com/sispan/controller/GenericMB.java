package br.com.sispan.controller;

import java.io.Serializable;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.persistence.EntityManager;
import br.com.sispan.dao.GenericDAO;
import br.com.sispan.interfaces.Bean;
import br.com.sispan.util.JPAUtil;

public abstract class GenericMB implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8896371194744307879L;

	protected abstract Bean getBean();

	protected abstract void setBean(Bean b);

	public abstract void setLista(List<Bean> lista);

	public void novo() {
		Bean b = null;
		try {
			b = getBean().getClass().newInstance();
			setBean(b);
		} catch (InstantiationException e) {
			FacesContext.getCurrentInstance().addMessage(null,
					new FacesMessage("Falha", "Novo(a) " + b.getClass().getSimpleName() + " nao pode ser instanciado."));
		} catch (IllegalAccessException e) {
			FacesContext.getCurrentInstance().addMessage(null,
					new FacesMessage("Falha", "Novo(a) " + b.getClass().getSimpleName() + " nao pode ser instanciado."));
		}
	}

	public void salvar() {
		Bean b = getBean();
		try {
			String daoName = this.getClass().getName().replaceAll("(MB)$", "DAO").replaceAll("controller", "dao");
			GenericDAO dao = null;
			try {
				dao = (GenericDAO) Class.forName(daoName).newInstance();
			} catch (ClassNotFoundException e) {
				dao = new GenericDAO();
			}
			dao.salvar(b);
			novo();
			carregaLista();
			FacesContext.getCurrentInstance().addMessage(null,
					new FacesMessage("Sucesso", b.getClass().getSimpleName() + " salvo com sucesso!"));
		} catch (InstantiationException e) {
			FacesContext.getCurrentInstance().addMessage(null,
					new FacesMessage("Falha", "Falha ao salvar: " + b.getClass().getSimpleName() + "\n" + e));
			System.out.println(e);
		} catch (IllegalAccessException e) {
			FacesContext.getCurrentInstance().addMessage(null,
					new FacesMessage("Falha", "Falha ao salvar: " + b.getClass().getSimpleName() + "\n" + e));
			System.out.println(e);
		} catch (Exception e) {
			FacesContext.getCurrentInstance().addMessage(null,
					new FacesMessage("Falha", "Falha ao salvar: " + b.getClass().getSimpleName() + "\n" + e));
			System.out.println(e);
		}
	}

	public void excluir() {
		Bean b = getBean();
		GenericDAO dao = null;
		try {
			String daoName = this.getClass().getName().replaceAll("(MB)$", "DAO").replaceAll("controller", "dao");
			try {
				dao = (GenericDAO) Class.forName(daoName).newInstance();
			} catch (ClassNotFoundException e) {
				dao = new GenericDAO();
			} catch (InstantiationException e) {
				dao = new GenericDAO();
			} catch (IllegalAccessException e) {
				dao = new GenericDAO();
			}
			dao.excluir(b);
			novo();
			carregaLista();
			FacesContext.getCurrentInstance().addMessage(null,
					new FacesMessage("Sucesso", b.getClass().getSimpleName() + " excluido com sucesso!"));
		} catch (Exception e) {
			FacesContext.getCurrentInstance().addMessage(null,
					new FacesMessage("Falha", "Falha ao excluir: " + b.getClass().getSimpleName() + "\n" + e));
			System.out.println(e);
		}
	}

	/*
	 * public void carregaLista() { EntityManager em =
	 * JPAUtil.getEntityManager(); listaPlanos = new
	 * PlanoFidelidadeDAO(em).listar("FROM PlanoFidelidade"); em.close(); }
	 */
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
		List lista = new GenericDAO().listar(sql + " " + whereClause + " " + orderClause + " " + groupClause);
		setLista(lista);
		em.close();
	}
}
