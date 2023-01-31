package Operator_Assignment_Solution;

import java.util.Scanner;

public class Q2 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int num1 = scn.nextInt();
		int num2 = scn.nextInt();
		num1 = num1 + num2;
		num2 = num1 - num2;
		num1 = num1-num2;
		System.out.println(num1 + " "+num2);

	}

}
