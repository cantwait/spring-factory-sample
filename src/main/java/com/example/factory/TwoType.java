package com.example.factory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

public class TwoType implements Factory{
	
	@Value("${prop.value}")
	private String prop;
	
	@Autowired
	IntegrationOne integration;

	@Override
	public void sayHello() {
		System.out.println("Two Type saying hello!!!...");
	}

	@Override
	public String echo(String msg) {
		integration.integrate();
		System.out.println("printing property: " +prop + " from twotype");
		return "Echoing from type two..." + msg;
	}

}
