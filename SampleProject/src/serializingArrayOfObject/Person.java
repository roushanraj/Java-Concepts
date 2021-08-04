package serializingArrayOfObject;

import java.io.Serializable;

public class Person implements Serializable{ //To make a class Serializable we implement the interface names "Serializable"
	private int id;
	private String name;
	public Person(int id, String name) {
		this.id = id;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + "]";
	}
	

	
	
}
