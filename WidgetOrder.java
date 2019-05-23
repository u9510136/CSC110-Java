/*CSC 110 Hsuan-Yu Lin(Sam) noon class
  WidgetOrder 
  This program let users input the number of 2 types of wiget and region
  then calculate and display the total cost of their order*/
  
import java.util.Scanner;
  
public class WidgetOrder{
  public static void main( String[] args ){
  
    Scanner kb = new Scanner(System.in);
    
    final float B_WIDGET = 39.99f;
    final float L_WIDGET = 19.99f;
    final int AMO_DISC = 25; //order amount for discount
    final float DISCOUNT = 0.05f;
    final float TAX_A = 0.062f;
    final float TAX_B = 0.074f;
    final float SHIP_FEE_A = 10;
    final float SHIP_FEE_B = 30;
    int numOfBigWidget;
    int numOfLilWidget;
    char region;
    float grossCost;
    float discount;
    float netCost;
    float tax;
    float shipFee;
    float totalCost; 
    
    System.out.println("Welcome to the Widgets Order App");
    System.out.println("Big and Lil Widgets for regions A and B");
    System.out.println("Plesse place your order");
    System.out.print("Number of Big Wigets:  ");
    numOfBigWidget = kb.nextInt();
    
    if(numOfBigWidget < 0){
      System.out.println("Invalid number of Big Widgets. Terminating...");
    }
    else{
      System.out.print("Number of Lil Widgets:  ");
      numOfLilWidget = kb.nextInt();
    
      if(numOfLilWidget < 0){
        System.out.println("Invalid number of Lil Widgets. Terminating...");
      }
      else{
        if(numOfBigWidget == 0 && numOfLilWidget == 0){
          System.out.println("No, Widgets ordered. Terminating...");
        }
        else{
          System.out.print("What region are you in?(A/B):  ");
          region = kb.next().charAt(0);
          
          if(region != 'A' && region != 'a' && region != 'B' && region != 'b'){
            System.out.println("Invalid region entered. Terminating...");
          }
          else{
            //gross cost
            grossCost = numOfBigWidget * B_WIDGET + numOfLilWidget * L_WIDGET;
            //discount
            if(numOfBigWidget > AMO_DISC && numOfLilWidget <= AMO_DISC){
              discount = grossCost * DISCOUNT;
            }
            else if(numOfBigWidget > AMO_DISC && numOfLilWidget > AMO_DISC){
              discount = grossCost * DISCOUNT * 2;
            }           
            else if(numOfBigWidget <= AMO_DISC && numOfLilWidget > AMO_DISC){
              discount = grossCost * DISCOUNT * 0.5f;
            }
            else{
              discount = 0;
            }
            netCost = grossCost - discount;  //net cost
            //tax & shipping charges
            if(region == 'a' || region == 'A'){
              tax = netCost * TAX_A;
              if(netCost > 100){
                shipFee = 0;
              }
              else{
                shipFee = SHIP_FEE_A;
              }
            }
            else{
              tax = netCost * TAX_B;
              if(tax > SHIP_FEE_B){
                shipFee = SHIP_FEE_B / 2;
              }
              else{
                shipFee = SHIP_FEE_B;
              }
            }
            totalCost = netCost + tax + shipFee; // totalCost
            System.out.println("       Details for your Order:");
            System.out.printf("Big Widgets ordered: $ %10d\n", numOfBigWidget);
            System.out.printf("Lil Widgets ordered: $ %10d\n", numOfLilWidget);
            System.out.printf("   Total Gross Cost: $ %10.2f\n", grossCost);
            System.out.printf("    Discount Amount: $ %10.2f\n", discount);
            System.out.printf("     Total Net Cost: $ %10.2f\n", netCost);
            System.out.printf("      Amount of Tax: $ %10.2f\n", tax);
            System.out.printf("       Shipping Fee: $ %10.2f\n", shipFee);
            System.out.printf("  Total Amount Owed: $ %10.2f\n", totalCost);
          } //region
        } //both wiget
      } //number of Lil Wiget
    } //number of Big Wiget
  } //main
} //class