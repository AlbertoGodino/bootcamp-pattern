package com.nttdata.bootcamp.pattern;

public class PersonDecorator {
	
	private Person person;
	
	public PersonDecorator(Person person) {
		this.person = person;
	}
	
	public String getName() {
		return "Nombre: " + this.person.getName();
	}
	
	public int getAge() {
		return this.person.getAge()*100;
	}

}
