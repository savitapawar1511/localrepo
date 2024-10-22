package com.technosignia.Resume;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class ResumeApplication {
	
	@GetMapping
	 public String display() {
		return "This is my first deployment project in aws";
	}


	public static void main(String[] args) {
		SpringApplication.run(ResumeApplication.class, args);
	}

}
