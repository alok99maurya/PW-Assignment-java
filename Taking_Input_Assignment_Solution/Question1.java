package Taking_Input_Assignment_Solution;

import java.util.Scanner;

public class Question1 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter name, roll number, and field of interest (separated by space): ");
    String name = input.next();
    String lastName = input.next();
    int rollNumber = input.nextInt();
    String fieldOfInterest = input.next();

    System.out.println("Name: " + name);
    System.out.println("LastName: " + lastName);
    
    System.out.println("Roll Number: " + rollNumber);
    System.out.println("Field of Interest: " + fieldOfInterest);
  }
}

