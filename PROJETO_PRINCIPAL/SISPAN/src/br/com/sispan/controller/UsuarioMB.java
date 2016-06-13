<<<<<<< 4c673af79553dec6f792a3bc115b29a377e2bb17
package br.com.sispan.controller;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import br.com.sispan.interfaces.Bean;
import br.com.sispan.model.Usuario;

@ViewScoped
@ManagedBean
public class UsuarioMB extends GenericMB {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -6031504960846687438L;
	private Usuario usuario = new Usuario();
	private List<Usuario> listaUsuarios = new ArrayList();

	public Usuario getUsuario() {
		return usuario;
	}
	
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	@Override
	protected Bean getBean() {
		return getUsuario();
	}

	@Override
	protected void setBean(Bean b) {
		setUsuario((Usuario)b);
	}
	
	@Override
	public void setLista(List lista) {
		System.out.println("Setando lista: ");
		this.listaUsuarios = new ArrayList<Usuario>(lista);
		
	}	
	
	public List<Usuario> getListaUsuarios(){
		return listaUsuarios;
	}
	
	public void setListaUsuarios(List<Usuario> listaUsuarios){
		this.listaUsuarios = listaUsuarios;
	}
	
}
=======
package br.com.sispan.controller;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpSession;

import br.com.sispan.interfaces.Bean;
import br.com.sispan.model.Usuario;

@RequestScoped
@ManagedBean
public class UsuarioMB extends GenericMB {

	private Usuario usuario = new Usuario();

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public Usuario getUsuario() {
		return this.usuario;
	}

	public void logar() {
		System.out.println("logando com: " + usuario.getNomeUsuario());
	//	HttpSession session = (HttpSession) FacesContext.getCurrentInstance().getExternalContext().getSession(false);
	//	session.setAttribute("usuario", usuario);
	//	salvar();
	}
	 

	@Override
	protected Bean getBean() { // TODO Auto-generated method stub
		return usuario;
	}

	@Override
	protected void setBean(Bean b) { // TODO Auto-generated method
		this.setUsuario((Usuario) b);
	}

	@Override
	public void setLista(List<Bean> lista) {
		
	}
	
}
>>>>>>> 
