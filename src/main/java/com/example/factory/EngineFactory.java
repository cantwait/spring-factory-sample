package com.example.factory;


public class EngineFactory {
	
	private Factory factory;
	
	
	private EngineFactory(){
		
	}
	
	public Factory getFactory(){
		return this.factory;
	}
	
	public EngineFactory(String factoryType){
		switch (factoryType) {
		case "one":
			factory = new OneType();
			break;
		case "two":
			factory = new TwoType();
			break;
		default:
			break;
		}
	}


}
