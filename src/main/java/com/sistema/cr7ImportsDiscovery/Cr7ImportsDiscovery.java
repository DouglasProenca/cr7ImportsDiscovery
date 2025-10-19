package com.sistema.cr7ImportsDiscovery;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class Cr7ImportsDiscovery {

	public static void main(String[] args) {
		SpringApplication.run(Cr7ImportsDiscovery.class, args);
	}

}
