package innerClasses;

public class Machine {
	private int id;

	public class ControlUnit{	//Inner class
		public void works() {
			System.out.println("Control Unit of Machine-"+id+" Working");
		}
	}
	
	static class Battery{		//static inner class
		public void charging() {
			System.out.println("Battery is charging..");
		}
	}
	
	public Machine(int id) {
		this.id = id;
	}
	
	public void start() {
		System.out.println("Machine Starting");
		ControlUnit cu= new ControlUnit();
		cu.works();
		
		class Example{		//Inner class inside a method
			public void doSomething() {
				System.out.println("my ID is "+id); //it can refer to instance variables and can also refer to local variable which are final.
			}
		}
		
		Example e1= new Example();
		e1.doSomething();
	}
	
}
