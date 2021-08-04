package sortingList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class StringLengthComparator implements Comparator<String>{

	@Override
	public int compare(String s1, String s2) {
		int len1=s1.length();
		int len2=s2.length();
		
		if (len1>len2)
			return 1;
		
		if (len1<len2)
			return -1;
		
		return 0;
	}
	
}

class ReverseAlphabeticalOrder implements Comparator<String>{

	@Override
	public int compare(String s1, String s2) {
		
		return -s1.compareTo(s2);	// "-" minus sign to reverse the logic, if not minus then it'll be sorted in lexicographical manner.
	}
	
}

class Machine{
	private String name;
	private int id;
	
	public Machine(String name, int id) {
		super();
		this.name = name;
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Machine [name=" + name+"]";
	}
	
	
	
}

public class SortingListExample {

	public static void main(String[] args) {
		List<String> animals= new ArrayList<String>();
		
		animals.add("Dog");
		animals.add("Cat");
		animals.add("Horse");
		animals.add("Cow");
		animals.add("Deer");
		animals.add("Lamb");
		
		Collections.sort(animals,new StringLengthComparator());
		
		for(String animalList: animals) {
			System.out.println(animalList);
		}
		
		
		List<Integer> numbers= new ArrayList<Integer>();
		numbers.add(23);
		numbers.add(43);
		numbers.add(9);
		numbers.add(4);
		numbers.add(45);
		numbers.add(67);
		
		////Another way to make comparator///////
		Collections.sort(numbers,new Comparator<Integer>() {

			@Override
			public int compare(Integer n1, Integer n2) {
				return -n1.compareTo(n2);
			}
			
		});
		
		for(Integer num: numbers) {
			System.out.println(num);
		}
		
		Collections.sort(animals,new ReverseAlphabeticalOrder());

		for(String animalList: animals) {
			System.out.println(animalList);
		}
		
		
		//////sorting arbitrary Objects///////////
		List<Machine> machinelist= new ArrayList<Machine>();
		machinelist.add(new Machine("Lathe", 4));
		machinelist.add(new Machine("Driller", 3));
		machinelist.add(new Machine("Saw", 5));
		machinelist.add(new Machine("Camera", 2));
		
		Collections.sort(machinelist, new Comparator<Machine>() {

			@Override
			public int compare(Machine m1, Machine m2) {
				if (m1.getId()>	m2.getId())
					return 1;
				if (m1.getId()<	m2.getId())
					return -1;
				return 0;
			}
			
		});
		
		for(Machine persons: machinelist) {
			System.out.println(persons);
		}
	}

}
