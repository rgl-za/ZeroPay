package com.example.ZeroPay;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude={DataSourceAutoConfiguration.class})
public class ZeroPayApplication {

	public static void main(String[] args) {
		SpringApplication.run(ZeroPayApplication.class, args);
	}

}
