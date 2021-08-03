package abstractClassAndMethods;

public class Camera extends Machine {

	@Override
	public void start() {
		System.out.println("Camera started");
		
	}

	@Override
	public void shutdown() {
		System.out.println("camera shutdown");
		
	}

}
