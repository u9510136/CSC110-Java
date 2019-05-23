/*CSC 110 Hsuan-Yu Lin(Sam) noon class
  Lab12 Formula test*/
  
import java.util.Scanner;
  
public class Lab12{
  public static void main( String[] args ){
  
    Scanner kb = new Scanner(System.in);
    
    int x;
    int y;
    String test;
    
    System.out.print("Enter the base: ");
    x = kb.nextInt();    
    System.out.print("Enter the power: ");
    y = kb.nextInt();    
    System.out.printf("%d raised to the power of %d is %d.\n", x, y, power(x,y));
    System.out.println();
    
    System.out.print("Enter the integer you want to test: ");
    x = kb.nextInt();
    System.out.printf("Sum of the digits in %d is %d.\n", x, sumDigits(x));
    System.out.println();
    
    System.out.print("Enter the String you want to test: ");
    test = kb.next().trim();
    System.out.printf("%s %s a plaindrome.\n", test, isPalindrome(test)?"IS":"IS NOT");
    System.out.println();
    
    System.out.print("Enter the String you want to test: ");
    test = kb.next();
    System.out.printf("%s has %d uppercase letters.\n", test, countUpperCase(test));
    System.out.println();
    
    System.out.print("Enter the String you want to test: ");
    test = kb.next();
    System.out.printf("%s devoweled became: %s.\n", test, devowel(test));
    System.out.println();

  } 
  
  public static int power(int x, int y){  //power
    
    int result;
    result = 1;
    
    if( y != 0 ){
      for( int i = 0 ; i < y ; i++ ){
        result = result * x; 
      }
    }
    return result;
  }
  
  public static int sumDigits( int x ){  //sumDigits
    
    int result;
    int digit;
    
    result = 0;
    
    do{
      digit = x % 10;
      result = result + digit;
      x = x / 10;
    }while(x != 0 );
    
    return result;
  }
  
  public static boolean isPalindrome( String test ){ //isPalindrome
    boolean status;
    char front;
    char behind;
    int counter;
  
    int i = 0;
    int j = test.length() - 1;
    counter = 0;
  
    front = test.charAt(i);
    behind = test.charAt(j);
 
    do{
      if( front != behind ){
        counter++ ;
      }
      i++;
      j--;
    }while( i == j || j == 0 );
  
    if(counter > 0){
      status = false;
    }
    else{
      status = true;
    }    
    return status;
  }
  
  public static int countUpperCase( String test ){ //countUpperCase
    
    int counter;
    counter = 0;
    
    for( int i = 0 ; i < test.length() ; i++ ){
      if( Character.isUpperCase(test.charAt(i)) ){
        counter++;
      }
    }
    
    return counter;
  }
  
  public static String devowel( String test ){
    
    String modified;
    modified = "";
    
    for( int i = 0 ; i < test.length() ; i++ ){
      if( test.toLowerCase().charAt(i) != 'a' && 
          test.toLowerCase().charAt(i) != 'e' && 
          test.toLowerCase().charAt(i) != 'i' && 
          test.toLowerCase().charAt(i) != 'o' && 
          test.toLowerCase().charAt(i) != 'u' ){
            modified = modified + test.charAt(i);
          }
    }
    
    return modified;
  }

} //end of class