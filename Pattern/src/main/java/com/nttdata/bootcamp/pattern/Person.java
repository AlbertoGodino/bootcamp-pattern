package com.nttdata.bootcamp.pattern;

public class Person implements IPrototype, IPersonInterface, IPersonProxyInterface{
	
	private static String name;
	private int age;
	
	public Person() {}
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	
	// Getter y Setter
	public String getName() {
		return name;
	}

	public static void setName(String name) {
		Person.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	/* ************************** */
	
	// Prototype
		@Override
		public IPrototype Clone() {
			Person p = new Person(this.name, this.age);
			return p;
		}
		
	/* ************************** */	
	
	// Patrón Builder
	private Person(PersonBuilder personBuilder) {
        super();
        this.name = personBuilder.name;
        this.age = personBuilder.age;
    }
	
	public static class PersonBuilder {
        private String name;
        private int age;
        public PersonBuilder name (String name) {
            this.name = name;
            return this;
        }
        public PersonBuilder age (int age) {
            this.age = age;
            return this;
        }
        public Person build () {
            return new Person(this);
        }
    }
	
	public static PersonBuilder builder() {
        return new PersonBuilder();
    }
	
	/* *************** */

	// del proxy
	@Override
	public void operacion() {
		System.out.println("Ejecutando operación");
		
	}

	
}
