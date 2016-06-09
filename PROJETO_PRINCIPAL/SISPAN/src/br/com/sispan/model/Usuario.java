package br.com.sispan.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
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
	
	@Column(name="login_usuario")
	private String loginUsuario;
	
	@Column(name="senha_usuario")
	private String senhaUsuario;
	
	@Column(name="Nome_usuario")
	private String nomeUsuario;
	
	@Column(name="cep_usuario")
	private String cepUsuario;
	
	@Column(name="endereco_usuario")
	private String enderecoUsuario;
	
	@Column(name="fone_usuario")
	private String foneUsuario;
	
	@Column(name="cpf_usuario")
	private String cpfUsuario;
	
	@Column(name="dataNascimento_usuario")
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

	public String getFoneUsuario() {
		return foneUsuario;
	}

	public void setFoneUsuario(String foneUsuario) {
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
