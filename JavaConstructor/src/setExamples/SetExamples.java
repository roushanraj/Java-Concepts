package setExamples;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetExamples {

	public static void main(String[] args) {
		Set<String> set= new HashSet<String>();	//doesn't retain order
		
		//Linked HashSet remembers the order of the Insertion
		Set<String> linkset= new LinkedHashSet<String>();

		//Tree Set return in the natural sorted order 
		Set<String> treeset= new TreeSet<String>();
		
		if(linkset.isEmpty())
			System.out.println("Set is empty.");
		
		insertSet(set);
		insertSet(linkset);
		insertSet(treeset);
		
		System.out.println("Hash Set: "+set);		//return in random manner.
		System.out.println("Linked Hash Set: "+linkset);	//return in the order in which it was inserted.
		System.out.println("Tree Set: "+treeset);	//return in naturally sorted order. 
		
		
		
		for(String setoutput:linkset) {		//iterating using for
			System.out.println(setoutput);
		}
		
		////////to find if certain element exist///////
		if(linkset.contains("Dog")) {
			System.out.println("Dog Exists");
		}
		
		///////Intersection///////////
		linkset.add("Money");
		linkset.add("Snake");
		linkset.add("Crow");
		System.out.println(linkset);
		
		Set<String> intersection = new HashSet<String>(set);	//copying content of hash set to intersection
		intersection.retainAll(linkset);	//create intersection of linkset and intersection
		System.out.println(intersection);
		
		
		///////Difference////////////
		Set<String> difference = new HashSet<String>(linkset);
		difference.removeAll(set);
		System.out.println(difference);
		

	}
	
	private static void insertSet(Set<String> set) {
		set.add("Dog");
		set.add("Cat");
		set.add("Cow");
		set.add("Parrot");
		set.add("Goat");
		
		set.add("Goat");	//this is repeated item, But set is going to store only unique item regardless of redundant insertions.
		
		
	}

}
