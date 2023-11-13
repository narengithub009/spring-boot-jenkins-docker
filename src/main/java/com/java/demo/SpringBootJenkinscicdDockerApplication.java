package com.java.demo;

import java.util.Date;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RequestMapping("/api")
public class SpringBootJenkinscicdDockerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootJenkinscicdDockerApplication.class, args);
	}
	@GetMapping("/msg")
	public String greeting() {
		System.out.println("welcome to Dockers hello world INV-22.0 branch"
				+ "!!!!!!!!!!!!!!!!"+new Date());
		return "welcome to Dockers hello world example !!!!!!!!!!!!!!!!";
	}
	
}
