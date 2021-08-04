package serializingArrayOfObject;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class Deserialization {	//read object from file 
	public static void main(String[] args) {
		try (FileInputStream fi1= new FileInputStream("Person.bin")){
			ObjectInputStream ois = new ObjectInputStream(fi1);
			
			Person[] persons = (Person[])ois.readObject();
			ArrayList<Person> personsList= (ArrayList<Person>)ois.readObject();
			ois.close();
			
			
			
			for (Person list: persons){
				System.out.println(list);
			}
			for (Person list: personsList){
				System.out.println(list);
			}
			
			
			
		} catch (FileNotFoundException e) {
			
		} catch (IOException e) {
			System.out.println("some kind of IO exception");
		} catch (ClassNotFoundException e) { // if we try to read the class which type is not defined by us then it is going to throw this exception
			System.out.println("Class not found");
		}
		
	}
}
