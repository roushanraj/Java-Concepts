package creationalPatterns.builderPatterns;

class Car{
	//required fields
	private int modelNo;
	private String name;
	
	//optional fields
	private int noOfAirBags;
	private int absChannels;
	
	
	
	@Override
	public String toString() {
		return "Car [modelNo=" + modelNo + ", name=" + name + ", noOfAirBags=" + noOfAirBags + ", absChannels="
				+ absChannels + "]";
	}

	public int getModelNo() {
		return modelNo;
	}

	public String getName() {
		return name;
	}

	public int getNoOfAirBags() {
		return noOfAirBags;
	}

	public int getAbsChannels() {
		return absChannels;
	}

	private Car(CarBuilder carBuilder) {
		this.modelNo= carBuilder.modelNo;
		this.name= carBuilder.name;
		this.absChannels= carBuilder.absChannels;
		this.noOfAirBags= carBuilder.noOfAirBags;
	}
	
	public static class CarBuilder{
		private int modelNo;
		private String name;
		
		//optional fields
		private int noOfAirBags;
		private int absChannels;
		
		public CarBuilder(int modelNo, String name) {
			this.modelNo = modelNo;
			this.name = name;
		}

		public CarBuilder setNoOfAirBags(int noOfAirBags) {
			this.noOfAirBags = noOfAirBags;
			return this;
		}

		public CarBuilder setAbsChannels(int absChannels) {
			this.absChannels = absChannels;
			return this;
		}
		
		public Car build() {
			return new Car(this);
		}
		
		
	}
	
	
	
}

public class BuilderPatternExample {
	public static void main(String[] args) {
		Car car1= new Car.CarBuilder(78, "Maruti Ciaz").setAbsChannels(2).setNoOfAirBags(4).build();
		System.out.println(car1);
		
		Car car2= new Car.CarBuilder(45, "Maruti 800").build();	//we are ignoring the optional fields.
		System.out.println(car2);	
	}
}
