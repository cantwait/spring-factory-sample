package com.example.factory;

import org.springframework.beans.factory.annotation.Autowired;

@org.springframework.stereotype.Service
public class ServiceImpl implements Service{
	
	@Autowired
	private Factory factory;

	@Override
	public void printHelloMsg() {
		factory.sayHello();		
	}

	@Override
	public String getFactoryMessage(String msg) {
		return factory.echo(msg);
	}

}
