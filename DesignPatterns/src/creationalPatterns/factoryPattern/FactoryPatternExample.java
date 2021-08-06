package creationalPatterns.factoryPattern;


enum Type{
	camera,crane
}

abstract class Machine{
	abstract public int getID();

	@Override
	public String toString() {
		return "Machine [ID=" + getID() + "]";
	}
	
}

class Camera extends Machine{
	int id;

	public Camera(int id) {
		this.id = id;
	}

	@Override
	public int getID() {
		return this.id;
	}
}

class Crane extends Machine{
	int id;
	
	public Crane(int id) {
		this.id = id;
	}
	
	@Override
	public int getID() {
		return this.id;
	}
}

class MachineFactoryClass{
	public static Machine getInstance(Type type,int id) {
		if (type==Type.camera) {
			return new Camera(id);
		}
		if (type==type.crane) {
			return new Crane(id);
		}
		else 
			return null;
		
		
	}
}

public class FactoryPatternExample {

	public static void main(String[] args) {
		Machine camera1 = MachineFactoryClass.getInstance(Type.camera, 7);
		System.out.println(camera1);
		
		Machine crane1= MachineFactoryClass.getInstance(Type.crane, 6);
		System.out.println(crane1);

	}

}
