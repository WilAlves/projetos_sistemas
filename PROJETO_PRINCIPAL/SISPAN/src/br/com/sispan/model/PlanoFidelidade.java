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
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Transient;

import br.com.sispan.interfaces.Bean;

@Entity
@Table 
//@SecondaryTable(name="health_care",pkJoinColumns={@PrimaryKeyJoinColumn(name="id")})
public class PlanoFidelidade implements Bean {

	/**
	 * 
	 */
	private static final long serialVersionUID = -915694646779406981L;

	@Id
	@GeneratedValue
	@Column(name="id_plano_fidelidade")
	private Long id;
	@Column(name = "nome_plano", nullable = false, length = 255, unique = true)
	private String nomePlano;
	@Column(name = "valor_aplicavel", precision = 4, nullable = false)
	private Float valorAplicavel;
	@Column(name = "ponto_aplicavel", precision = 0, nullable = false)
	private Integer pontoAplicavel ;
	@Column(name = "meta_ponto", precision = 0, nullable = false)
	private Integer metaPontos  ;
	@Column(name = "meta_periodo", precision = 0, nullable = false)
	private Integer metaPeriodo ;
	@Column(name = "meta_upgrade", precision = 0, nullable = false)
	private Integer metaUpgrade ;
	@Column(name = "meta_upgrade_pontos", precision = 0, nullable = false)
	private Integer metaUpgradePontos  ;
	@Column(name = "meta_downgrade", precision = 0, nullable = true)
	private Integer metaDowngrade = null;
	@ManyToMany
	@JoinTable(name="plano_has_produto",joinColumns={
			@JoinColumn(name="id_plano_fidelidade",nullable=false)},
		inverseJoinColumns={@JoinColumn(name="id_produto",nullable=false)})
	private List<Produto> listaPremiacoes = new ArrayList<Produto>();
	
	@ManyToOne
	@JoinColumn(name="id_promocao")
	private Promocao promocao;
	
	@Transient
	private boolean downgradable=false;
	
	@Transient
	private Produto premioRemovido;
	
	@Override
	public Long getId() {
		return id;
	}

	public String getNomePlano() {
		return nomePlano;
	}

	public void setNomePlano(String nomePLano) {
		this.nomePlano = nomePLano;
	}

	public Float getValorAplicavel() {
		return valorAplicavel;
	}

	public void setValorAplicavel(Float valorAplicavel) {
		this.valorAplicavel = valorAplicavel;
	}

	public Integer getPontoAplicavel() {
		return pontoAplicavel;
	}

	public void setPontoAplicavel(Integer pontoAplicavel) {
		this.pontoAplicavel = pontoAplicavel;
	}

	public Integer getMetaPontos() {
		return metaPontos;
	}

	public void setMetaPontos(Integer metaPontos) {
		this.metaPontos = metaPontos;
	}

	public Integer getMetaPeriodo() {
		return metaPeriodo;
	}

	public void setMetaPeriodo(Integer metaPeriodo) {
		this.metaPeriodo = metaPeriodo;
	}

	public Integer getMetaUpgrade() {
		return metaUpgrade;
	}

	public void setMetaUpgrade(Integer metaUpgrade) {
		this.metaUpgrade = metaUpgrade;
	}

	public Integer getMetaUpgradePontos() {
		return metaUpgradePontos;
	}

	public void setMetaUpgradePontos(Integer metaUpgradePontos) {
		this.metaUpgradePontos = metaUpgradePontos;
	}

	public Integer getMetaDowngrade() {
		return metaDowngrade;
	}

	public void setMetaDowngrade(Integer metaDowngrade) {
		this.metaDowngrade = metaDowngrade;
	}
	
	public boolean isDowngradable() {
		return downgradable;
	}	

	public List<Produto> getListaPremiacoes() {
		return listaPremiacoes;
	}

	public void setListaPremiacoes(List<Produto> listaPremiacoes) {
		this.listaPremiacoes = listaPremiacoes;
	}

	public void setDowngradable(boolean downgradable) {
		this.downgradable = downgradable;
	}
		
	public Promocao getPromocao() {
		return promocao;
	}

	public void setPromocao(Promocao promocao) {
		this.promocao = promocao;
	}
	
	

	@Override
	public String toString() {
		return  nomePlano; //String.valueOf(getId());
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
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
		PlanoFidelidade other = (PlanoFidelidade) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	

}
