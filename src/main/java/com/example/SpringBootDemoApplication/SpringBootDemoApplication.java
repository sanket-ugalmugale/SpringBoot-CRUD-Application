package com.example.SpringBootDemoApplication;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.jdbc.autoconfigure.DataSourceAutoConfiguration;

@SpringBootApplication
public class SpringBootDemoApplication {

	public static void main(String[] args) {

		SpringApplication.run(SpringBootDemoApplication.class, args);
	}
}
