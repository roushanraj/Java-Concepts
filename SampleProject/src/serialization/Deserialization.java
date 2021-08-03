package serialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Deserialization {	//read object from file 
	public static void main(String[] args) {
		try (FileInputStream fi1= new FileInputStream("Person.bin")){
			ObjectInputStream ois = new ObjectInputStream(fi1);
			
			Person p1= (Person)ois.readObject();
			Person p2= (Person)ois.readObject();
			ois.close();
			
			//Person p3= (Person)ois.readObject(); this will throw IO exception because we have only stored to objects in our example.
			
			System.out.println(p1);
			System.out.println(p2);
			
		} catch (FileNotFoundException e) {
			
		} catch (IOException e) {
			System.out.println("some kind of IO exception");
		} catch (ClassNotFoundException e) { // if we try to read the class which type is not defined by us then it is going to throw this exception
			System.out.println("Class not found");
		}
		
	}
}
