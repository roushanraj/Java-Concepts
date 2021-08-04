package serializingArrayOfObject;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Arrays;

public class Serialization {	//write objects to file

	public static void main(String[] args) {

		Person[] persons= {new Person(7,"Roushan Raj"),new Person(8,"Rounak Raj"),new Person(9,"Dharm Raj")};
		
		ArrayList<Person> personList= new ArrayList<Person>(Arrays.asList(persons));
		
		try (FileOutputStream fo1= new FileOutputStream("Person.bin")){
			ObjectOutputStream oos = new ObjectOutputStream(fo1);
			
			oos.writeObject(persons);
			oos.writeObject(personList);
			
			oos.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
