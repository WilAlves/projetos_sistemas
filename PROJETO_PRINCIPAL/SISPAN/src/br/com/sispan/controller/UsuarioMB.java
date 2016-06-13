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
