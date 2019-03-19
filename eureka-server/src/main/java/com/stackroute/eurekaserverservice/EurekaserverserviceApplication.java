package com.stackroute.eurekaserverservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class EurekaserverserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaserverserviceApplication.class, args);
	}

}
