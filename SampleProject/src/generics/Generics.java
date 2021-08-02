package generics;

import java.util.ArrayList;

class Machine{
	
}

public class Generics {

	public static void main(String[] args) {
		
		//////////////before java 5/////////////
		ArrayList fruits= new ArrayList();
		fruits.add("Apple");
		fruits.add("Orange");
		fruits.add("Pineapple");
		
		String name= (String)fruits.get(1); //.get funtion returns object so we typecast it to string.
		
		System.out.println(name);
		
		///////Modern Style/////////
		ArrayList<String> animals = new ArrayList<String>();
		animals.add("Horse");
		animals.add("Lion");
		animals.add("Tiger");
		
		String animalname=animals.get(1);
		System.out.println(animalname);
		
		//////java 7 style///////////
		ArrayList<String> plants= new ArrayList<>();	//no need to mention the class type in generics parameter 2 times

		ArrayList<Machine> machines= new ArrayList<>();	//The parameter takes class name, Here we used Machine class as defined in this program above.
		
		

	}

}
