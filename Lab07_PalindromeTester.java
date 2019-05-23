/*CSC 110 Hsuan-Yu Lin(Sam) noon class
  Lab07 Palindrome tester*/
  
import java.util.Scanner;
  
public class Lab07_PalindromeTester{
  public static void main( String[] args ){
  
  Scanner kb = new Scanner(System.in);
  
  String input;
  char front;
  char behind;
  int counter;
  
  System.out.print("Enter the string you want to test:  ");
  input = kb.next();
  
  int i = 0;
  int j = input.length() - 1;
  counter = 0;
  
  front = input.charAt(i);
  behind = input.charAt(j);
  
  
  do{
    if( front != behind ){
     counter++ ;
    }
    i++;
    j--;
  }while( i == j || j == 0 );
  
  if(counter > 0){
    System.out.println("The input string, " + input + 
                       " IS NOT a palidrome.");
  }
  else{
    System.out.println("The input string, " + input + 
                       " IS a palidrome.");
  }
  
  } 
}