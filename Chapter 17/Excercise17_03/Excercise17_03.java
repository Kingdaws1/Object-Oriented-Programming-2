import java.io.*;

public class Excercise17_03 {
	
	public static void createExercise17_03() throws IOException{
		try (
				DataOutputStream output = new DataOutputStream(new FileOutputStream("Exercise17_03.dat", true));
			) {
				for (int i = 0; i < 100; i++) {
					output.writeInt((int)(Math.random() * 10));
				}
			}
	}
	
	public static int sumOfExercise17_03() throws IOException{
		File sourceFile = new File("Exercise17_03.dat");
		int sum = 0;
		if (sourceFile.exists()) {
			try (
				DataInputStream input = new DataInputStream(new FileInputStream(sourceFile));
			) {
				int value;
				while ((value = input.read()) != -1) {
					System.out.print(value + " ");
					sum += value;
				}
			}
		}
		return(sum);
	}

	public static void main(String[] args) throws IOException {
		createExercise17_03();
		System.out.print(sumOfExercise17_03());
	}

}
