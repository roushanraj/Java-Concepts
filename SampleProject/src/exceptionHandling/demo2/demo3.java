package exceptionHandling.demo2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class demo3 {
	public static void main(String[] args) {
		try {
			openFile();
		} catch (FileNotFoundException e) {
			System.out.println("File not Found");
		} //this will also throw exception which is need to be handled in the main function too
		
		openNewFile();	//it was handled using try-catch block in the method itself. So, no need to handle it in the calling (main) method.
	}
	
	public static void openFile() throws FileNotFoundException {
		File f= new File("Test.txt");
		FileReader fr= new FileReader(f);
	}
	
	public static void openNewFile() {
		File f= new File("Test.txt");
		try {
			FileReader fr= new FileReader(f);
		} catch (FileNotFoundException e) {
			System.out.println("File 2 not found");
		}
	}
}
