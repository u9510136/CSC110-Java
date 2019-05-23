/*CSC 110 Hsuan-Yu Lin(Sam) noon class
  Lab05_Num15 Bank charges*/
  
import java.util.Scanner;
  
public class Lab05_Num15{
  public static void main( String[] args ){
  
    Scanner kb = new Scanner(System.in);
    
    final double LESS_20 = 0.1;
    final double LESS_39 = 0.08;
    final double LESS_59 = 0.06;
    final double MORE_59 = 0.04;
    final int BASE_FEE = 10;
    String oripassword = "SSAS";
    String password;
    int numchecks;
    double finalfee;
    
    System.out.println("This app will determine your chech fees...");
    System.out.print("First, please enter your bank passwork:  ");
    password = kb.nextLine();
    
    if(oripassword.equals(password)){
      System.out.print("Enter thr number of checks written this month:  ");
      numchecks = kb.nextInt();
      
      if(numchecks < 20){
        finalfee = numchecks * LESS_20 + BASE_FEE;
      }
      else if(numchecks < 39){
        finalfee = numchecks * LESS_39 + BASE_FEE;
      }
      else if(numchecks < 59){
        finalfee = numchecks * LESS_59 + BASE_FEE;
      }
      else{
        finalfee = numchecks * MORE_59 + BASE_FEE;
      }
      System.out.println("The total fee is:  $" + finalfee);
    }
    else{
      System.out.println("Sorry, wrong password, please try again later.");
    }
  } 

}