package br.com.sispan.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import br.com.sispan.interfaces.Bean;

@Entity
@Table
public class Promocao implements Bean{

	/**
	 * 
	 */
	private static final long serialVersionUID = 7923439404821539194L;
	
	@Id
	@GeneratedValue
	@Column(name="id_promocao")
	private Long id; 
	
	@Column
	private String nome;
	
	@OneToMany(targetEntity = PlanoFidelidade.class, mappedBy="promocao",fetch= FetchType.EAGER,cascade=CascadeType.ALL)
	private List<PlanoFidelidade>listaPlanos = new ArrayList<PlanoFidelidade>();

	@Override
	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<PlanoFidelidade> getListaPlanos() {
		return listaPlanos;
	}

	public void setListaPlanos(List<PlanoFidelidade> listaPlanos) {
		this.listaPlanos = listaPlanos;
	}
	
	
	

}
