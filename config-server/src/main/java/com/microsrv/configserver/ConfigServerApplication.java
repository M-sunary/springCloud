package com.microsrv.configserver;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;


@SpringBootApplication
@EnableEurekaServer
public class ConfigServerApplication {

	private static Logger logger = LoggerFactory.getLogger(ConfigServerApplication.class);

	public static void main(String[] args) {
		logger.info("这里是服务注册中心:{}",ConfigServerApplication.logger.getName());
		SpringApplication.run(ConfigServerApplication.class, args);
	}
}
