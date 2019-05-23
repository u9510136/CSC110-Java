/*CSC 110 Hsuan-Yu Lin(Sam) noon class
  Lab08 Dice Game*/
  
import java.util.Scanner;
import java.util.Random;
  
public class Lab08_DiceGame{
  public static void main( String[] args ){
  
    Scanner kb = new Scanner(System.in);
    Random rand = new Random();
    
    int dice1;
    int dice2;
    int sumOfDice;
    int maxOfSum;
    
    maxOfSum = 0;
    
    for ( int i = 0 ; i < 4 ; i++ ){
      
      sumOfDice = 0;
      do{
        dice1 = rand.nextInt(6) + 1;
        dice2 = rand.nextInt(6) + 1;
          if( dice1 + dice2 != 7){
            sumOfDice = sumOfDice + dice1 + dice2;
          }
        System.out.println("Rolled " + dice1 + " and " + dice2);
      }while( dice1 + dice2 != 7);
      
      if( maxOfSum < sumOfDice ){
        maxOfSum = sumOfDice; 
      }
      
      System.out.println("Sum of rolls before rolling out 7 is:  " + sumOfDice); 
    }
    System.out.println("Best round had a dice sum of " + maxOfSum);
    
    
    
  } 

}