package abstractClassAndMethods;

public class App {
	public static void main(String[] args) {
		Camera c1= new Camera();
		Crane cr1= new Crane();
		
		//Machine m1= new Machine();	Illegal because machine is an abstract class
		//m1.start();	also illegal because start() is an abstract method in Machine Class
		c1.setId(9);
		cr1.setId(4);
		System.out.println(c1.getId());
		System.out.println(cr1.getId());
		
		c1.start();
		cr1.shutdown();
	}
	
	
	
}
