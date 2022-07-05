package com.generation.farmacia.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "tb_produto")
public class ProdutoModel {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@NotNull
	@Size(min = 5, max = 100,message = "no minimo 5 letras e no maximo 100 letras")
	private String nome;
	
	@NotNull
	private double preço;
	
	@NotNull
	@Temporal(TemporalType.TIMESTAMP)
	private Date dataVencimento = new java.sql.Date(System.currentTimeMillis());
	
	@NotNull
	@Size(min = 5, max = 500,message = "no minimo 5 letras e no maximo 500 letras")
	private String provedores;
	
	@ManyToOne
	@JsonIgnoreProperties("produto")
	private CategoriaModel categoria;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getPreço() {
		return preço;
	}
	public void setPreço(double preço) {
		this.preço = preço;
	}
	public Date getDatavencimento() {
		return dataVencimento;
	}
	public void setDatavencimento(Date datavencimento) {
		this.dataVencimento = datavencimento;
	}
	public String getProvedores() {
		return provedores;
	}
	public void setProvedores(String provedores) {
		this.provedores = provedores;
	}
	public CategoriaModel getCategoria() {
		return categoria;
	}
	public void setCategoria(CategoriaModel categoria) {
		this.categoria = categoria;
	}
	
}
