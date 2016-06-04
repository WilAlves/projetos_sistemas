package br.com.sispan.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import br.com.sispan.interfaces.Bean;


@Entity
@Table
public class Receita implements Bean {
	
	private static final long serialVersionUID = -478153217057072509L;

	@Id
	@GeneratedValue
	@Column(name="receitaid")
	private Long receitaid;
	@Column(name="receitadescricao")
	private String receitadescricao;
	@Column(name="receitatipo")
	private String receitatipo;
	@Column(name="receitamodofazer")
	private String receitamodofazer;
	
	@Override
	public Long getId() {
		// TODO Auto-generated method stub
		return receitaid;
	}

	public Long getReceitaid() {
		return receitaid;
	}

	public void setReceitaid(Long receitaid) {
		this.receitaid = receitaid;
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
