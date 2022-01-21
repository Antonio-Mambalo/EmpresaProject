package mz.co.ubisse.app.domain.model;

import java.time.LocalDate;
import java.util.List;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;

@Entity
public class Pessoa {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long codigo;
	
	@ManyToOne
	@JoinColumn(name ="empresa_id")
	private Empresa empresa;
	
	@OneToMany
	private List<Cliente> cliente;
	
	@OneToMany
	private List<Fornecedor> fornecedor;
	
	 
	
	@Column(name = "apelido", length = 20)
	private String apelido;
	
	@Column(name = "bairro", length = 20)
	private String bairro;
	
	@Column(name = "celular", length = 15)
	private String celular;
	
	@Column(name = "cidade", length = 20)
	private String cidade;
	
	@Column(name = "data_nascimento")
	private LocalDate dataNascimento;
	
	@Column(name = "email", length = 30)
	private String email;
	
	@Column(name = "estado_civil", length = 12)
	private String estadoCivil;
	
	@Column(name = "genero", length = 10)
	private String genero;
	
	@Column(name = "identificacao", length = 10)
	private String identificacao;
	
	@Column(name = "localidade", length = 80)
	private String localidade;
	
	@Column(name = "morada", length = 80)
	private String morada;
	
	@Column(name = "nome", length = 200)
	private String nome;
	
	@Column(name = "nuit", length = 20)
	private String nuit;
	
	@Column(name = "pais", length = 50)
	private String pais;
	
	@Column(name = "telefone", length = 15)
	private String telefone;
	
	

	public List<Cliente> getCliente() {
		return cliente;
	}

	public void setCliente(List<Cliente> cliente) {
		this.cliente = cliente;
	}

	public List<Fornecedor> getFornecedor() {
		return fornecedor;
	}

	public void setFornecedor(List<Fornecedor> fornecedor) {
		this.fornecedor = fornecedor;
	}

	public long getCodigo() {
		return codigo;
	}

	public void setCodigo(long codigo) {
		this.codigo = codigo;
	}

	public Empresa getEmpresa() {
		return empresa;
	}

	public void setEmpresa(Empresa empresa) {
		this.empresa = empresa;
	}

	public String getApelido() {
		return apelido;
	}

	public void setApelido(String apelido) {
		this.apelido = apelido;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getCelular() {
		return celular;
	}

	public void setCelular(String celular) {
		this.celular = celular;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public LocalDate getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(LocalDate dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getEstadoCivil() {
		return estadoCivil;
	}

	public void setEstadoCivil(String estadoCivil) {
		this.estadoCivil = estadoCivil;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getIdentificacao() {
		return identificacao;
	}

	public void setIdentificacao(String identificacao) {
		this.identificacao = identificacao;
	}

	public String getLocalidade() {
		return localidade;
	}

	public void setLocalidade(String localidade) {
		this.localidade = localidade;
	}

	public String getMorada() {
		return morada;
	}

	public void setMorada(String morada) {
		this.morada = morada;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNuit() {
		return nuit;
	}

	public void setNuit(String nuit) {
		this.nuit = nuit;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	@Override
	public int hashCode() {
		return Objects.hash(codigo);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pessoa other = (Pessoa) obj;
		return codigo == other.codigo;
	}
	
	
	

}
