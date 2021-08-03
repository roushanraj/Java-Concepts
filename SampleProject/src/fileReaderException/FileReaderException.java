package fileReaderException;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderException {

	public static void main(String[] args) {
		File f= new File("test.txt");
		BufferedReader br=null;
		try {
			FileReader fr= new FileReader(f);
			br= new BufferedReader(fr);
			
			String line;
			
			while((line=br.readLine())!=null){
				System.out.println(line);
			}
		
		} catch (FileNotFoundException e) {
			System.out.println("File Not Found");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				br.close();
			} catch (IOException e) {
				System.out.println("Not able to read file");
			} catch (NullPointerException e) {
				System.out.println("file was actually never opened");
			}
		}
		
		
		
		

	}

}
