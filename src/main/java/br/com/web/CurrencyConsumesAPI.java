package br.com.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import br.com.model.Moeda;

@Component
public class CurrencyConsumesAPI {
	
	@Autowired
	private RestTemplate restTemplate;
	
	private final String URL = "https://economia.awesomeapi.com.br/json/daily/USD-BRL/1";
	
	public Moeda consultaInfo() {
		Moeda[] responseEntity = restTemplate.getForObject(URL, Moeda[].class);
		return responseEntity[0];
	}
	
}
