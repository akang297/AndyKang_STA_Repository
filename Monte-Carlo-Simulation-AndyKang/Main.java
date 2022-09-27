//AndyKang
//9/23/22
//Monte Carlo Simulator

public class Main{
  public static void main(String[] args){

    final int NUMBER_OF_INITALS = 10000000;
    int numberOfHits = 0;

    for(int i = 0; i<NUMBER_OF_INITALS; i++){
      double x = Math.random()*2.0 -1;
      double y = Math.random()*2.0 - 1;
      if(x*x + y*y <= 1){
        numberOfHits++;
      }  
    }
    double pi = 4.0 * numberOfHits /NUMBER_OF_INITALS;
    System.out.println("PI is " + pi);
  }
}