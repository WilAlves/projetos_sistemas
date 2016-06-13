package br.com.sispan.model;

import java.util.List;
import java.util.ArrayList;

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
public class Producao implements Bean {
	
	private static final long serialVersionUID = -478153217057072509L;

	@Id
	@GeneratedValue
	private Long Produto_id;
	@Column(name="Produto_descricao", nullable = false, length = 255, unique = true)
	private String Produto_descricao;
	@Column(name="Produto_tipo", nullable = false, length = 255, unique = true)
	private String Produto_tipo;
	@Column(name="Produto_quantidade", nullable = false, length = 255, unique = true)
	private String Produto_quantidade;
	@Column(name="Produto_status", nullable = false, length = 255, unique = true)
	private String Produto_status;
	
	@ManyToMany
	@JoinTable(name= "Ingrediente",joinColumns = {@JoinColumn(name= "ProducaoIngrediente")},
	inverseJoinColumns = {@JoinColumn(name = "ReceitaIngrediente")})
	private List<Receita> receitas;
	
	@Override
	public Long getId() {
		// TODO Auto-generated method stub
		return Produto_id;
	}

	public String getProduto_descricao() {
		return Produto_descricao;
	}

	public void setProduto_descricao(String produto_descricao) {
		Produto_descricao = produto_descricao;
	}

	public String getProduto_tipo() {
		return Produto_tipo;
	}

	public void setProduto_tipo(String produto_tipo) {
		Produto_tipo = produto_tipo;
	}

	public String getProduto_quantidade() {
		return Produto_quantidade;
	}

	public void setProduto_quantidade(String produto_quantidade) {
		Produto_quantidade = produto_quantidade;
	}

	public String getProduto_status() {
		return Produto_status;
	}

	public void setProduto_status(String produto_status) {
		Produto_status = produto_status;
	}

}
