package mz.co.ubisse.app.domain.model;


import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Fornecedor {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long codigo;
	
	@Column(name = "data_cadastro")
	private boolean dataCadastro;
	
	@Column(name = "estado")
	private String estado;
	
	@ManyToOne(fetch = FetchType.LAZY ,cascade = CascadeType.PERSIST )
	@JoinColumn(name = "pessoa_id")
	private Pessoa pessoa;

	
	public long getCodigo() {
		return codigo;
	}

	public void setCodigo(long codigo) {
		this.codigo = codigo;
	}

	public boolean isDataCadastro() {
		return dataCadastro;
	}

	public void setDataCadastro(boolean dataCadastro) {
		this.dataCadastro = dataCadastro;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public Pessoa getPessoa() {
		return pessoa;
	}

	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}
	
	
}
