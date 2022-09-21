import java.util.Scanner;

public class Exercise18_3 {
	
	public static int gcd(int m, int n) {
		if (m%n == 0) {
			return n;
		} else {
			return gcd(n, m%n);
		}
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Input two integers to find their greatest common divisor: ");
		int userFirstNumber = input.nextInt();
		int userSecondNumber = input.nextInt();
		System.out.println("The greatest common divisor is " + gcd(userFirstNumber, userSecondNumber));
	}

}
