package com.cts.security;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages= {"com.cts.security.Controller"})
public class SpringjwtApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringjwtApplication.class, args);
	}

}
