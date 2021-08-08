import java.util.ArrayList;
import java.util.Collections;
import java.util.InputMismatchException;
import java.util.Scanner;

public class MissingNumbersAssignment {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Input the Length of number: ");
		int len = scanner.nextInt();
		
		
		////////creating Array////////
		ArrayList<Integer> intlist= arrayInput(len); // method call to create an arrayList of length n
				
		//////printing Missing Numbers/////////////
		printMissingNumber(intlist);
		
		scanner.close();
	}
	
	/**
	 * <h3>Print missing number</h3>
	 * 
	 * This method takes input of ArrayList of Integer type. Further it calculates the maximum and minimum element of that list.<br>
	 * then creates another array which consists of all the numbers which are missing between the maximum and minimum of the first array<br>
	 * <b>Example</b> <b><tt> Input: </tt></b>[1,4,7,9]<b><tt> Output: </tt></b>[2,3,5,6,8]<br>
	 * [1,4,7,9]--> max=9 and min= 1 -->array of element between 1 and 9= [1,2,3,4,5,6,7,8,9]<br>
	 * Missing elements from first array--> [2,3,5,6,8]
	 * 
	 * @param integerList Takes array list as parameter on which operation is to be performed
	 * @return void
	 * @author Roushan Raj
	 * 
	 */
	private static void printMissingNumber(ArrayList<Integer> integerList)
	{
		System.out.print("Numbers you entered are: ");
		for(Integer integers: integerList)
		{
			System.out.printf("[%d]",integers);
		}
		
		int max= Collections.max(integerList);
		int min= Collections.min(integerList);
		
		//new list with numbers between max and min
		ArrayList<Integer> betweenNumbers= new ArrayList<Integer>();
		for (int i = min; i < max+1; i++) {
			betweenNumbers.add(i);
		}
		
		betweenNumbers.removeAll(integerList);
		System.out.print("\nNumbers between Minimum and Maximum elements are: ");
		for(Integer integers: betweenNumbers)
		{
			System.out.printf("[%d]",integers);
		}
		

	}

	private static ArrayList<Integer> arrayInput(int len) {
		Scanner scanner = new Scanner(System.in);
		int temp=0;
		if (len<=0) {
			scanner.close();
			System.out.println("----Wrong Length Input----");
			System.exit(0);
		}
	
		ArrayList<Integer> intlist= new ArrayList<Integer>();
		
		for(int i=0;i<len;i++){
			System.out.printf("\nEnter element number %d: ",i);
			try {
				temp=scanner.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("----Wrong Input Format----");
				System.exit(0);
			}
			intlist.add(temp);
		}
		scanner.close();
		return intlist;
		
	}

}
