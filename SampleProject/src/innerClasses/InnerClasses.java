package innerClasses;

import innerClasses.Machine.Battery;
import innerClasses.Machine.ControlUnit;

public class InnerClasses {
	public static void main(String[] args) {
		Machine m1= new Machine(7);
		m1.start();
		
		// very rarely used 
		Machine.ControlUnit cu1= m1.new ControlUnit();	//creating object for inner class ControlUnit
		cu1.works();
		
		//quite common	//creating object of static inner class
		Machine.Battery b1= new Machine.Battery();
		b1.charging();
	}
}
