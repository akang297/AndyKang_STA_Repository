//AndyKang
//9.23.22
//Using break statement in Guess Number

import java.util.Scanner;

public class Main{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);

    //Generate a random number

    int number = (int)(Math.random() * 101);

    System.out.print("Guess the magic numbe between 1 and 100!");
    while(true){
      System.out.print("\nEnter your guess: ");
      int guess = input.nextInt();

      if(guess == number){
        System.out.println("Yes! you won! The number was " + number);
        break;
      }
      else if(guess > number){
        System.out.println("Your guess was too high. Try again.");
      }else{
        System.out.println("Your guess was too low. Try again.");
      }
    }
  }
}