package com.example.factory;

import org.springframework.beans.factory.annotation.Value;

public class OneType implements Factory{
	
	@Value("${prop.value}")
	private String prop;

	@Override
	public void sayHello() {
		System.out.println("One Type saying hello!!!...");		
	}

	@Override
	public String echo(String msg) {
		System.out.println("printing property: " +prop + " from onetype");
		return "Echoing from type one..." + msg;
	}

}
