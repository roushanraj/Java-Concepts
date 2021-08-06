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

public class TypePromotion {

	public static void main(String[] args) {
		Machine m1 = new Machine();
		float s = m1.sum(20, 20);
		System.out.println(s);
	}

}
