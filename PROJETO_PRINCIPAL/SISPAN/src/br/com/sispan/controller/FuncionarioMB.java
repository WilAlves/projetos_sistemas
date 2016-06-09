package br.com.sispan.controller;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.ViewScoped;

import br.com.sispan.interfaces.Bean;
import br.com.sispan.model.Funcionario;
import br.com.sispan.model.Usuario;

@ViewScoped
@ManagedBean
public class FuncionarioMB extends GenericMB {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1445675688003634443L;
	private Funcionario funcionario = new Funcionario();
	private List<Funcionario> listaFuncionarios = new ArrayList();

	public Funcionario getFuncionario() {
		return funcionario;
	}
	
	public void setFuncionario(Funcionario funcionario) {
		this.funcionario = funcionario;
	}

	@Override
	protected Bean getBean() {
		return getFuncionario();
	}

	@Override
	protected void setBean(Bean b) {
		setFuncionario((Funcionario)b);
	}
	
	@Override
	public void setLista(List lista) {
		System.out.println("Setando lista: ");
		this.listaFuncionarios = new ArrayList<Funcionario>(lista);
		
	}	
	
	public List<Funcionario> getListaFuncionarios(){
		return listaFuncionarios;
	}
	
	public void setListaFuncionarios(List<Funcionario> listaFuncionarios){
		this.listaFuncionarios = listaFuncionarios;
	}
	
}
