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
public class Receita implements Bean {
	
	private static final long serialVersionUID = -478153217057072509L;

	@Id
	@GeneratedValue
	private Long receitaid;
	@Column(name="receitadescricao",nullable = false, length = 255, unique = true)
	private String receitadescricao;
	@Column(name="receitatipo", nullable = false, length = 255, unique = true)
	private String receitatipo;
	@Column(name="receitamodofazer", nullable = false, length = 255, unique = true)
	private String receitamodofazer;
	
	@ManyToMany(mappedBy = "receitas")
	private List<Producao> producoes;
	
	@Override
	public Long getId() {
		// TODO Auto-generated method stub
		return receitaid;
	}

	public String getReceitadescricao() {
		return receitadescricao;
	}

	public void setReceitadescricao(String receitadescricao) {
		this.receitadescricao = receitadescricao;
	}

	public String getReceitatipo() {
		return receitatipo;
	}

	public void setReceitatipo(String receitatipo) {
		this.receitatipo = receitatipo;
	}

	public String getReceitamdfazer() {
		return receitamodofazer;
	}

	public void setReceitamdfazer(String receitamdfazer) {
		this.receitamodofazer = receitamdfazer;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
