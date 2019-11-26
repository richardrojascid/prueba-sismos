package com.example.sismos;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * Archivo de configuracion para hacer uso de restTemplate y crear 
 * cliente de consumo de serevicio.
 * @author Inovabiz
 *
 */

@Configuration
public class AppConfig {
	@Bean(name = "restTemplate")
	public RestTemplate restTemplate(){
		return new RestTemplate();
	}
}
