/*CSC 110 Hsuan-Yu Lin(Sam) noon class
  Lab06b Coordinate and Line*/
  
import java.util.Scanner;
  
public class Lab06b{
  public static void main( String[] args ){
  
    Scanner kb = new Scanner(System.in);
    
    double x;
    double y;
    double x1;
    double y1;
    double x2;
    double y2;
    double s1;
    double s2;
    
    //Part 1
    System.out.println("Enter the coordinate and I will tell you whether"
                       + " point lies in a triangle: (0,0), (200,0), (0,100)");
    System.out.print("Please enter coordinate with a space:  ");
    x = kb.nextDouble();
    y = kb.nextDouble();
    
    if( x >= 0 && y >= 0 && (x + 2 * y <= 200) ){
      System.out.println("Your point IS in the triangle");
    }
    else{
      System.out.println("Your point is NOT in the triangle");
    }
    System.out.println();
    
    //Part 2
    System.out.println("Enter the coordinates of 3 points and I will tell you" 
                        + " whether those points are collinear.");
    System.out.print("Enter the First coordinate with a space:  ");
    x = kb.nextDouble();
    y = kb.nextDouble();
    System.out.print("Enter the Second coordinate with a space:  ");
    x1 = kb.nextDouble();
    y1 = kb.nextDouble();
    System.out.print("Enter the Third coordinate with a space:  ");
    x2 = kb.nextDouble();
    y2 = kb.nextDouble();
    
    s1 = (x - x1)/(y - y1);
    s2 = (x - x2)/(y - y2);
     
    if( s1 == s2 ){
      System.out.println("The entered points are collinear.");
    }
    else{
      System.out.println("The entered points are not collinear.");
    }
  } 

}