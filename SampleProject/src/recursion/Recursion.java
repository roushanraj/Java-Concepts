package recursion;

public class Recursion {

	public static void main(String[] args) {
		calculate(7);
		System.out.println(factorial(10));

	}
	
	private static void calculate(int val) {
		System.out.println(val);
		if(val==1)
			return;
		calculate(val-1);
	}
	
	private static int factorial(int n) {
		if(n==1)
			return 1;
		return factorial(n-1)*n;
		
	}

}
