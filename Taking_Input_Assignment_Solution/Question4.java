package Taking_Input_Assignment_Solution;

import java.util.Scanner;

public class Question4 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter how many number you want to add");
		int in = scn.nextInt();
		for(int i=1;i<=in;i++) {
			int num1 = scn.nextInt();
			int num2 = scn.nextInt();
			System.out.println(num1 + num2);
		}
		

	}

}
