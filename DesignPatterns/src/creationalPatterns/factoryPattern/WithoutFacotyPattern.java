/*
 * 			   Tightly coupled class
 * 						↓
 *		Implement IOC using Factory Pattern
 * 						↓
 *		Implement DIP by creating Abstraction
 * 						↓
 *				  Implement DI
 * 						↓
 *			    use IOC Container
 * 						↓
 *			  Loosely coupled class
 * 
 * */





package creationalPatterns.factoryPattern;


class Camera1{
	int id;

	public Camera1(int id) {
		this.id = id;
	}

	public int getID() {
		return this.id;
	}
	
	@Override
	public String toString() {
		return "Machine [ID=" + getID() + "]";
	}
}

class Crane1 {
	int id;

	public Crane1(int id) {
		this.id = id;
	}
	public int getID() {
		return this.id;
	}
	
	@Override
	public String toString() {
		return "Machine [ID=" + getID() + "]";
	}
}

public class WithoutFacotyPattern {
	public static void main(String[] args) {
		Camera1 camera = new Camera1(7);
		System.out.println(camera);
		
		Crane1 crane= new Crane1(6);
		System.out.println(crane);
	}
}
