package anonymousClass;

class Machine{
	public void start() {
		System.out.println("Machine Started");

	}
}

interface Plant{
	public void grow();
}

public class AnonymousClass {
	public static void main(String[] args) {
		Machine m1= new Machine() {	//by using this we are overriding without creating any new subclass
			@Override				//and here new Machine() is a new class which is Anonymous class
			public void start() {
				System.out.println("Camera started");
			}
		};
		
		m1.start();
		
		Machine m2= new Machine();
		m2.start();
		
		//Plant p1= new Plant(); this is illegal because Plant here is interface and we cannot create object instance of an Intefrface.
		// we will use anonymous class
		Plant p1= new Plant() {
							// we are creating a anonymous class which is implementing plant interface methods. so, now object p1 is legal.
			@Override
			public void grow() {
				System.out.println("Plant is growing");
				
			}
			
		};
		
		p1.grow();
		
	}
}
