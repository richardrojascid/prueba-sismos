package com.example.sismos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * Clase escencial para arrancar la aplicaci�n (clase Main)
 */
@EnableEurekaClient
@SpringBootApplication
public class SismosApplication {

	public static void main(String[] args) {
		SpringApplication.run(SismosApplication.class, args);
	}

}
