package br.com.sispan.model;

import java.util.ArrayList;
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
public class Fornecedor implements Bean {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue
	private Long id;
	
	@Column(name = "nome_fantasia", nullable = false, length = 255, unique = true)
	private String nome_fantasia;
	
	@Column(name = "cnpj", nullable = false, length = 255, unique = true)
	private String cnpj;
	
	@Column(name = "inscricao_estadual", nullable = false, length = 255, unique = true)
	private String inscricao_estadual;
	
	@Column(name = "telefone", nullable = false, length = 255, unique = true)
	private String telefone;
	
	@Column(name = "endereco", nullable = false, length = 255, unique = true)
	private String endereco;
	
	@Column(name = "email", nullable = false, length = 255, unique = true)
	private String email;
	
	public String getInscricao_estadual() {
		return inscricao_estadual;
	}

	public void setInscricao_estadual(String inscricao_estadual) {
		this.inscricao_estadual = inscricao_estadual;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	
	
	
	
	@ManyToMany
    @JoinTable(name="supplier_product",
    		joinColumns={@JoinColumn(name="idprod")},
    		inverseJoinColumns={@JoinColumn(name="idsupp")})    
  
    private List<Produto> produtos = new ArrayList<Produto>();
    
    public List<Produto> getProduto() {
		return produtos;
	}

	public void setProdutos(List<Produto> produtos) {
		this.produtos = produtos;
	};
	
	
	//Metodos de GET e SET...
	public Long getId() {
		// TODO Auto-generated method stub
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getCNPJ() {
		return cnpj;
	}
	public void setCNPJ(String cnpj) {
		this.cnpj = cnpj;
	}
	public String getNome_fantasia() {
		return nome_fantasia;
	}
	public void setNome_fantasia(String nome_fantasia) {
		this.nome_fantasia = nome_fantasia;
	}
	
	
}