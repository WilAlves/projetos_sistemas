package br.com.sispan.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
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
	@Column(name="ingredientedescricao",nullable = false, length = 255, unique = false)
	private String ingredientedescricao;
	@Column(name="ingredientequantidade", nullable = false, precision = 0)
	private Integer ingredientequantidade;
	@Column(name="ingredientetipo", nullable = false, length = 255, unique = false)
	private String ingredientetipo;
	
	@ManyToMany(mappedBy = "ingredientes")
	private List<Receita> receitas;
	
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


}
