package com.homeloan;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
@ComponentScan("com.homeloan.repo")
public class HomeLoanAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(HomeLoanAppApplication.class, args);
	}

}
