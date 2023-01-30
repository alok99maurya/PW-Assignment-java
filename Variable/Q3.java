package Variable;

import java.util.Scanner;

public class Q3 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter a length :");
		int length = scn.nextInt();
		System.out.println("Enter a breadth");
		int breadth = scn.nextInt();
		int area = length * breadth;
		System.out.println(area);

	}

}
