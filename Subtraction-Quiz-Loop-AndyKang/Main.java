//ANdyKang
//9.21.22
//Subtraction Quiz Using a Loop

import java.util.Scanner;

public class Main {
  public static void main (String[] args) {
    //Create scanner object
    Scanner input = new Scanner(System.in);

    //Number of questions in quiz
    final int NUMBER_OF_QUESTIONS = 5;

    //Count the number of correct answers
    int correctCount = 0;

    //Count the number of questions
    int count = 0;

    long startTime = System.currentTimeMillis();

    String output = "";

    while(count < NUMBER_OF_QUESTIONS){
      //Generate two random numbers
      int num1 = (int)(Math.random()*10);
      int num2 = (int)(Math.random()*10);

      //if num2 is greater than num1 switch them
      if(num1< num2){
        int tmp = num1;
        num1 = num2;
        num2 = tmp;
      }

      //Ask the user the question
      System.out.print("What is " + num1 + " - " + num2 + "?: ");
      int answer = input.nextInt();

      //check the answer
      if(num1 - num2 == answer){
        System.out.println("Correct!\n");
        correctCount++;
      }else{
        System.out.println("Incorrect. " + num1 + " - " + num2 + " = " + (num1-num2) + "\n");
      }
      //increase count
      count++;

      output += "\n" + num1 + " - " + num2 + " = " + answer + ((num1 - num2) == answer? " correct":" wrong" );

        
      
    }
    long endTime = System.currentTimeMillis();
    long testTime = endTime - startTime;

    System.out.println(" You got " + correctCount +" correct out of 5 questions.\nTotal time for test: " + testTime/1000 + " seconds\n" + output);
    
    
  }
}