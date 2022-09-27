//ANdyKang
//9/26/2022
//Natsed for loop assignment


import java.util.*;

public class Main {
  public static void main(String[] args) {
    //----------------------------------------------------------------------------------------------------------------
    //Assignment #1
    int num = 8;
    int tmp =0;    
    
    String line = "";
    for(int i = 0; i< num; i++){
      tmp = 1;//depend the number that increase and decrease
      line = ""; //reset string everytime
      
      for(int j=1; j<=(num*2)-1; j++){//Make space in line 
        if(j<=(num-1)-i){
          line = line + " ";
        }
        
        else if(j>=num-i && j<=num+i){ //multiply the number 
          if(j==num-i) line = line + 1;
          else if(j<=num){
            tmp *=2;
            line = line + tmp;
          }
          else if(j>num){ // divide the number
            tmp /=2;
            line = line + tmp;
          }
        }
      
          
        else if(j>=(num+1)+i){ //Make space in line 
          line = line + " ";
        }
        
        line = line + " ";//Create space between number
        
        
      }
      System.out.println(line);
    }
  






  
    //--------------------------------------------------------------------------------------------------------------------------
    // Assignment #2
    
    //create scanner object
    Scanner input = new Scanner(System.in);
    System.out.println();
    //Ask for numer of line
    System.out.print("Enter the number of lines: ");
    num = input.nextInt();//number of line
    
    
    
    for(int i = 0; i< num; i++){
      tmp = i+1;//depend the number that increase and decrease
      line = ""; //reset string everytime
      
      for(int j=1; j<=(num*2)-1; j++){//Make space in line 
        
        if(j<=(num-1)-i){
          line = line + " ";
        }
        
        else if(j>=num-i && j<num){ //decrease number
          line = line + tmp;
          tmp--;
        }
        
        else if(j==num) { //middle number has to be a 1
          line = line + 1;
          tmp++;
        }
          
        else if(j<=num+i && j>num){ //increase number
          line = line + tmp;
          tmp++;
        }
          
        else if(j>=(num+1)+i){ //Make space in line 
          line = line + " ";
        }

        line = line + " "; //Create space between number
        
        
      }
      System.out.println(line);

  
    }
    //--------------------------------------------------------------------------------------------------------------------
    //Assignment #3

    //Pattern A
    System.out.println();
    
    System.out.println("Pattern A");
    line = "";
    for(int i= 1; i<=6; i++){
      
      if(i==1){
        line = line + 1; 
        System.out.println(line);
      }
      line = "";
      
      for(int j = 1; j<=i+1; j++){
        line  = line + j;
        line = line + " ";
      }
      
      
      System.out.println(line);
    }

    //Pattern B
    System.out.println();

    System.out.println("Pattern B");
    line = "";
    for(int i= 6; i>0; i--){
      
      
      line = "";
      
      for(int j = 1; j<=i; j++){
        line  = line + j;
        line = line + " ";
      }
      
      System.out.println(line);
    }

    //Pattern C
    System.out.println();
    
    System.out.println("Pattern C");
    line = "";
    for(int i= 1; i<=6; i++){
      line = "";
      tmp = i;
      
      for(int j = 6; j>0; j--){
        if(j>i){
          line = line + " ";
        }else{
          line = line + tmp;
          tmp--;
        }
        line = line + " ";
      }
    System.out.println(line);

    }

    //Pattern D
    System.out.println();
    
    System.out.println("Pattern D");
    line = "";
    for(int i= 0; i<6; i++){
      line = "";
      tmp = i;
      
      for(int j = 1; j<=6; j++){
        if(j<=i) line = line + " ";
        else{
          line = line + (j-i);
        }
        line = line + " ";
      }
    System.out.println(line);

    }
  }
}