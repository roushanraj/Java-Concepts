package customObjectsInSet;

import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

class Person{
	private int id;
	private String name;
	
	public Person(int id, String name) {
		this.id = id;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
	
}

public class CustomObjectsInSet {

	public static void main(String[] args) {
		
		Person p1= new Person(4, "Roushan");
		Person p2= new Person(5, "Rounak");
		Person p3= new Person(6, "Ruhi");
		Person p4= new Person(5, "Rounak");
		
		
		Map<Person, Integer> map= new LinkedHashMap<Person, Integer>();
		map.put(p1, 1);
		map.put(p2, 2);
		map.put(p3, 3);
		map.put(p4, 4);
		
		for(Person mapitems: map.keySet()){
			System.out.println(mapitems+" : "+map.get(mapitems));
		}
		
		Set<Person> set= new HashSet<Person>();
		set.add(p1);
		set.add(p2);
		set.add(p3);
		set.add(p4);
		
		System.out.println(set);	//Before overriding the person's class hasgcode() and .equals() method, it is going to return same object twice which contradicts the property of set.
		//but after overriding and defining the .equals() method it'll eliminate the same objects of Person's class.
		
		
	}

}
