package exceptionHandling.runtimeexception;

public class RuntimeException {

	public static void main(String[] args) {
		int value= 7;
		try {
			value=value/0;
		} catch (Exception e) {
			System.out.println("Error is "+e.toString());
		}	//it'll throw runtime exception. java.lang.ArithmeticException which is child of runtime exception.
		
		//example 2 of  runtime exception
		String name= null;		//java.lang.NullPointerException will come
		try {
			System.out.println(name.length());
		} catch (Exception e) {
			System.out.println("Error is "+e.toString());
		}
		
		//example 3 (ArrayIndexOutOfBoundException)
		String[] animals= {"Lion", "Horse", "Tiger"};
		try {
			System.out.println(animals[3]);
		} catch (Exception e) {
			System.out.println("Error is "+e.toString());
		}

	}

}
