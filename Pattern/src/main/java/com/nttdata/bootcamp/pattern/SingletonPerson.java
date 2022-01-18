package com.nttdata.bootcamp.pattern;

public class SingletonPerson {
	
	private static Person INSTANCE;
	
	// Private constructor
	private SingletonPerson() {}
	
	public static Person getInstance() {
		
		if(INSTANCE == null) {
			INSTANCE = new Person();
		}
		return INSTANCE;
	}

}
