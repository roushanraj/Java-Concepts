package exceptionHandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class ExceptionHandling {

	public static void main(String[] args) throws FileNotFoundException  {
		File f= new File("Text.txt");
		FileReader fr= new FileReader(f);

	}

}
