package sortedMapsExample;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class SortedMapExample {
	public static void main(String[] args) {
		HashMap<Integer, String> hashmap= new HashMap<Integer, String>();
		LinkedHashMap<Integer, String> linkedhashmap= new LinkedHashMap<Integer, String>();
		TreeMap<Integer, String> treemap= new TreeMap<Integer, String>();
	
		
		System.out.println("Hashmap");
		testmap(hashmap);	//it can return result in any order
		
		System.out.println("Linked HashMap");
		testmap(linkedhashmap);	//it stores key in the order it was inserted
		
		System.out.println("Tree Map");
		testmap(treemap);	//it will sort the keys in natural order
		
	}
	
	public static void testmap(Map<Integer,String> map) {
		map.put(74, "Cat");
		map.put(12, "Dog");
		map.put(34, "Horse");
		map.put(56, "Cheetah");
		map.put(76, "Lion");
		map.put(98, "Bear");
		
		for(Integer keys:map.keySet()) {
			String name=map.get(keys);
			System.out.println(keys+" : "+name);
		}
	}
}
