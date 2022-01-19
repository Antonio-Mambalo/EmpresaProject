package mz.co.ubisse.app.domain.model;

import java.time.LocalDateTime;
import java.util.Objects;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
public class Cliente {
	
	  @Id
	  @GeneratedValue(strategy = GenerationType.IDENTITY)
	  private int codigo;
	  
	  @Column(name = "cliente_nome")
	  private String nome;
	  
	  @Column(name = "cliente_dataCadastro")
	  @DateTimeFormat(pattern = "yyyy-MM-dd")
	  private LocalDateTime dataCadastro;
	  
	  @Column(name = "cliente_estado", length = 1)
	  private int estado;
	  
	  @Column(name = "cliente_saldoCliente")
	  private double saldoCliente;	
	  
	  @ManyToOne(fetch = FetchType.LAZY)
	  @JoinColumn(name = "codigo_id")	
	  private Pessoa pessoa;

	 
	  
	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public LocalDateTime getDataCadastro() {
		return dataCadastro;
	}

	public void setDataCadastro(LocalDateTime dataCadastro) {
		this.dataCadastro = dataCadastro;
	}

	public int getEstado() {
		return estado;
	}

	public void setEstado(int estado) {
		this.estado = estado;
	}

	public double getSaldoCliente() {
		return saldoCliente;
	}

	public void setSaldoCliente(double saldoCliente) {
		this.saldoCliente = saldoCliente;
	}

	public Pessoa getPessoa() {
		return pessoa;
	}

	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
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
		Cliente other = (Cliente) obj;
		return codigo == other.codigo;
	}
	  
	  

}
