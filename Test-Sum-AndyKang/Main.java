//AndyKang
//9.22.22
//Test Sum

public class Main{
  public static void main(String[] args){
    //Initalize sum
    float sum = 0;

    for(float i = 0.01f; i<= 1.0f; i= i+0.01f){
      sum += i;
      
    }
    System.out.println("The sum is " + sum);
  }
}