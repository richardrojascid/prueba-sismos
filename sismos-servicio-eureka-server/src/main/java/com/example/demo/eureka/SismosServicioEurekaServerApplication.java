package com.example.demo.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class SismosServicioEurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SismosServicioEurekaServerApplication.class, args);
	}

}
