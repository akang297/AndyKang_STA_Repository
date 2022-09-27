//AndyKang
//9.23.22
//Using a continue statement

public class Main {
  public static void main (String[] args) {
    int sum = 0;
    int number = 0;

    while (number < 20){
      number++;
      if(number == 10 || number == 11){ 
        sum = sum +100;
        continue;
      }
      sum += number;
    }
    System.out.println("The sum is " + sum);
  }
}
    