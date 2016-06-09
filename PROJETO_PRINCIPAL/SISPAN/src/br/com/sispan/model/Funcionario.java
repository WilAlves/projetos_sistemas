package br.com.sispan.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
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
	
	@Column(name="matricula_funcionario", nullable = false, length = 8, unique = true)
	private Integer matriculaFuncionario;
	
	@Column(name="cargo_funcionario", nullable = false, length = 50, unique = true)
	private String cargoFuncionario;
		
	@Column(name="ctps_funcionario", nullable = false, length = 10, unique = true)
	private Integer ctpsFuncionario;
	
	@Column(name="rg_funcionario", nullable = false, length = 12, unique = true)
	private Integer rgFuncionario;
	
	
	@OneToOne(cascade=CascadeType.REFRESH)
	@JoinColumn(name="id_usuario")
	private Usuario usuario;
	
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Integer getMatriculaFuncionario() {
		return matriculaFuncionario;
	}

	public void setMatriculaFuncionario(Integer matriculaFuncionario) {
		this.matriculaFuncionario = matriculaFuncionario;
	}

	public String getCargoFuncionario() {
		return cargoFuncionario;
	}

	public void setCargoFuncionario(String cargoFuncionario) {
		this.cargoFuncionario = cargoFuncionario;
	}

	public Integer getCtpsFuncionario() {
		return ctpsFuncionario;
	}

	public void setCtpsFuncionario(Integer ctpsFuncionario) {
		this.ctpsFuncionario = ctpsFuncionario;
	}

	public Integer getRgFuncionario() {
		return rgFuncionario;
	}

	public void setRgFuncionario(Integer rgFuncionario) {
		this.rgFuncionario = rgFuncionario;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
