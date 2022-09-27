//AndyKang
//9.21.22
//Do While Loop with Sentinel

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    int data;
    
    int sum = 0;
    do{
      System.out.print("Enter an integer. (The input ends if it is 0): ");
      data = input.nextInt();

      sum += data;
    }

    while (data != 0);

    System.out.println("The sum of your integers is: " + sum);
  }
}