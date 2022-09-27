//AndyKang
//9/23/2022
//Checking for me
import java.util.*;
public class Main{
  public static void main(String[] args){
    //Create Scanner object
    Scanner input = new Scanner(System.in);

    //Ask for a String
    System.out.print("Enter a string: ");
    String s = input.nextLine();

    //The index in the first character of the string
    int low = 0;

    //index of the last character of the string
    int high = s.length()-1;

    boolean isPalindrome = true;

    while(low<high){
      if(s.charAt(low) != s.charAt(high)){
        isPalindrome = false;
        break;
      }
      low++;
      high--;
    }
    if(isPalindrome)
      System.out.println(s + " is a palindrome.");
    else
      System.out.println(s + " is not a palindrome.");

      
  }
}