package Taking_Input_Assignment_Solution;

import java.util.Scanner;

public class Question3 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int sub1 = scn.nextInt();
		int sub2 = scn.nextInt();
		int sub3 = scn.nextInt();
		int total_marks = sub1 + sub2+ sub3;
		int  per = total_marks/3;
		System.out.println("Total Marks :" +total_marks);
		System.out.println("Percentage Marks:" +per + "%");
	

	}

}
