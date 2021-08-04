package transientKeyword;

import java.io.Serializable;

public class Person implements Serializable{ //To make a class Serializable we implement the interface names "Serializable"
	private transient int id;	//this will not be serialized because of the transient keyword
	private String name;
	private static int count;	//this will not be serialized because it is a static variable.
	
	public Person(int id, String name) {
		this.id = id;
		this.name = name;
	}
	
	
	public static void setCount(int count) {
		Person.count = count;
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + "] count= "+count;
	}
	

	
	
}
