package com.nttdata.bootcamp.pattern;

import com.nttdata.bootcamp.pattern.*;

public class Test {
	
	public static void main(String[] args) {
		
		// vamos a utilizar el singleton
		SingletonPerson.getInstance().setName("Alberto");
		SingletonPerson.getInstance().setAge(42);
		
		System.out.println("me llamo " + SingletonPerson.getInstance().getName() + " con edad: " + SingletonPerson.getInstance().getAge());
		
		/* Utilizamos prototype */

		Person persona1 = Person.builder().age(35).name("Pablo").build();
		Person personaPro = (Person) persona1.Clone();
		
		System.out.println("Me llamo " + persona1.getName() + "y mi dirección de memoria es " + persona1);
		System.out.println("Me llamo " + persona1.getAge() + "y mi dirección de memoria es " + personaPro);
		
		// Para el patrón builder
		Person personBuilder = Person.builder().age(33).name("Alberto 25").build();
		System.out.println("Nombre: " + personBuilder.getName());
		System.out.println("Edad: " + personBuilder.getAge());
		
		
		// para el unit
		Unit soldado = new Unit("soldado");
		Unit sargento = new Unit("sargento", soldado);
		Unit capitan = new Unit("capitan", sargento);
		capitan.executeCommand("Accion");
		
		// Prueba del uso del patrón decorator
		Person person3 = new Person("Raul", 25);
		PersonDecorator persondecorator1 = new PersonDecorator(person3);
		System.out.println(persondecorator1.getName());
		System.out.println(persondecorator1.getAge());
		
		// Patrón proxy
		PersonProxy personProxy = new PersonProxy(persona1);
		personProxy.operacion();

	}
	
	

}
