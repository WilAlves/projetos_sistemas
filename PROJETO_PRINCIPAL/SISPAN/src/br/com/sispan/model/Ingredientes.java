package br.com.sispan.model;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import br.com.sispan.interfaces.Bean;

@Entity
@Table
public class Ingredientes implements Bean {


	private static final long serialVersionUID = -478153217057072509L;
	
	@Id
	@GeneratedValue
	@Column(name="ingredienteid")
	private Long ingredienteid;
	@Column(name="ingredientedescricao")
	private String ingredientedescricao;
	@Column(name="ingredientequantidade")
	private String ingredientequantidade;
	@Column(name="ingredientetipo")
	private String ingredientetipo;
	@JoinColumn(name="ingredineteproducaoid")
	private String ingredineteproducaoid;
	@JoinColumn(name="ingredientereceitaid")
	private String ingredientereceitaid;
	
	
	
	@Override
	public Long getId() {
		// TODO Auto-generated method stub
		return ingredienteid;
	}
	 @ManyToMany(targetEntity=Ingredientes.class)
	   private Set ingredienteSet;
	
	public Long getIngredientesid() {
		return ingredienteid;
	}

	public Long getIngredienteId() {
		return ingredienteid;
	}

	public void setIngredienteId(Long ingredienteId) {
		this.ingredienteid = ingredienteId;
	}

	public String getIngredienteDescricao() {
		return ingredientedescricao;
	}

	public void setIngredienteDescricao(String ingredienteDescricao) {
		this.ingredientedescricao = ingredienteDescricao;
	}

	public String getIngredienteqtd() {
		return ingredientequantidade;
	}

	public void setIngredienteqtd(String ingredienteqtd) {
		this.ingredientequantidade = ingredienteqtd;
	}

	public String getIngredientetipo() {
		return ingredientetipo;
	}

	public void setIngredientetipo(String ingredientetipo) {
		this.ingredientetipo = ingredientetipo;
	}

	public String getIngredineteproducaoid() {
		return ingredineteproducaoid;
	}

	public void setIngredineteproducaoid(String ingredineteproducaoid) {
		this.ingredineteproducaoid = ingredineteproducaoid;
	}

	public String getIngredientereceitaid() {
		return ingredientereceitaid;
	}

	public void setIngredientereceitaid(String ingredientereceitaid) {
		this.ingredientereceitaid = ingredientereceitaid;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	
}
