//AndyKang
//9.22.22
//Greatest Common Divisor

import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);

    
    //promote the user for two integers;

    System.out.print("Enter two integer: ");
    int n1 = input.nextInt();
    int n2 = input.nextInt();

    int gcd = 1;
    int k = 2;

    while(k <= n1 && k<=n2){
      if(n1 % k  == 0 && n2 % k ==0)gcd = k;
      k++;
    }
    System.out.println("The greatest common divisor for " + n1 + " and " + n2 + " is " + gcd);
  }
}