package casting;

class Machine{
	public void start() {
		System.out.println("Machine Started");
	}
}

class Camera extends Machine{
	@Override
	public void start() {
		System.out.println("Camera started");	
	}
	public void snaps() {
		System.out.println("Picture Taken");
	}
}
public class UpcastingAndDowncasting {
	public static void main(String[] args) {
		Machine m1=new Machine();
		Camera c1= new Camera();
		
		m1.start();
		c1.start();
		c1.snaps();
		
/*		we can create object of super class using child class reference but that object can only call the methods of the superclass.
		example: Machine-> starts     (ParentClass/superClass)
		               Camera extends Machine-> starts, Snaps. (ChildClass/SubClass)
		so we can create machine object like Machine m1= new Camera();
		or Machine m1= camera1;  [camera1 is a Camera object]
		m1.starts is valid
		but m1.snaps isn't valid.*/

		/********Up Casting*********/

		
		Machine m2=c1;
		m2.start();	
		//m2.snaps();  not allowed because m2 is a machine class variable
		
		/********Down Casting*********/
		Machine m3= new Camera();
		Camera c2=(Camera)m3;	//we explicitly define that c2 is being casted as camera object while it is copying the machine object m3.
		c2.snaps();
		c2.start();
	}
}
