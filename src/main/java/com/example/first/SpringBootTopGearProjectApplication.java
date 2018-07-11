package com.example.first;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringBootTopGearProjectApplication implements CommandLineRunner {
	
	 @Autowired
	 private ApplicationContext appContext;

	public static void main(String[] args) {
		SpringApplication.run(SpringBootTopGearProjectApplication.class, args);
	}
	
	//Assignement 1 - Part 3
	//Prints the list of all the default beans that were created by Spring Boot automatically in the console
	@Override
    public void run(String... args) throws Exception {

        String[] beans = appContext.getBeanDefinitionNames();
        Arrays.sort(beans);
        for (String bean : beans) {
            System.out.println(bean);
        }

    }

}
