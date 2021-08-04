package passingByvalue;

public class PassingByValue {

	public static void main(String[] args) {
		PassingByValue pbv= new PassingByValue();
		int a=4;
		System.out.println("1.number is "+a);
		pbv.show(a);
		System.out.println("4. number is "+a);
		
		/////////with class Object////////
		Person person = new Person("Roushan");
		System.out.println("1. person is : "+person);
		pbv.show(person);
		System.out.println("4. person is : "+person);
		

	}
	
	public void show(int a) {
		System.out.println("2. number is "+a);
		a=6;
		System.out.println("3. number is "+a);
	}
	
	public void show(Person person) {
		System.out.println("2. person is : "+person);
		person.setName("Dharm Raj");  	//this changes the definition of object person and it'll be reflected in calling function too. But this is not at all call by reference.
		person= new Person("Rounak");
		System.out.println("3. person is : "+person);
	}

}
