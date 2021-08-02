package exceptionHandling.demo2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Exception2 {
	public static void main(String[] args) {
		File f= new File("Test.txt");
		try {
			FileReader fr= new FileReader(f);
		} catch (FileNotFoundException e) {
			System.out.println("File Not found "+f.toString());
		}
	}
}
