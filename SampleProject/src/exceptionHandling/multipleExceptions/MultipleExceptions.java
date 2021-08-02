package exceptionHandling.multipleExceptions;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.ParseException;

public class MultipleExceptions {
	public static void main(String[] args) {
		Test test1 = new Test();
		Test test2 = new Test();
		Test test3 = new Test();
		Test test4 = new Test();
		
		
		//////solution 1/////////
		try {
			test1.run();
		} catch (IOException e) {
			System.out.println("This is an IO exception");
		} catch (ParseException e) {
			System.out.println("could not parse the file");
		}
		
		//////solution 2 (Multi-Catch) /////////
		
		try {
			test2.run();
		} catch (IOException | ParseException e) {
			System.out.println("Either there is parsing error or an IO error");
		}
		
		/////solution 3 (Using Exception Superclass)///////////
		//Exception is parent class of all exceptions hence we can use it to catch any kind of exception. (Polymerphism)
		try {
			test3.run();
		} catch (Exception e) {
			System.out.println("You got some kind of Exception");
		} 
		
		try {
			test4.fileOperation();
		} catch (FileNotFoundException e) {	
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		

		/* ^ ^
		 * | |
		 * We should handle Subclass exceptions first.
		 * ex. IOException is parent class of FileNotFoundException. 
		 * so we must catch the FileNotFoundException first. 
		 * If we catch IOException first, then it will 
		 * automatically cover FileNotFoundException and we 
		 * will never reach to FileNotFoundException separately.
		 * 
		 */
	}
}
