//AndyKang
//9.22.22
//Print a multiplication table

public class Main{
  public static void main(String[] args){
    //Display a table heading
    System.out.println("                 Multiplication Table");

    //Display the number headings
    System.out.print("    ");
    for(int i =1; i<=9; i++){
      System.out.print("    " + i);
    }
    System.out.println("\n");
    for(int j = 0; j<50; j++ ){
      System.out.print("-");
    }
    System.out.println();
    //print table body
    for(int k =1; k<=9; k++){
      System.out.print(k + " | ");
      for(int l = 1; l <= 9; l++){
        System.out.printf("%5d",(k*l));
      }
      System.out.println();
    }
    
  }
}