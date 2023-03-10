package com.example.demo.configuration;

import java.sql.Connection;
import java.sql.DriverManager;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@Configuration
@EnableJpaAuditing
public class DatabaseConfiguration {
	    public void test() throws Exception {
	        Class.forName("org.mariadb.jdbc.Driver"); // 마리아DB
	        Connection con = DriverManager.getConnection("jdbc:mariadb://ips.csvcpbtn5bj6.ap-northeast-2.rds.amazonaws.com:3306/ips?characterEncoding=UTF-8&serverTimezone=UTC", "admin", "ips12341234"); // 마리아 DB
	        System.out.println(con);                                     
	    }
}
