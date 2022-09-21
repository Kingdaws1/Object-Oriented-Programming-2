import java.util.Scanner;

public class Exercise18_9 {
	public static String newValue = "";
	public static int n = 1;
	
	public static void reverseDisplay(String value) {
		if (n == value.length() + 1) {
			System.out.print(newValue);
		} else {
			newValue += value.charAt(value.length() - n);
			n++;
			reverseDisplay(value);
		}
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Input a word you want reversed: ");
		String word = input.nextLine();
		reverseDisplay(word);
	}

}
