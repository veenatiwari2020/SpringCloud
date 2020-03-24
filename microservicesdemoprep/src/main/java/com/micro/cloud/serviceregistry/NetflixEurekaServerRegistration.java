package com.micro.cloud.serviceregistry;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class NetflixEurekaServerRegistration {
	
	 public static void main(String[] args) {
	        SpringApplication.run(NetflixEurekaServerRegistration.class, args);
	    }

}
