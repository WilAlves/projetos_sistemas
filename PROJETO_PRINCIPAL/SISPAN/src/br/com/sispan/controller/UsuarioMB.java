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
