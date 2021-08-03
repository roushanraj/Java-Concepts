package abstractClassAndMethods;

public abstract class Machine {
	private int id;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	public abstract void start();	// this is abstract method which must be defined in the child class
	public abstract void shutdown();
}
