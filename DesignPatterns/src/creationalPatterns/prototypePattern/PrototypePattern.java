package creationalPatterns.prototypePattern;

interface Prototype{
	public Prototype getClone();
}

class Camera implements Prototype{

	private String brandName, model;
	private int id, year;
	
	
	
	public Camera(String brandName, String model, int id, int year) {
		this.brandName = brandName;
		this.model = model;
		this.id = id;
		this.year = year;
		
	}
	
	@Override
	public String toString() {
		return "Camera [brandName=" + brandName + ", model=" + model + ", id=" + id + ", year=" + year + "]";
	}



	@Override
	public  Prototype getClone() {
		
		return new Camera(brandName, model, id, year);
	}
	
}



public class PrototypePattern {
	public static void main(String[] args) {
		Camera cam1= new Camera("Camera", "EOS", 11, 2019);
		System.out.println(cam1);
		
		Camera cam2= (Camera) cam1.getClone();
		System.out.println(cam2);
	}
}
