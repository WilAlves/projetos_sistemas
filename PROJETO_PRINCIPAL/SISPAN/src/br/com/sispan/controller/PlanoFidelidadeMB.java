package br.com.sispan.controller;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

import br.com.sispan.interfaces.Bean;
import br.com.sispan.model.PlanoFidelidade;

@RequestScoped
@ManagedBean
public class PlanoFidelidadeMB extends GenericMB {

	private PlanoFidelidade planoFidelidade = new PlanoFidelidade();
		
	public PlanoFidelidade getPlanoFidelidade() {
		return planoFidelidade;
	}

	public void setPlanoFidelidade(PlanoFidelidade planoFidelidade) {
		this.planoFidelidade = planoFidelidade;
	}

	@Override
	protected Bean getBean() {	 
		return getPlanoFidelidade();
	}

	@Override
	protected void setBean(Bean b) {
		setPlanoFidelidade((PlanoFidelidade) b);
	}

}
