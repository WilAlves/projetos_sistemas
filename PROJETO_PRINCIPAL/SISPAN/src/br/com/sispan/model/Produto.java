package br.com.sispan.model;
 

import java.util.List;

import java.util.ArrayList;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import br.com.sispan.interfaces.Bean;

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
	
	@Column(name = "descricao", nullable = false, length = 255, unique = false)
	private String descricao="";
	
	@Column(name = "unidade", nullable = false, length = 255, unique = false)
	private String unidade="";
	
	@Column(name = "quantidade", precision = 0, nullable = false)
	private Integer quantidade = 0;
	
	@Column(name = "preco_compra", precision = 4, nullable = false)
	private Float preco_compra = 0.0f;
	
	@Column(name = "preco_venda", precision = 4, nullable = false)
	private Float preco_venda = 0.0f;
	
	
	
	@ManyToMany(mappedBy="produtos")

	private List<Fornecedor> fornecedores = new ArrayList<Fornecedor>();
	
	public List<Fornecedor> getFornecedor() {
		return fornecedores;
	}
	public void setFornecedores(List<Fornecedor> fornecedores) {
		this.fornecedores = fornecedores;
	}
		
	@ManyToMany(fetch=FetchType.LAZY,mappedBy="listaPremiacoes")
	private List<PlanoFidelidade>  planos;

	@ManyToMany(fetch=FetchType.LAZY,mappedBy="produtosParticipantes")
	private List<Promocao>promocoes;

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
	public Float getPreco_compra() {
		return preco_compra;
	}
	public void setPreco_compra(Float preco_compra) {
		this.preco_compra = preco_compra;
	}
	public Float getPreco_venda() {
		return preco_venda;
	}
	public void setPreco_venda(Float preco_venda) {
		this.preco_venda = preco_venda;
	}
	public Integer getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}

	public String getUnidade() {
		return unidade;
	}
	public void setUnidade(String unidade) {
		this.unidade = unidade;
	}
	
	@Override
	public String toString(){
		return this.descricao;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((descricao == null) ? 0 : descricao.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Produto other = (Produto) obj;
		if (descricao == null) {
			if (other.descricao != null)
				return false;
		} else if (!descricao.equals(other.descricao))
			return false;
		return true;
	}
}