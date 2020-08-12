package com.cg;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/****************************************************************************************************
 *          @author          Naveen J
 *          Description       @SpringBootApplication : it is similar to @Configuration + @EnableAutoConfiguration + @ComponentScan 
 *                            @Configuration : for dependency injection ( adding all dependencies)
 *                            @ComponentScan : it specifies to scan the current package
 *                            @EnableAutoConfiguration : auto-configures the beans   
 *                            @EnableJpaRepositories : used to enable the jparepositories which are outside the
 *                            scope of main class package        
 *          @version         1.0
 *          Created Date     05-AUG-2020
 ****************************************************************************************************/
@SpringBootApplication
@EnableJpaRepositories("com.cg.movie.dao")
public class MovieBootcampApplication {

	public static void main(String[] args) {
		final Logger logger = LoggerFactory.getLogger(MovieBootcampApplication.class);
		logger.info("this is a info message");
		logger.warn("this is a warning message");
		logger.error("this is a error message");
		SpringApplication.run(MovieBootcampApplication.class, args);
	}

}
