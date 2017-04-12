package com.capgemini;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.capgemini")
public class DuckairlinesApplication {

	public static void main(String[] args) {
		SpringApplication.run(DuckairlinesApplication.class, args);
	}
}
