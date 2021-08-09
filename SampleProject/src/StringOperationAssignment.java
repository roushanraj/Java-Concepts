import java.util.Scanner;

public class StringOperationAssignment {

	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		System.out.println("Enter the String");
		String text= scanner.nextLine();
		
		stringOperation(text);
		scanner.close();
	}
	/**
	 * <h3>String operation method</h3>
	 * 
	 * This method takes input of string.
	 *  And divide the String into two equal halves and shows the console output where 
	 * second half is printed first and second half is reversed and then printed later.<br>
	 * <b>Example</b> ABCDEF--> ABC DEF--> DEF CBA--> DEFCBA <br>
	 * <b><tt>Input: </tt></b>ABCDEF <b><tt>Output: </tt></b> DEFCBA
	 * 
	 * @param text takes input as String on which the operation will take Place
	 * @return void: as the method itself is going to print the result
	 * @author Roushan Raj
	 */
	private static void stringOperation(String text) {
		int flag=0;
		char mid = 0;
		if (text.length()%2!=0) {
			flag=1;
			mid= text.charAt(text.length()/2);
			StringBuilder temp= new StringBuilder(text);
			temp.deleteCharAt(text.length()/2);
			text=temp.toString();
			
		}
		
		String second= text.substring((text.length()/2), text.length());
		System.out.print(second);
		if(flag==1)
			System.out.print(mid);
		text=text.substring(0, text.length()/2);
		
		System.out.println(reverse(text));
	}

	private static String reverse(String s) {
		StringBuilder rev= new StringBuilder();
		for (int i = 0; i < s.length(); i++) {
			rev.append(s.charAt(s.length()-i-1));
		}
		
		return rev.toString();
	} 
}
