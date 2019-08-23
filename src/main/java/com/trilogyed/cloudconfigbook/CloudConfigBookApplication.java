package com.trilogyed.cloudconfigbook;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class CloudConfigBookApplication {

	public static void main(String[] args) {
		SpringApplication.run(CloudConfigBookApplication.class, args);
	}

}
