import java.io.*;
import java.io.PrintWriter;
import java.util.*;

public class Exercise17_01 {

	public static void main(String[] args) throws IOException {
		File sourceFile = new File("temp.txt");
		if (!sourceFile.exists()) {
			try (
					FileOutputStream output = new FileOutputStream("temp.txt");
					) {
				for (int i = 1; i <= 100; i++)
					output.write((int) (Math.random() * 10));
			}
			
			try (
					FileInputStream input = new FileInputStream("temp.txt");
					) {
				int value;
				while ((value = input.read()) != -1)
					System.out.print(value + " ");
			}
		}
		else {
			try (
					Formatter output = new Formatter(new FileOutputStream(sourceFile, true));
					) {
				for (int i = 1; i <= 100; i++)
					output.format("" + (int)(Math.random() * 10));
			}
			
			try (
					FileInputStream input = new FileInputStream("temp.txt");
					) {
				int value;
				while ((value = input.read()) != -1)
					System.out.print(value + " ");
			}
			
		}
	}

}
