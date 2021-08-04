package mapsExample;

import java.util.HashMap;
import java.util.Map;

public class MapsExample {
	public static void main(String[] args) {
		HashMap<Integer, String> hashmap= new HashMap<Integer, String>();
		hashmap.put(1, "One");
		hashmap.put(2, "Two");
		hashmap.put(3, "Three");
		hashmap.put(4, "Four");
		hashmap.put(5, "Five");
		
		hashmap.put(5, "Five#1");	//this will override existing value
		
		System.out.println(hashmap.get(4));
		System.out.println(hashmap.get(8)); 	//this will return null beacuse key deosn't exist.
		System.out.println(hashmap.get(5));		//this return updated value
		
		System.out.println();
		
		///iterating through value
		for(Map.Entry<Integer, String> mapentry: hashmap.entrySet()) {
		
			System.out.println(mapentry);
			int key= mapentry.getKey();
			String name= mapentry.getValue();
			
			System.out.println(key);
			System.out.println(name);
		}
	}
}
