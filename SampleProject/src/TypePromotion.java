class Machine {	

	public float sum(int a, float b) {
		System.out.println("First method called");
		return a + b;
	}

	public float sum(float a, int b) {
		System.out.println("First method called");
		return a + b;
	}
}

public class TypePromotion {	//where overloading fails

	public static void main(String[] args) {
		Machine m1 = new Machine();
		float s = m1.sum(20, 20);	//compiler experiences ambiguity
		System.out.println(s);
	}

}
