package transientKeyword;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Serialization {	//write objects to file

	public static void main(String[] args) {
		Person p1= new Person(7, "Roushan Raj");
		Person p2= new Person(8, "Rounak Raj");
		Person.setCount(7);
		
		System.out.println(p1);
		System.out.println(p2);
		
		try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("Person.bin"))){
			
			oos.writeObject(p1);
			oos.writeObject(p2);
			
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
