package br.com.service;

import java.math.BigDecimal;
import java.math.RoundingMode;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.model.Moeda;
import br.com.web.CurrencyConsumesAPI;

@Service
public class ConversorService {
	
	
	@Autowired
	private CurrencyConsumesAPI currencyConsumesAPI;

	public BigDecimal converterParaDolar(BigDecimal valor) {
		Moeda dolar = currencyConsumesAPI.consultaInfo();
		BigDecimal bid = new BigDecimal(dolar.getBid()); 
		BigDecimal calculo = retornaConversaoDoValorPeloBid(bid, valor); 
		return calculo;
	}

	private BigDecimal retornaConversaoDoValorPeloBid(BigDecimal bid, BigDecimal valor) {
		return valor.divide(bid, 2, RoundingMode.HALF_UP);
	}

}
