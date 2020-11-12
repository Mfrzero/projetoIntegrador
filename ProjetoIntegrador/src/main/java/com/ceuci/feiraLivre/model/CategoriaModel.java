package com.ceuci.feiraLivre.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;


@Entity
@Table(name="categoria")
public class CategoriaModel {
	
	//ATRIBUTOS
	@Id
	@Column
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column
	@NotNull
	public String categoria;
	
	@Column
	public boolean organico;
	
	@Column
	public String unidadeMedida;
	
//	@OneToMany(mappedBy = "categoria", cascade = CascadeType.ALL)
//	@JsonIgnoreProperties("categoria")
//	private List<ProdutoModel> produto;
	
	
	//get e set

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTipo() {
		return categoria;
	}

	public void setTipo(String tipo) {
		this.categoria = tipo;
	}

	public boolean isOrganico() {
		return organico;
	}

	public void setOrganico(boolean organico) {
		this.organico = organico;
	}

	public String getUnidadeMedida() {
		return unidadeMedida;
	}

	public void setUnidadeMedida(String unidade_medida) {
		this.unidadeMedida = unidade_medida;
	}
	
	
	
	
	

}
