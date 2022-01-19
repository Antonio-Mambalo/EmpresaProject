package mz.co.ubisse.app.domain.model;

import java.time.LocalDate;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.EqualsAndHashCode;

@Entity
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Empresa {

	@EqualsAndHashCode.Include
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long codigo;
	
	@Column(name = "activacao_facturacao", length = 15)
	private String activacaoFacturacao;
	
	@Column(name = "activacao_geral", length = 15)
	private String activacaoGeral;
	
	@Column(name = "banco1", length = 20)
	private String banco1;
	
	@Column(name = "banco2", length = 20)
	private String banco2;
	
	@Column(name = "banco3", length = 20)
	private String banco3;
	
	@Column(name = "banco4", length = 20)
	private String banco4;
	
	@Column(name = "celular", length = 20)
	private String celular;
	
	@Column(name = "celular2", length = 15)
	private String celular2;
	
	@Column(name = "celular3", length = 15)
	private String celular3;
	
	@Column(name = "cidade", length = 20)
	private String cidade;
	
	@Column(name = "conta1", length = 20)
	private String conta1;
	
	@Column(name = "conta2", length = 20)
	private String conta2;
	
	@Column(name = "conta3", length = 20)
	private String conta3;
	
	@Column(name = "email", length = 30)
	private String email;
	
	@Column(name = "fax", length = 15)
	private String fax;
	
	@Column(name = "isencao", length = 20)
	private String isencao;
	
	@Column(name = "ivaIncluso", length = 1)
	private int ivaIncluso;
	
	@Column(name = "letra_codigo", length = 2)
	private String letraCodigo;
	
	@Column(name = "modoFuncionamento", length = 10)
	private String modoFuncionamento;
	
	@Column(name = "modulo", length = 15)
	private String modulo;
	
	@Column(name = "morada", length = 50)
	private String morada;
	
	@Column(name = "nib1", length = 30)
	private String nib1;
	
	@Column(name = "nib2", length = 30)
	private String nib2;
	
	@Column(name = "nib3", length = 30)
	private String nib3;
	
	@Column(name = "nib4", length = 30)
	private String nib4;
	
	@Column(name = "nome", length = 50)
	private String nome;
	
	@Column(name = "nuit")
	private int nuit;
	
	@Column(name = "pais", length = 50)
	private String pais;
	
	@Column(name = "regime", length = 30)
	private String regime;
	
	@Column(name = "solgan", length = 50)
	private String slogan;
	
	@Column(name = "telefone", length = 15)
	private String telefone;
	
	@Column(name = "website", length = 30)
	private String website;
	
	@Column(name = "control_de_estoque", length = 1)
	private String controloDoStock;
	
	@Column(name = "modelo_do_documento")
	private int modeloDoDocumento;
	
	@Column(name = "sem_formacao", length = 1)
	private String semFormacao;
	
	@Column(name = "controlo_de_estoque_pela_factura", length = 1)
	private String controloDeEstoquePelaFactura;
	
	@Column(name = "controlo_de_estoque_pela_factura_simplificada", length = 1)
	private String controlo_de_estoque_pela_factura_simplificada;
	
	@Column(name = "controlo_de_estoque_pela_guia", length = 1)
	private String controlo_de_estoque_pela_guia;
	
	@Column(name = "controlo_de_estoque_pela_vd", length = 1)
	private String controlo_de_estoque_pela_vd;
	
	@Column(name = "impressora_a4", length = 100)
	private String impressao_a4;
	
	@Column(name = "impressora_termica", length = 100)
	private String impressora_termica;
	
	@Column(name = "bin", length = 10)
	private String bin;
	
	@Column(name = "controlar_validade", length = 255)
	private String controlar_validade;
	
	@Column(name = "zoe1")
	private LocalDate zoe1;
	
	@Column(name = "zoe2")
	private LocalDate zoe2;
	
	@Column(name = "localhost", length = 100)
	private String localhost;
	
	@Column(name = "mysql_versao", length = 10)
	private String mysql_versao;
	
	@Column(name = "ajax_da_quantidade_na_venda", length = 10)
	private String ajax_da_quantidade_na_venda;
	
	@Column(name = "ajax_do_preco_unitario_na_venda", length = 10)
	private String ajax_do_preco_unitario_na_venda;
	
	@Column(name = "casas_decimais_na_quatidade", length = 10)
	private String casas_decimais_na_quatidade;
	
	@Column(name = "casas_decimais_na_venda")
	private int casas_decimais_na_venda;
	
	@Column(name = "tempo_do_ajax")
	private int tempo_do_ajax;
	
	@Column(name = "guia_valor_incluso")
	private int guia_valor_incluso;
	
	@Column(name = "tamanho_impressora_termica")
	private int tamanho_impressora_termica;
	
	public long getCodigo() {
		return codigo;
	}
	public void setCodigo(long codigo) {
		this.codigo = codigo;
	}
	public String getActivacaoFacturacao() {
		return activacaoFacturacao;
	}
	public void setActivacaoFacturacao(String activacaoFacturacao) {
		this.activacaoFacturacao = activacaoFacturacao;
	}
	public String getActivacaoGeral() {
		return activacaoGeral;
	}
	public void setActivacaoGeral(String activacaoGeral) {
		this.activacaoGeral = activacaoGeral;
	}
	public String getBanco1() {
		return banco1;
	}
	public void setBanco1(String banco1) {
		this.banco1 = banco1;
	}
	public String getBanco2() {
		return banco2;
	}
	public void setBanco2(String banco2) {
		this.banco2 = banco2;
	}
	public String getBanco3() {
		return banco3;
	}
	public void setBanco3(String banco3) {
		this.banco3 = banco3;
	}
	public String getBanco4() {
		return banco4;
	}
	public void setBanco4(String banco4) {
		this.banco4 = banco4;
	}
	public String getCelular() {
		return celular;
	}
	public void setCelular(String celular) {
		this.celular = celular;
	}
	public String getCelular2() {
		return celular2;
	}
	public void setCelular2(String celular2) {
		this.celular2 = celular2;
	}
	public String getCelular3() {
		return celular3;
	}
	public void setCelular3(String celular3) {
		this.celular3 = celular3;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public String getConta1() {
		return conta1;
	}
	public void setConta1(String conta1) {
		this.conta1 = conta1;
	}
	public String getConta2() {
		return conta2;
	}
	public void setConta2(String conta2) {
		this.conta2 = conta2;
	}
	public String getConta3() {
		return conta3;
	}
	public void setConta3(String conta3) {
		this.conta3 = conta3;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getFax() {
		return fax;
	}
	public void setFax(String fax) {
		this.fax = fax;
	}
	public String getIsencao() {
		return isencao;
	}
	public void setIsencao(String isencao) {
		this.isencao = isencao;
	}
	public int getIvaIncluso() {
		return ivaIncluso;
	}
	public void setIvaIncluso(int ivaIncluso) {
		this.ivaIncluso = ivaIncluso;
	}
	public String getLetraCodigo() {
		return letraCodigo;
	}
	public void setLetraCodigo(String letraCodigo) {
		this.letraCodigo = letraCodigo;
	}
	public String getModoFuncionamento() {
		return modoFuncionamento;
	}
	public void setModoFuncionamento(String modoFuncionamento) {
		this.modoFuncionamento = modoFuncionamento;
	}
	public String getModulo() {
		return modulo;
	}
	public void setModulo(String modulo) {
		this.modulo = modulo;
	}
	public String getMorada() {
		return morada;
	}
	public void setMorada(String morada) {
		this.morada = morada;
	}
	public String getNib1() {
		return nib1;
	}
	public void setNib1(String nib1) {
		this.nib1 = nib1;
	}
	public String getNib2() {
		return nib2;
	}
	public void setNib2(String nib2) {
		this.nib2 = nib2;
	}
	public String getNib3() {
		return nib3;
	}
	public void setNib3(String nib3) {
		this.nib3 = nib3;
	}
	public String getNib4() {
		return nib4;
	}
	public void setNib4(String nib4) {
		this.nib4 = nib4;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getNuit() {
		return nuit;
	}
	public void setNuit(int nuit) {
		this.nuit = nuit;
	}
	public String getPais() {
		return pais;
	}
	public void setPais(String pais) {
		this.pais = pais;
	}
	public String getRegime() {
		return regime;
	}
	public void setRegime(String regime) {
		this.regime = regime;
	}
	public String getSlogan() {
		return slogan;
	}
	public void setSlogan(String slogan) {
		this.slogan = slogan;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getWebsite() {
		return website;
	}
	public void setWebsite(String website) {
		this.website = website;
	}
	public String getControloDoStock() {
		return controloDoStock;
	}
	public void setControloDoStock(String controloDoStock) {
		this.controloDoStock = controloDoStock;
	}
	public int getModeloDoDocumento() {
		return modeloDoDocumento;
	}
	public void setModeloDoDocumento(int modeloDoDocumento) {
		this.modeloDoDocumento = modeloDoDocumento;
	}
	public String getSemFormacao() {
		return semFormacao;
	}
	public void setSemFormacao(String semFormacao) {
		this.semFormacao = semFormacao;
	}
	public String getControloDeEstoquePelaFactura() {
		return controloDeEstoquePelaFactura;
	}
	public void setControloDeEstoquePelaFactura(String controloDeEstoquePelaFactura) {
		this.controloDeEstoquePelaFactura = controloDeEstoquePelaFactura;
	}
	public String getControlo_de_estoque_pela_factura_simplificada() {
		return controlo_de_estoque_pela_factura_simplificada;
	}
	public void setControlo_de_estoque_pela_factura_simplificada(String controlo_de_estoque_pela_factura_simplificada) {
		this.controlo_de_estoque_pela_factura_simplificada = controlo_de_estoque_pela_factura_simplificada;
	}
	public String getControlo_de_estoque_pela_guia() {
		return controlo_de_estoque_pela_guia;
	}
	public void setControlo_de_estoque_pela_guia(String controlo_de_estoque_pela_guia) {
		this.controlo_de_estoque_pela_guia = controlo_de_estoque_pela_guia;
	}
	public String getControlo_de_estoque_pela_vd() {
		return controlo_de_estoque_pela_vd;
	}
	public void setControlo_de_estoque_pela_vd(String controlo_de_estoque_pela_vd) {
		this.controlo_de_estoque_pela_vd = controlo_de_estoque_pela_vd;
	}
	public String getImpressao_a4() {
		return impressao_a4;
	}
	public void setImpressao_a4(String impressao_a4) {
		this.impressao_a4 = impressao_a4;
	}
	public String getImpressora_termica() {
		return impressora_termica;
	}
	public void setImpressora_termica(String impressora_termica) {
		this.impressora_termica = impressora_termica;
	}
	public String getBin() {
		return bin;
	}
	public void setBin(String bin) {
		this.bin = bin;
	}
	public String getControlar_validade() {
		return controlar_validade;
	}
	public void setControlar_validade(String controlar_validade) {
		this.controlar_validade = controlar_validade;
	}
	public LocalDate getZoe1() {
		return zoe1;
	}
	public void setZoe1(LocalDate zoe1) {
		this.zoe1 = zoe1;
	}
	public LocalDate getZoe2() {
		return zoe2;
	}
	public void setZoe2(LocalDate zoe2) {
		this.zoe2 = zoe2;
	}
	public String getLocalhost() {
		return localhost;
	}
	public void setLocalhost(String localhost) {
		this.localhost = localhost;
	}
	public String getMysql_versao() {
		return mysql_versao;
	}
	public void setMysql_versao(String mysql_versao) {
		this.mysql_versao = mysql_versao;
	}
	public String getAjax_da_quantidade_na_venda() {
		return ajax_da_quantidade_na_venda;
	}
	public void setAjax_da_quantidade_na_venda(String ajax_da_quantidade_na_venda) {
		this.ajax_da_quantidade_na_venda = ajax_da_quantidade_na_venda;
	}
	public String getAjax_do_preco_unitario_na_venda() {
		return ajax_do_preco_unitario_na_venda;
	}
	public void setAjax_do_preco_unitario_na_venda(String ajax_do_preco_unitario_na_venda) {
		this.ajax_do_preco_unitario_na_venda = ajax_do_preco_unitario_na_venda;
	}
	public String getCasas_decimais_na_quatidade() {
		return casas_decimais_na_quatidade;
	}
	public void setCasas_decimais_na_quatidade(String casas_decimais_na_quatidade) {
		this.casas_decimais_na_quatidade = casas_decimais_na_quatidade;
	}
	public int getCasas_decimais_na_venda() {
		return casas_decimais_na_venda;
	}
	public void setCasas_decimais_na_venda(int casas_decimais_na_venda) {
		this.casas_decimais_na_venda = casas_decimais_na_venda;
	}
	public int getTempo_do_ajax() {
		return tempo_do_ajax;
	}
	public void setTempo_do_ajax(int tempo_do_ajax) {
		this.tempo_do_ajax = tempo_do_ajax;
	}
	public int getGuia_valor_incluso() {
		return guia_valor_incluso;
	}
	public void setGuia_valor_incluso(int guia_valor_incluso) {
		this.guia_valor_incluso = guia_valor_incluso;
	}
	public int getTamanho_impressora_termica() {
		return tamanho_impressora_termica;
	}
	public void setTamanho_impressora_termica(int tamanho_impressora_termica) {
		this.tamanho_impressora_termica = tamanho_impressora_termica;
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
		Empresa other = (Empresa) obj;
		return codigo == other.codigo;
	}
	
	
	

}
