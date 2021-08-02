package generics;

import java.util.ArrayList;

class Machines{
	 
 }
 class Camera{
	 
 }
public class GenericsAndWildCards {
	public static void main(String[] args) {
		ArrayList<String> animal = new ArrayList<String>();
		animal.add("Lion");
		animal.add("Tiger");
		animal.add("Puma");
		
		showList(animal);
		
		ArrayList<Machine> machineList = new ArrayList<Machine>();
		machineList.add(new Machine());		//going to return toString method (By default which is hash code of the object)
		machineList.add(new Machine());
		machineList.add(new Machine());
		
		showList1(machineList);
		
		
		
		
	}
	public static void showList(ArrayList<String> list) {
		for (String value:list)
			System.out.println(value);
	}
	public static void showList1(ArrayList<?> list) {		// here "?" is a wildcard which implies that any kind of Class can be the parameter in the generics
		for (Object value:list)		//we are using "Object" Class because it is parent of every class.
			System.out.println(value);
	}
}
