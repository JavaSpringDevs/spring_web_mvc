package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.example.demo.controller.UserController;

@SpringBootApplication
public class SpringFormApplication {

	public static void main(String[] args) {
	ApplicationContext  ctx =	SpringApplication.run(SpringFormApplication.class, args);
	
	UserController controller = (UserController) ctx.getBean("userController");
	}

}
