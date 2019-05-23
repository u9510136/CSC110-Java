/*CSC 110 Hsuan-Yu Lin(Sam) noon class
  Lab08 Draw Shape*/
  
import java.util.Scanner;
  
public class Lab08_DrawShape{
  public static void main( String[] args ){
  
    Scanner kb = new Scanner(System.in);
    
    int size;
    int column;
    int row;
    
    System.out.print("Enter the size:  ");
    size = kb.nextInt();
    
    for ( row = 0 ; row < size ; row++ ){
      for ( column = 0 ; column < size ; column++ ){
        if ( row >= column ){
          System.out.print("*");
        }
        else{
          System.out.print(" ");
        }
      }
      for ( column = size ; column < 2 * size ; column++ ){
        if ( size * 2 - row - 1 <= column ){
          System.out.print("*");
        }
        else{
          System.out.print(" ");
        }
      }
      System.out.println();
    } 

  } 

}