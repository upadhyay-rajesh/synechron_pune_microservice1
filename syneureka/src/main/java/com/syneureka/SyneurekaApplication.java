package com.syneureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class SyneurekaApplication {

	public static void main(String[] args) {
		SpringApplication.run(SyneurekaApplication.class, args);
	}

}
