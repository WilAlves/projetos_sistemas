package br.com.sispan.controller;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;


import br.com.sispan.interfaces.Bean;
import br.com.sispan.model.Funcionario;

@RequestScoped
@ManagedBean
public class FuncionarioMB extends GenericMB {

	private Funcionario funcionario = new Funcionario();

	public void setFuncionario(Funcionario funcionario) {
		this.funcionario = funcionario;
	}

	public Funcionario getFuncionario() {
		return this.funcionario;
	}

	
	@Override
	protected Bean getBean() { // TODO Auto-generated method stub
		return funcionario;
	}

	
	@Override
	protected void setBean(Bean b) { // TODO Auto-generated method
		this.setFuncionario((Funcionario) b);
		System.out.println("nome: "+this.funcionario.getMatriculaFuncionario());
	}
	
	


	
}
