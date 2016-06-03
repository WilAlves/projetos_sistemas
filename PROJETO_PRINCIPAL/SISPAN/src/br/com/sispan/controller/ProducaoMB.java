package br.com.sispan.controller;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import br.com.sispan.interfaces.Bean;
import br.com.sispan.model.Producao;

@RequestScoped
@ManagedBean
public class ProducaoMB extends GenericMB {

	private Producao producao = new Producao();
	
	public Producao getProducao() {
		return producao;
	}

	public void setProducao(Producao producao) {
		this.producao = producao;
	}

	@Override
	protected Bean getBean() {	 
		return getProducao();
	}

	@Override
	protected void setBean(Bean b) {
		setProducao((Producao) b);
	}
	
	@Override
	public void setLista(List<Bean>lista) {
		
	}
	
}
