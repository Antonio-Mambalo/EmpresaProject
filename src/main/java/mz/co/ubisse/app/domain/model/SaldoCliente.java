package mz.co.ubisse.app.domain.model;

import java.math.BigDecimal;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class SaldoCliente {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long codigo;

	@Column(name = "estado", length = 1)
	private boolean estado;

	@Column(name = "valor_credito" )
	private BigDecimal valorCredito;

	@Column(name = "valor_debito")
	private BigDecimal valorDebito;

	@Column(name = "valor_total")
	private BigDecimal valorTotal;

	@OneToOne(fetch = FetchType.EAGER)
	private Cliente cliente;

	public long getCodigo() {
		return codigo;
	}

	public void setCodigo(long codigo) {
		this.codigo = codigo;
	}

	public boolean isEstado() {
		return estado;
	}

	public void setEstado(boolean estado) {
		this.estado = estado;
	}

	public BigDecimal getValorCredito() {
		return valorCredito;
	}

	public void setValorCredito(BigDecimal valorCredito) {
		this.valorCredito = valorCredito;
	}

	public BigDecimal getValorDebito() {
		return valorDebito;
	}

	public void setValorDebito(BigDecimal valorDebito) {
		this.valorDebito = valorDebito;
	}

	public BigDecimal getValorTotal() {
		return valorTotal;
	}

	public void setValorTotal(BigDecimal valorTotal) {
		this.valorTotal = valorTotal;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
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
		SaldoCliente other = (SaldoCliente) obj;
		return codigo == other.codigo;
	}

}
