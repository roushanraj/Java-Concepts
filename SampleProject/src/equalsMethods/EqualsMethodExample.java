package equalsMethods;

class Machine{
	private int id;
	private String name;
	public Machine(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Machine [id=" + id + ", name=" + name + "]";
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
	public boolean equals(Object obj) {		//we override the equals method to define what things to compare between objects
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Machine other = (Machine) obj;
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
public class EqualsMethodExample {
	
	public static void main(String[] args) {
		Machine m1 = new Machine(56, "Camera");
		Machine m2= new Machine(56, "Camera");
		System.out.println("first comparison result: "+(m1==m2));
		
		System.out.println(m1.equals(m2));
		
		String s1= "Hello";
		String s2= "Hello dude".substring(0, 5); //--> ultimately means Hello
		
		System.out.println(s1==s2);		//returns false because both are referring to different object
		System.out.println(s1.equals(s2));	//return true because content is same. it doesn't look for semantics
		
		int a=10;
		int b= 10;
		System.out.println(a==b);	//This works because java is referring to same object storing value 10 to save the resources.
		
		
		
	}
}
