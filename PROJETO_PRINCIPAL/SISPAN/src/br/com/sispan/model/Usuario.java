package br.com.sispan.model;

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
public class Usuario implements Bean {	
	/**
	 * 
	 */
	private static final long serialVersionUID = -478153217057072509L;
	
	@Id
	@GeneratedValue
	@Column(name="id_usuario")
	private Long id;
	

	@Column(name="login_usuario", nullable = false, length = 8, unique = true)
	private String loginUsuario;
	
	@Column(name="senha_usuario", nullable = false, length = 6, unique = true)
	private String senhaUsuario;
	
	@Column(name="Nome_usuario", nullable = false, length = 255, unique = false)
	private String nomeUsuario;
	
	@Column(name="cep_usuario", nullable = false, length = 9, unique = false)
	private String cepUsuario;
	
	@Column(name="endereco_usuario", nullable = false, length = 255, unique = false)
	private String enderecoUsuario;
	
	@Column(name="fone_usuario", nullable = false, length = 9, unique = true)
	private Integer foneUsuario;
	
	@Column(name="cpf_usuario", nullable = false, length = 11, unique = true)
	private String cpfUsuario;
	
	@Column(name="dataNascimento_usuario", nullable = false, length = 10, unique = false)
	private String dataNascimentoUsuario;

	public Long getId() {
		return id;
	}

	public String getDataNascimentoUsuario() {
		return dataNascimentoUsuario;
	}

	public void setDataNascimentoUsuario(String dataNascimentoUsuario) {
		this.dataNascimentoUsuario = dataNascimentoUsuario;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getLoginUsuario() {
		return loginUsuario;
	}

	public void setLoginUsuario(String loginUsuario) {
		this.loginUsuario = loginUsuario;
	}

	public String getSenhaUsuario() {
		return senhaUsuario;
	}

	public void setSenhaUsuario(String senhaUsuario) {
		this.senhaUsuario = senhaUsuario;
	}

	public String getNomeUsuario() {
		return nomeUsuario;
	}

	public void setNomeUsuario(String nomeUsuario) {
		this.nomeUsuario = nomeUsuario;
	}

	public String getCepUsuario() {
		return cepUsuario;
	}

	public void setCepUsuario(String cepUsuario) {
		this.cepUsuario = cepUsuario;
	}

	public String getEnderecoUsuario() {
		return enderecoUsuario;
	}

	public void setEnderecoUsuario(String enderecoUsuario) {
		this.enderecoUsuario = enderecoUsuario;
	}

	public Integer getFoneUsuario() {
		return foneUsuario;
	}

	public void setFoneUsuario(Integer foneUsuario) {
		this.foneUsuario = foneUsuario;
	}

	public String getCpfUsuario() {
		return cpfUsuario;
	}

	public void setCpfUsuario(String cpfUsuario) {
		this.cpfUsuario = cpfUsuario;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
		
}
