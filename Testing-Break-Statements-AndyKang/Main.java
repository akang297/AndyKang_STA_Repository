//AndyKang
//9/23/2022
//Testing Breao Statement

public class Main{
  public static void main(String[] args){
    int sum = 0;
    int number = 0;

    while(number < 20){
      number++;
      sum += number;
      if(sum>= 100){
        break;
      }
    }
    System.out.println("The number is " + number);
    System.out.println("The sum is " + sum);
  }
}