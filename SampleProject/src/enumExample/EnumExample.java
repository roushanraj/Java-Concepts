package enumExample;

public class EnumExample {

	public static final int CAT=0;
	public static final int DOG=1;
	public static final int LION=2;
	public static void main(String[] args) {
		
		////// Old way for assigning certain value to a variable
		int animal = CAT;
		switch (animal) {
		case CAT:
			System.out.println("Cat");
			break;
		case DOG:
			System.out.println("DOG");
			break;
		case LION:
			System.out.println("Lion");
			break;
		default:
			break;
		}
		
		////// using enum file Animals/////////
		Animals animal2= Animals.Tiger;
		switch(animal2) {
		case Cat:
			System.out.println("Cat");
			break;
		case Dog:
			System.out.println("Dog");
			break;
		case Horse:
			System.out.println("Horse");
			break;
		case Lion:
			System.out.println("Lion");
			break;
		case Tiger:
			System.out.println("Tiger");
			break;
		default:
			break;
		
		}
		
	}

}
