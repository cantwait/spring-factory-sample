package com.example.factory;

import org.springframework.beans.factory.annotation.Value;

public class TwoType implements Factory{
	
	@Value("${prop.value}")
	private String prop;

	@Override
	public void sayHello() {
		System.out.println("Two Type saying hello!!!...");
	}

	@Override
	public String echo(String msg) {
		System.out.println("printing property: " +prop + " from twotype");
		return "Echoing from type two..." + msg;
	}

}
