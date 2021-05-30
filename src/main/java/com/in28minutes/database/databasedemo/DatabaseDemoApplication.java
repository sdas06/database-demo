package com.in28minutes.database.databasedemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.in28minutes.database.databasedemo.jdbc.PersonJbdcDao;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
//@SpringBootApplication
public class DatabaseDemoApplication implements CommandLineRunner{

	
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	PersonJbdcDao dao;
	
	public static void main(String[] args) {
		SpringApplication.run(DatabaseDemoApplication.class, args);
		System.out.println("****Running Application****");
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		logger.info("All users -> {}", dao.findAll());
		
		logger.info("1001 id -> {}", dao.findById(10001));
		
		logger.info("Location Hyderabad -> {}", dao.findLocations("Hyderabad"));
		
		logger.info(" delete 1001 id -> {}", dao.deleteById(10002,"Pieter"));
		
		
		
	}

}
