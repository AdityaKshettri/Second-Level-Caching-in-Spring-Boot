package com.aditya.project.caching;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
public class SecondLevelCachingApplication {

	public static void main(String[] args) {
		SpringApplication.run(SecondLevelCachingApplication.class, args);
	}

}
