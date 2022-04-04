package br.com.controller;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import br.com.service.ConversorService;

@Controller
@RequestMapping("/mvc")
public class MVCConversorController {
	
	@Autowired
	private ConversorService conversorService;
	
	@GetMapping("/")
	public String index() {
		return "index"; 
	}
	
	@GetMapping("/convert")
	public ModelAndView converter(@RequestParam("valor") String valor) {
		ModelAndView modelAndView = new ModelAndView("index");
		modelAndView.addObject("convertido", conversorService.converterParaDolar(new BigDecimal(valor)));
		return modelAndView; 
	}
	
	
	
}
