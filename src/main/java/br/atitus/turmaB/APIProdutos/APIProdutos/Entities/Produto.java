package br.atitus.turmaB.APIProdutos.APIProdutos.Entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "produto")
public class Produto extends GenericEntity {
	
	private static final long serialVersionUID = 1l;
	
	@Column(nullable = true)
	private double valorUnitario;
	
	@Column(nullable = true, length = 200)
	private String unidadeMedida;
	
	@Column(nullable = true, length = 200)
	private String Descricao;

	public double getValorUnitario() {
		return valorUnitario;
	}
	public void setValorUnitario(double valorUnitario) {
		this.valorUnitario = valorUnitario;
	}
	public String getUnidadeMedida() {
		return unidadeMedida;
	}
	public void setUnidadeMedida(String unidadeMedida) {
		this.unidadeMedida = unidadeMedida;
	}
	public String getDescricao() {
		return Descricao;
	}
	public void setDescricao(String descricao) {
		Descricao = descricao;
	}	
}