package br.com.service;

import com.fasterxml.jackson.annotation.JsonProperty;

import br.com.model.Moeda;

public class Cotacao {
	
	@JsonProperty("USDBRL")
	private Moeda moeda;

	public Moeda getMoeda() {
		return moeda;
	}

	public void setMoeda(Moeda moeda) {
		this.moeda = moeda;
	}

	@Override
	public String toString() {
		return "Cotacao [moeda=" + moeda + "]";
	}
	
	
	
}
