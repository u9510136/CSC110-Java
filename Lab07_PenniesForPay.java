/*CSC 110 Hsuan-Yu Lin(Sam) noon class
  Lab07 Pennies for pay*/
  
import java.util.Scanner;
  
public class Lab07_PenniesForPay{
  public static void main( String[] args ){
  
  Scanner kb = new Scanner(System.in);
  
  final double START_WAGE = 0.01;
  int workdays;
  double totalWage;
  
  totalWage = 0;
  
  System.out.print("For how many days will you work?  ");
  workdays = kb.nextInt();
  
  while(workdays < 1){
    System.out.println("The number of days must be as least 1");
    System.out.print("For how many days will you work?  ");
    workdays = kb.nextInt();
  } 
  
  System.out.println(" Days     Pennies Earned");
  
  for( int i = 0 ; i < workdays ; i++){
   System.out.printf("%3d   $ %16.2f \n", i+1, START_WAGE * Math.pow( 2 , i ));
   totalWage = totalWage + START_WAGE * Math.pow( 2 , i );
  }
  
  System.out.println("Total pay:  $" + totalWage);
  } 
}