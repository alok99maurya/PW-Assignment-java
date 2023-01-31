package Operator_Assignment_Solution;

import java.util.Scanner;

public class Q3 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int sum =0;
		while(n>0) {
			int last = n % 10;
			sum = sum + last;
			n = n/10;
		}
		System.out.println(sum);

	}

}
