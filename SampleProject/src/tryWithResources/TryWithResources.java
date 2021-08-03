package tryWithResources;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TryWithResources {

	public static void main(String[] args) {
		
		File f= new File("test.txt");
		
		try(BufferedReader br= new BufferedReader(new FileReader(f))){	//feature of java 7 where we can try exception while creating the resources itself
			String line;
			while((line=br.readLine())!=null) {
				System.out.println(line);
			}
		} catch (FileNotFoundException e) {
			System.out.println("File Not Found");
		} catch (IOException e) {
			System.out.println("Error In File");
		}
		

	}

}
