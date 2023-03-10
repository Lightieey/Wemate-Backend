package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.r2dbc.R2dbcAutoConfiguration;

@SpringBootApplication(exclude = {R2dbcAutoConfiguration.class},scanBasePackages = "com.example.demo")
//@SpringBootApplication(scanBasePackages = "com.example.demo") //어떤 패키지를 스캔해야 할지 명시해줘야 함 
//@EnableAutoConfiguration 
public class IpsApplication {

	public static void main(String[] args) {
		SpringApplication.run(IpsApplication.class, args);
		
		
	}

}
