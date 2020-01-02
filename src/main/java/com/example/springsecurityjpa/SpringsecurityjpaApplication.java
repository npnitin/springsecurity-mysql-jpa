package com.example.springsecurityjpa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories("com.example.*")
public class SpringsecurityjpaApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringsecurityjpaApplication.class, args);
	}

}
