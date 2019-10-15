package com.boot;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
@MapperScan(basePackages = "com.*.mapper")
@ComponentScan(basePackages = "com")
public class GradleBootApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(GradleBootApplication.class, args);
		
	}

}
