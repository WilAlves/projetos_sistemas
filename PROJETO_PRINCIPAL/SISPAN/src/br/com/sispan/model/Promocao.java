<<<<<<< fdb1d44f614dbfb97c3ee95972ab947843b782c7
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
=======
package br.com.sispan.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import br.com.sispan.interfaces.Bean;

@Entity
@Table
public class Promocao implements Bean {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7923439404821539194L;

	@Id
	@GeneratedValue
	@Column(name = "id_promocao")
	private Long id;
	@Column
	private String nome;
	@Column(name = "data_inicio", nullable = false)
	@Temporal(TemporalType.TIMESTAMP)
	private Date dataInicio;
	@Column(name = "data_fim", nullable = true)
	@Temporal(TemporalType.TIMESTAMP)
	private Date dataFim;
	@OneToMany(targetEntity = PlanoFidelidade.class, mappedBy = "promocao", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	private List<PlanoFidelidade> publicoAlvo = new ArrayList<PlanoFidelidade>();
	@ManyToMany
	@JoinTable(name = "promocao_has_produto", joinColumns = {
			@JoinColumn(name = "id_promocao", nullable = false) }, inverseJoinColumns = {
					@JoinColumn(name = "id_produto", nullable = false) })
	private List<Produto> produtosParticipantes = new ArrayList<Produto>();

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

	public List<PlanoFidelidade> getPublicoAlvo() {
		return publicoAlvo;
	}

	public void setPublicoAlvo(List<PlanoFidelidade> publicoAlvo) {
		this.publicoAlvo = publicoAlvo;
	}

	public Date getDataInicio() {
		return dataInicio;
	}

	public void setDataInicio(Date dataInicio) {
		this.dataInicio = dataInicio;
	}

	public Date getDataFim() {
		return dataFim;
	}

	public void setDataFim(Date dataFim) {
		this.dataFim = dataFim;
	}

	public List<Produto> getProdutosParticipantes() {
		return produtosParticipantes;
	}

	public void setProdutosParticipantes(List<Produto> produtosParticipantes) {
		this.produtosParticipantes = produtosParticipantes;
	}	
}
>>>>>>> tela de cadastro de planos concluida
