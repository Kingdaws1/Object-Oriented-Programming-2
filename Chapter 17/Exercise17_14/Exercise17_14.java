import java.io.*;
import java.util.Scanner;

public class Exercise17_14 {
	
	public static void encryption() throws IOException{
		System.out.print("Please enter a file name: ");
		Scanner userInput = new Scanner(System.in);
		String userFile = userInput.nextLine();
		File source = new File("/Users/student/Downloads/" + userFile);
		int encryptionKey = 5;
		String newEncryptedContent = "";
		String encryptedFileName = "Encrypted_" + userFile;
		int count = 1;
		try (
				DataInputStream input = new DataInputStream(new FileInputStream(source));
		) {
			int value;
			while ((value = input.read()) != -1) {
				newEncryptedContent += value;
				newEncryptedContent += 5;
			}
		}
		File newSource = new File(encryptedFileName);
		try (
				DataOutputStream output = new DataOutputStream(new FileOutputStream(newSource));	
		) {
			output.writeChars(newEncryptedContent);
		}
	}
	
	public static void decryption() throws IOException{
		System.out.print("Please enter a file name: ");
		Scanner userInput = new Scanner(System.in);
		String userFile = userInput.nextLine();
		File source = new File(userFile);
		String newEncryptedContent = "";
		String decryptedFileName = "Decrypted_" + userFile;
		int count = 1;
		try (
				DataInputStream input = new DataInputStream(new FileInputStream(source));
		) {
			int value;
			while ((value = input.read()) != -1) {
				newEncryptedContent += value;
				newEncryptedContent += 5;
			}
		}
		File newSource = new File(decryptedFileName);
		try (
				DataOutputStream output = new DataOutputStream(new FileOutputStream(newSource));	
		) {
			output.writeChars(newEncryptedContent);
		}
	}
	}

	public static void main(String[] args) throws IOException {
		encryption();

	}

}
