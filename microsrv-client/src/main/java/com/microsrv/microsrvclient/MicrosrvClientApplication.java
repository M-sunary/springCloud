package com.microsrv.microsrvclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class MicrosrvClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicrosrvClientApplication.class, args);
	}
}
