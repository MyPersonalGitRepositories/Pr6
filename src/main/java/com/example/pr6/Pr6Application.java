package com.example.pr6;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;


@SpringBootApplication
public class Pr6Application {

	public static void main(String[] args) {
		ApplicationContext applicationContext = SpringApplication.run(Pr6Application.class, args);

		UserService userService = applicationContext.getBean(UserService.class);
		UserEntity user = userService.createUser("firstName1", "lastName1", "email1@example.com");
		userService.createUser("Maksym", "Pidlisnyi", "p.maxsym@gmail.com");
		userService.createUser("Jim", "Smith", "asmith@gmail.com");
		userService.createUser("Sam", "Smith", "alexsmith@gmail.com");
		userService.createUser("Leo", "Green", "green@gmail.com");
		System.out.println("All users: " + userService.findAllUsers());
		System.out.println("Smith users: " + userService.findByName("Smith"));
		System.out.println("A users: " + userService.findAUsers("a"));
		System.out.println("Saved new user: " + user);

	}

}
