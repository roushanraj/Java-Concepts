package fileWriter;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.FileWriter;
import java.io.File;

public class FileWriterExample {
	public static void main(String[] args) {

		File f = new File("test1.txt");

		try (BufferedWriter br = new BufferedWriter(new FileWriter(f))) {
			br.write("Hey This is new file. ");
			br.write("This is another sentence.");
			br.newLine();
			br.write("This is new line");
		} catch (IOException e) {
			System.out.println("Error In File");
		}

	}

}
