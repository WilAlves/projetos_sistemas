package br.com.sispan.controller;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.servlet.http.HttpSession;

import java.util.List;
import java.util.ArrayList;

import br.com.sispan.interfaces.Bean;
import br.com.sispan.model.Usuario;

@RequestScoped
@ManagedBean
public class UsuarioMB extends GenericMB {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -6031504960846687438L;

	private EntityManager entityManager;

	private Usuario usuario = new Usuario();

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public Usuario getUsuario() {
		return this.usuario;
	}

	public void login() {
		System.out.println("logando com: " + usuario.getLoginUsuario());
		HttpSession session = (HttpSession) FacesContext.getCurrentInstance().getExternalContext().getSession(false);
		session.setAttribute("usuario", usuario);
	}
	 

	@Override
	protected Bean getBean() { // TODO Auto-generated method stub
		return usuario;
	}

	@Override
	protected void setBean(Bean b) { // TODO Auto-generated method
		this.setUsuario((Usuario) b);
		System.out.println("nome: "+this.usuario.getLoginUsuario());
	}
	
	public Usuario consultar(long id){
		return entityManager.getReference(Usuario.class, id);
	}
	
	public List<Usuario> listar(){
		String one = "Select p from Usuario order by login_usuario";
		Query query = entityManager.createQuery(one);
		return query.getResultList();
	}

	@Override
	public void setLista(List<Bean> lista) {
		// TODO Auto-generated method stub
		
	}	
}
