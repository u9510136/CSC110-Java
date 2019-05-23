/*CSC 110 Hsuan-Yu Lin(Sam) noon class
  Lab04 BMI test*/
  
import java.util.Scanner;
  
public class Lab04{
  public static void main( String[] args ){
  
    Scanner kb = new Scanner(System.in);
    
    float weight;
    float height;
    double bmi;
    
    System.out.println("Welcome! This program calculates your BMI.");
    System.out.println();
    
    System.out.print("Please type in your weight(pounds):  ");
    weight = kb.nextFloat();
    System.out.println();
    
    System.out.print("Please type in your height(inches):  ");
    height = kb.nextFloat();
    System.out.println();
    
    if(weight <= 0 || height<= 0){
      System.out.println("Error! Inputs must be positive. Terminating....");
    } 
    else {
      bmi = weight * 703 / (height * height);
      if(bmi > 25){
        System.out.println("Your BMI is:  " + bmi);
        System.out.println("You are overweight!");
      }
      else if( bmi < 18.5){
        System.out.println("Your BMI is:  " + bmi);
        System.out.println("You are underweight!");     
      }
      else{
        System.out.println("Your BMI is:  " + bmi);
        System.out.println("Your weight is optimal.");
      }
    }
  
  } 

}