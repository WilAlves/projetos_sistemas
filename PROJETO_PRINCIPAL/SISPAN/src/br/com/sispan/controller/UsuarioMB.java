package br.com.sispan.controller;

import java.util.ArrayList;
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

	/**
	 * 
	 */
	private static final long serialVersionUID = -915511402250833703L;
	private Usuario usuario = new Usuario();
	private List<Usuario> listaUsuarios = new ArrayList();
	
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

	@Override
	protected Bean getBean() { // TODO Auto-generated method stub
		return usuario;
	}

	@Override
	protected void setBean(Bean b) { // TODO Auto-generated method
		this.setUsuario((Usuario) b);
	}

	
}
