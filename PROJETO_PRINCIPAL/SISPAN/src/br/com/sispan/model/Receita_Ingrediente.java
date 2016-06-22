package br.com.sispan.model;

import javax.persistence.Column;

import br.com.sispan.interfaces.Bean;

public class Receita_Ingrediente implements Bean{

	private static final long serialVersionUID = -2744344728474235725L;
	/**
	 * 
	 */

	@Column(name="ReceitaID", nullable = false)
	private Integer receiraId;
	@Column(name="Ingrediente_Id", nullable = false)
	private Integer Ingrediente_Id;
	
	@Override
	public Long getId() {
		// TODO Auto-generated method stub
		return null;
	}
	public Integer getReceiraId() {
		return receiraId;
	}
	public void setReceiraId(Integer receiraId) {
		this.receiraId = receiraId;
	}
	public Integer getIngrediente_Id() {
		return Ingrediente_Id;
	}
	public void setIngrediente_Id(Integer ingrediente_Id) {
		Ingrediente_Id = ingrediente_Id;
	}
	
	
		
}
