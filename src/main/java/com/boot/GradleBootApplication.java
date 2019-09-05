package com.boot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.user.service.dao.UserDao;

@SpringBootApplication
public class GradleBootApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(GradleBootApplication.class, args);
		
	}

}
