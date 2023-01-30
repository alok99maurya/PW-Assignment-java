package Variable;

import java.util.Scanner;

public class Q1 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter a 1st Number :");
		int number1 = scn.nextInt();
		System.out.println("Enter a 2nd Number :");
		int number2 = scn.nextInt();
		int product = number1 * number2;
		System.out.println(product);

	}

}
