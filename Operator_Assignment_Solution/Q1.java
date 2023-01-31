package Operator_Assignment_Solution;

import java.util.Scanner;

public class Q1 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter a Number:");
		int num = scn.nextInt();
		System.out.print((((num+8)/3)% 5)*5);

	}

}
