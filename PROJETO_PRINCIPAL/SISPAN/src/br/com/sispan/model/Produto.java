package br.com.sispan.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import br.com.sispan.interfaces.Bean;
import javax.persistence.ManyToMany;

@Entity
@Table
public class Produto implements Bean {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 */

	@Id
	@GeneratedValue
	private Long id;
	
	@Column(name = "descricao", nullable = false, length = 255, unique = true)
	private String descricao;
	
	@Column(name = "valor", precision = 4, nullable = false)
	private Float valor = 0.0f;
	
	@Column(name = "quantidade", precision = 0, nullable = false)
	private Integer quantidade = 0;
	
	
	@ManyToMany(mappedBy="produtos")

	private List<Fornecedor> fornecedores = new ArrayList<Fornecedor>();
	
	public List<Fornecedor> getFornecedor() {
		return fornecedores;
	}
	public void setFornecedores(List<Fornecedor> fornecedores) {
		this.fornecedores = fornecedores;
	}
		
	//Metodos de GET e SET...
	public Long getId() {
		// TODO Auto-generated method stub
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public Float getValor() {
		return valor;
	}
	public void setValor(Float valor) {
		this.valor = valor;
	}
	public Integer getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}
}