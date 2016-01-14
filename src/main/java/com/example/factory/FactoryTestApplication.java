package com.example.factory;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class FactoryTestApplication {
	
	@Value("${factory.type.name}")
	private String factoryType;

	public static void main(String[] args) {
		SpringApplication.run(FactoryTestApplication.class, args);
	}
	
	@Bean
	public Factory factoryType(){
		return new EngineFactory(factoryType).getFactory();
	}
	
	
}
