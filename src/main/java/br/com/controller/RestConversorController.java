package br.com.controller;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.service.ConversorService;

@RestController
@RequestMapping("/convert")
public class RestConversorController {
	
	@Autowired
	private ConversorService conversorService;
	
	@GetMapping()
	public BigDecimal converter(@RequestParam("valor") String valor) {
		return conversorService.converterParaDolar(new BigDecimal(valor)); 
	}
	
	
	
}
