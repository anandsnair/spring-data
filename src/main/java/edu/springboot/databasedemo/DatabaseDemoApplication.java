package edu.springboot.databasedemo;

import org.hibernate.Session;
import org.hibernate.cfg.Configuration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

import edu.springboot.databasedemo.model.Alien;

@SpringBootApplication
@ComponentScan
@EnableJpaAuditing
public class DatabaseDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DatabaseDemoApplication.class, args);
		
	}
}
