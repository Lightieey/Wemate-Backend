package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.r2dbc.R2dbcAutoConfiguration;

@SpringBootApplication(exclude = {R2dbcAutoConfiguration.class},scanBasePackages = "com.example.demo")
//@SpringBootApplication(scanBasePackages = "com.example.demo") //� ��Ű���� ��ĵ�ؾ� ���� �������� �� 
//@EnableAutoConfiguration 
public class IpsApplication {

	public static void main(String[] args) {
		SpringApplication.run(IpsApplication.class, args);
		
		
	}

}
