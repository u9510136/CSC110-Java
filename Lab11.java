/*CSC 110 Hsuan-Yu Lin(Sam) noon class
  Lab11 Draw Shape with subprogram*/
  
import java.util.Scanner;
  
public class Lab11{
  public static void main( String[] args ){
  
  drawDiamond();
  drawDunce();
  drawIceCreamCone();
  drawKingJullian();

  } 
  
  public static void drawDiamond(){
    
    System.out.println("Diamond:");
    figure1();
    figure2();
    System.out.println();
  }
  
  public static void drawDunce(){
    
    System.out.println("Dunce:");
    figure1();
    figure3();
    System.out.println();
  }
  
  public static void drawIceCreamCone(){
    
    System.out.println("Ice Cream Cone:");
    figure4();
    figure2();
    System.out.println();
  }
  
  public static void drawKingJullian(){
    
    System.out.println("King Jullian:");
    figure4();
    figure3();
  }
  
  public static void figure1(){
  
    System.out.println("   *   ");
    System.out.println("  * *  ");
    System.out.println(" *   * ");
    System.out.println("*     *"); 
  }
  
  public static void figure2(){
  
    System.out.println("*     *");
    System.out.println(" *   * ");
    System.out.println("  * *  ");
    System.out.println("   *   "); 
  }
  
  public static void figure3(){

    System.out.println("* _ _ *");
    System.out.println("\\ O O /");
    System.out.println(" \\ * / ");
    System.out.println("  ---  "); 
  }
  
  public static void figure4(){
  
    System.out.println("   O   ");
    System.out.println("  / \\  ");
    System.out.println(" /   \\ ");
    System.out.println("(~~~~~)"); 
  }
}