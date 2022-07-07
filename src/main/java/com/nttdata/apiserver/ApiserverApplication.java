package com.nttdata.apiserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * Api server.
 */
@EnableDiscoveryClient
@SpringBootApplication
public class ApiserverApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiserverApplication.class, args);
	}

}
