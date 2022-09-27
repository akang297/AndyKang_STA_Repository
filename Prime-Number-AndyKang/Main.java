//AndyKang
//9.23.22
//Prime number

public class Main {
  public static void main(String[] args) {
    final int NUMBER_OF_PRIMES = 50; // Number of primes to display
    final int NUMBER_OF_PRIMES_PER_LINE = 10; // Display 10 per line
    int count = 0; // Count the number of prime numbers
    int number = 2; // A number to be tested for primeness
    int k =0;//variable that going to use check number is prime
    
    System.out.println("The first 50 prime numbers are \n");

    // Repeatedly find prime numbers
    while (count < NUMBER_OF_PRIMES) {
      // Assume the number is prime
      boolean isPrime = true; // Is the current number prime?

      // Test if number is prime
     for(int i = 2; i <=number/2; i++){
       if(number%i == 0){
         isPrime = false;
         break;
       }
     }
      // Print the prime number and increase the count
      if(isPrime){
        count++;
        if(count%NUMBER_OF_PRIMES_PER_LINE == 0){//Advance in the new line after printing 10 primes
          System.out.println(number);
        }
        else System.out.print(number + " ");
      }

      number++;      
    }
  }
}