package br.com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@EnableWebMvc
@SpringBootApplication
public class ConversorApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConversorApplication.class, args);
	}

	@Bean
	   public RestTemplate getRestTemplate() {
	      return new RestTemplate();
	   }
	
}
