package arrayListEx;

import java.util.ArrayList;

public class ArrayListExample {
	public static void main(String[] args) {
		ArrayList<Integer> intlist= new ArrayList<Integer>(); //we use non-primitive type ie. we used "Integer" instead of "int".
		intlist.add(10);
		intlist.add(11);
		intlist.add(13);
		intlist.add(15);
		intlist.add(16);
		
		System.out.println(intlist.get(1));
		
		////////////////////////////////
		System.out.println("Method 1");
		for(Integer integers: intlist)
		{
			System.out.println(integers);
		}
		
		////////////////////////////////
		System.out.println("Method 2");
		for(int i=0;i<intlist.size();i++)
		{
			System.out.println(intlist.get(i));
		}
		
		//removing first element
		intlist.remove(0); //this is slow because after deleting first element we have to shift every element.
		
		//removing last element
		intlist.remove(intlist.size()-1); //this is fast because the size of arraylist will just decrease by 1.
			
	}
}
