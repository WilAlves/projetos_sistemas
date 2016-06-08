package br.com.sispan.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import br.com.sispan.interfaces.Bean;

@Entity
@Table
public class Ingrediente implements Bean{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue
	private Long Id;
	@Column(name="ingredientedescricao",nullable = false, length = 255, unique = true)
	private String ingredientedescricao;
	@Column(name="ingredientequantidade", nullable = false, precision = 0)
	private Integer ingredientequantidade;
	@Column(name="ingredientetipo", nullable = false, length = 255, unique = true)
	private String ingredientetipo;
	/*@Column(name="ReceitaIngrediente", nullable = false)
	private Integer ReceitaIngrediente;
	@Column(name="ProducaoIngrediente", nullable = false)
	private Integer ProducaoIngrediente;*/
	
	@Override
	public Long getId() {
		// TODO Auto-generated method stub
		return Id;
	}


	public void setIngredienteId(Long ingredienteId) {
		Id = ingredienteId;
	}

	public String getIngredientedescricao() {
		return ingredientedescricao;
	}

	public void setIngredientedescricao(String ingredientedescricao) {
		this.ingredientedescricao = ingredientedescricao;
	}

	public Integer getIngredientequantidade() {
		return ingredientequantidade;
	}

	public void setIngredientequantidade(Integer ingredientequantidade) {
		this.ingredientequantidade = ingredientequantidade;
	}

	public String getIngredientetipo() {
		return ingredientetipo;
	}

	public void setIngredientetipo(String ingredientetipo) {
		this.ingredientetipo = ingredientetipo;
	}

	/*public Integer getReceitaIngrediente() {
		return ReceitaIngrediente;
	}

	public void setReceitaIngrediente(Integer receitaIngrediente) {
		ReceitaIngrediente = receitaIngrediente;
	}

	public Integer getProducaoIngrediente() {
		return ProducaoIngrediente;
	}

	public void setProducaoIngrediente(Integer producaoIngrediente) {
		ProducaoIngrediente = producaoIngrediente;
	}*/

}
