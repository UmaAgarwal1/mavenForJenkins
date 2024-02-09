package com.maven.jenkins;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class MavenForJenkinsApplication {

	@GetMapping
	public String message() {
		return "Hi ,I am springboot application";
	}

	public static void main(String[] args) {
		SpringApplication.run(MavenForJenkinsApplication.class, args);
	}

}
