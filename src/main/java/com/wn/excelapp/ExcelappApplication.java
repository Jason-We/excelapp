package com.wn.excelapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication(exclude = {SecurityAutoConfiguration.class })
@ComponentScan(basePackages = {"com.wn.excelapp.*"})
public class ExcelappApplication {

	public static void main(String[] args) {
		SpringApplication.run(ExcelappApplication.class, args);
	}

}
