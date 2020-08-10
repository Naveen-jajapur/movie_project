package com.cg;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories("com.cg.movie.dao")
public class MovieBootcampApplication {

	public static void main(String[] args) {
		SpringApplication.run(MovieBootcampApplication.class, args);
	}

}
