package Variable;

import java.util.Scanner;

public class Q5 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter 1st number");
		int n1 = scn.nextInt();
		System.out.println("Enter a 2nd Number");
		int n2=scn.nextInt();
		int temp;
		temp = n1;
		n1=n2;
		n2=temp;
		System.out.println(n1 + ","+n2);

	}

}
