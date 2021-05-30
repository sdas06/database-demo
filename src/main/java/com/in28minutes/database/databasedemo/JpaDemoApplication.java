package com.in28minutes.database.databasedemo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.in28minutes.database.databasedemo.jpa.PersonJpaRepository;
@SpringBootApplication
public class JpaDemoApplication implements CommandLineRunner{
	
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	PersonJpaRepository repository;
	
	public static void main(String[] args) {
		SpringApplication.run(JpaDemoApplication.class, args);
		
		System.out.println("****Running  JpaDemoApplication Application****");
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("****Running  JpaDemoApplication Application--CommandLineRunner****");
		logger.info("User id 10001 through JPA -> {}", repository.findByIds(10001));
		
		logger.info("All users -> {}", repository.findAll());
		
	}

}
