package br.com.sispan.controller;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.persistence.EntityManager;

import br.com.sispan.dao.GenericDAO;
import br.com.sispan.interfaces.Bean;
import br.com.sispan.util.JPAUtil;

public abstract class GenericMB {

	protected abstract Bean getBean();

	protected abstract void setBean(Bean b);

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
}
