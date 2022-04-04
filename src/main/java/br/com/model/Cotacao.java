package br.com.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Cotacao {
	
	@JsonProperty("USD")
	private Moeda USD;

	public Moeda getMoeda() {
		return USD;
	}

	public void setMoeda(Moeda moeda) {
		this.USD = moeda;
	}

	@Override
	public String toString() {
		return "Cotacao [moeda=" + USD + "]";
	}
	
	
	
}
