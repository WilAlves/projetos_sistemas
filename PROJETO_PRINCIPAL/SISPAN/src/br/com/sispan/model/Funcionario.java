package br.com.sispan.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import br.com.sispan.interfaces.Bean;

@Entity
@Table

public class Funcionario implements Bean {
	
	private static final long serialVersionUID = -478153217057072509L;
	
	@Id
	@GeneratedValue
	@Column(name="id_funcionario")
	private Long id;
	
	@Column(name="matricula_funcionario")
	private String matriculaFuncionario;
	
	@Column(name="cargo_funcionario")
	private String cargoFuncionario;
		
	@Column(name="ctps_funcionario")
	private String ctpsFuncionario;
	
	@Column(name="rg_funcionario")
	private String rgFuncionario;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getMatriculaFuncionario() {
		return matriculaFuncionario;
	}

	public void setMatriculaFuncionario(String matriculaFuncionario) {
		this.matriculaFuncionario = matriculaFuncionario;
	}

	public String getCargoFuncionario() {
		return cargoFuncionario;
	}

	public void setCargoFuncionario(String cargoFuncionario) {
		this.cargoFuncionario = cargoFuncionario;
	}

	public String getCtpsFuncionario() {
		return ctpsFuncionario;
	}

	public void setCtpsFuncionario(String ctpsFuncionario) {
		this.ctpsFuncionario = ctpsFuncionario;
	}

	public String getRgFuncionario() {
		return rgFuncionario;
	}

	public void setRgFuncionario(String rgFuncionario) {
		this.rgFuncionario = rgFuncionario;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}