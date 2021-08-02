package fileReading;

import java.io.File;	//File package to work with file
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileReadingUsingScanner {
	public static void main(String[] args) throws FileNotFoundException {
		String fileLocation= "C:\\Users\\user\\git\\Java-Concepts\\SampleProject\\src\\Sample File";
		//we can just write the file name if the file is stored in the main directory of the project
		File textFile= new File(fileLocation);
		
		Scanner scanner = new Scanner(textFile);
		
		while (scanner.hasNextLine()) {		//reading whole file
			String line= scanner.nextLine();
			System.out.println(line);
		}
		scanner.close();
		
		Scanner scanner1 = new Scanner(textFile);
		
		int a= scanner1.nextInt();
		scanner1.nextLine();	//nextInt doesn't read the next line character but nextLine does. to escape that situation we jump to next line.
		for(int i=0;i<a;i++) {
			
			System.out.println(scanner1.nextLine());
		}
		
	}
}
