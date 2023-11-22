package com.diningroom.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class DiningRoomEurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(DiningRoomEurekaServerApplication.class, args);
	}

}
