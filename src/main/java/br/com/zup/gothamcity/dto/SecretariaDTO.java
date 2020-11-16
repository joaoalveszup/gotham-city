package br.com.zup.gothamcity.dto;


import javax.persistence.EnumType;
import javax.persistence.Enumerated;

import br.com.zup.gothamcity.enums.Area;

public class SecretariaDTO {

	@Enumerated(EnumType.STRING)
	private Area area;
	private Double orcamentoProjeto;
	private Double orcamentoFolha;
	private String telefone;
	private String endereco;
	private String site;
	private String email;

	public Area getArea() {
		return area;
	}

	public void setArea(Area area) {
		this.area = area;
	}

	public Double getOrcamentoProjeto() {
		return orcamentoProjeto;
	}

	public void setOrcamentoProjeto(Double orcamentoProjeto) {
		this.orcamentoProjeto = orcamentoProjeto;
	}

	public Double getOrcamentoFolha() {
		return orcamentoFolha;
	}

	public void setOrcamentoFolha(Double orcamentoFolha) {
		this.orcamentoFolha = orcamentoFolha;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getSite() {
		return site;
	}

	public void setSite(String site) {
		this.site = site;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}


}
