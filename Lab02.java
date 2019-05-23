/*CSC 110 Hsuan-Yu Lin(Sam) noon class
  Lab02 purchase amount and tax compute*/
  
import java.util.Scanner;
  
public class Lab02{
  public static void main( String[] args ){
  
  Scanner kb = new Scanner(System.in);
  
  double purchase, pstax, pctax, ttax, tcost;
  final double STATE_TAX = 0.04;
  final double COUNTY_TAX = 0.02;
  
  System.out.print("Enter the purchase amount: ");
  purchase = kb.nextDouble();
  
  pstax = purchase * STATE_TAX;
  pctax = purchase * COUNTY_TAX;
  ttax = pstax + pctax;
  tcost = purchase + pstax + pctax;
  
  System.out.println("");
  System.out.println("Purchase amount: " + purchase );
  System.out.println("");
  System.out.println("State tax: $" + pstax);
  System.out.println("");
  System.out.println("County tax: $" + pctax);
  System.out.println("");
  System.out.println("Total tax: $" + ttax);  
  System.out.println("");
  System.out.println("Total amount: $" + tcost);
   

  
  } 

}