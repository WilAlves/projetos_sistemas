package br.com.sispan.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import br.com.sispan.interfaces.Bean;

@Entity
@Table
public class PlanoFidelidade implements Bean {

	/**
	 * 
	 */
	private static final long serialVersionUID = -915694646779406981L;

	@Id
	@GeneratedValue
	private Long id;
	@Column(name = "nome_plano", nullable = false, length = 255, unique = true)
	private String nomePlano;
	@Column(name = "valor_aplicavel", precision = 4, nullable = false)
	private Float valorAplicavel = 0.0f;
	@Column(name = "ponto_aplicavel", precision = 0, nullable = false)
	private Integer pontoAplicavel = 0;
	@Column(name = "meta_ponto", precision = 0, nullable = false)
	private Integer metaPontos = 0;
	@Column(name = "meta_periodo", precision = 0, nullable = false)
	private Integer metaPeriodo = 0;
	@Column(name = "meta_upgrade", precision = 0, nullable = false)
	private Integer metaUpgrade = -1;
	@Column(name = "meta_upgrade_pontos", precision = 0, nullable = false)
	private Integer metaUpgradePontos = -1;
	@Column(name = "meta_downgrade", precision = 0, nullable = false)
	private Integer metaDowngrade = null;

	@Override
	public Long getId() {
		// TODO Auto-generated method stub
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
	

}
