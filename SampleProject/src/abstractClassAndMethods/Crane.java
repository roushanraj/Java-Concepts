package abstractClassAndMethods;

public class Crane extends Machine {

	@Override
	public void start() {
		System.out.println("crane started");
		
	}

	@Override
	public void shutdown() {
		System.out.println("Crane shutdown");
		
	}

}
