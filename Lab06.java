/*CSC 110 Hsuan-Yu Lin(Sam) noon class
  Lab06 Internet Service Provider*/
  
import java.util.Scanner;
  
public class Lab06{
  public static void main( String[] args ){
  
    Scanner kb = new Scanner(System.in);
    
    final float PACKAGE_A = 9.95f;
    final float PACKAGE_B = 13.95f;
    final float PACKAGE_C = 19.95f;
    final float PA_HOUR_FEE = 2.0f;
    final float PB_HOUR_FEE = 1.0f;
    char pack;
    float hours;
    float bill;
    
    System.out.print("Please select your package for internet serice"
                       + "(a, b or c):  ");
    pack = kb.next().toUpperCase().charAt(0);
    
    if(pack == 'A' || pack == 'B' || pack == 'C'){
      System.out.print("Please enter the hours used:  ");
      hours = kb.nextFloat();
      
      if(pack == 'A'){
        bill = PACKAGE_A + PA_HOUR_FEE * (hours - 10);
      }
      else if(pack == 'B'){
        bill = PACKAGE_B + PB_HOUR_FEE * (hours - 20);
      }
      else{
        bill = PACKAGE_C;;
      }
      System.out.println("Your charges are:  $" + bill);
    }
    else{
      System.out.println("There is no suck packages, try again later.");
    }


  } 

}