/*
AndyKang
9/21/2022
Repat addition quiz
*/

import java.util.*;

public class Main{
  public static void main(String[] args){
    //Create scanner object
    Scanner input = new Scanner(System.in);

    //Generate two random numbers
    int num1 = (int)(Math.random()*10);
    int num2 = (int)(Math.random()*10);

    System.out.print("What is " + num1 +" + " + num2 +"?: ");

    int answer = input.nextInt();

    //While loop to check the answer;
    while(num1+num2 != answer){
      System.out.print("Wrong answer. Try again. What is " + num1 + " + " + num2 + "?: ");
        answer = input.nextInt();
    }
    System.out.println("Good job! You got it correct!");
  }
}