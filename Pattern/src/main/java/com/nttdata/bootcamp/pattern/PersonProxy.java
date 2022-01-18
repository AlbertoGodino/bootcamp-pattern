package com.nttdata.bootcamp.pattern;

public class PersonProxy implements IPersonProxyInterface{
	
	private IPersonProxyInterface person;
	
	public PersonProxy (IPersonProxyInterface person) {
		this.person = person;
	}

	@Override
	public void operacion() {
		before();
		this.person.operacion();
		after();
		
	}
	
	public void before() {
		System.out.println("hola antes");
	};
	public void after() {
		System.out.println("hola después");
	};

}
