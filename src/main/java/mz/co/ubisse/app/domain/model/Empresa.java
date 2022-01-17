package mz.co.ubisse.app.domain.model;
import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Empresa {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long codigo;
	private String activacao_facturacao;
	private String activacao_geral;
	private String banco1;
	private String banco2;
	private String banco3;
	private String banco4;
	private String celular;
	private String celular2;
	private String celular3;
	private String cidade;
	private String conta1;
	private String conta2;
	private String conta3;
	private String email;
	private String fax;
	private String isencao;
	private int iva_incluso;
	private String letra_codigo;
	private String modo_funcionamento;
	private String modulo;
	private String morada;
	private String nib1;
	private String nib2;
	private String nib3;
	private String nib4;
	private String nome;
	private int nuit;
	private String pais;
	private String regime;
	private String slogan;
	private String telefone;
	private String website;
	private String controlo_do_stock;
	private int modelo_do_documento;
	private String sem_formacao;
	private String controlo_de_estoque_pela_factura;
	private String controlo_de_estoque_pela_factura_simplificada;
	private String controlo_de_estoque_pela_guia;
	private String controlo_de_estoque_pela_vd;
	private String impressao_a4;
	private String impressora_termica;
	private String bin;
	private String controlar_validade;
	private LocalDate zoe1;
	private LocalDate zoe2;
	private String localhost;
	private String mysql_versao;
	private String ajax_da_quantidade_na_venda;
	private String ajax_do_preco_unitario_na_venda;
	private String casas_decimais_na_quatidade;
	private int casas_decimais_na_venda;
	private int tempo_do_ajax;
	private int guia_valor_incluso;
	private int tamanho_impressora_termica;
	
	

	
	

}
