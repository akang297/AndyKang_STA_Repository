//AndyKang
//9.21.22
//Using a sentinel value

import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);

    System.out.print("Enter an integer. (The input ends if it is 0): ");
    int data = input.nextInt();
    int sum = 0;
    while(data !=0){
      sum += data;

      System.out.print("Enter an integer. (The input ends if it is 0): ");
     data = input.nextInt();
    }
    System.out.println("The sum of your integer is: " + sum);
  }
}
