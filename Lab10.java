/*CSC 110 Hsuan-Yu Lin(Sam) noon class
  Lab10 String Manipulation*/
  
import java.util.Scanner;
import java.io.*;
  
public class Lab10{
  public static void main( String[] args ) throws FileNotFoundException{
  
    Scanner kb = new Scanner(System.in);
       
    String str;
    String checkString;
    String indexString;
    int number;
    int row;
    boolean status;

    System.out.println("Enter the possible letters in your word:  ");
    checkString = kb.next().toLowerCase();  
    System.out.println("Enter the number of letters in your target words:  ");
    number = kb.nextInt();
    System.out.println();
    
    while( number < 1 || number > checkString.length() ){
      System.out.println("Number of letters must be between 1 "
                        + "and the nunmber of possible letters.");
      System.out.print("Enter the number of letters in your target words:  ");
      number = kb.nextInt();
      System.out.println();
    }
         
    File file = new File("words.txt");
    Scanner inputFile = new Scanner(file);
    row = 1;
    System.out.println("List of all " + number + "-letters words formed from"
                        + " the letters: " + checkString);
  
    while( inputFile.hasNext() ){
      indexString = checkString;
      str = inputFile.next();
      status = isValidWord( indexString , str , number );

      if( status ){
        System.out.println("   " + row + " " + str);
        row++;
      }
    }
    if( row != 1 ){
      System.out.println("End of list: " + (row - 1) + " words found");
    }
    else{
      System.out.println("No words found");
    }
    inputFile.close();
  } //end of main


  public static boolean isValidWord( String indexString , String str , int number){
    int counter;
    int position;
    boolean status;
  
    counter = 0;
    if( str.length() == number ){
      for ( int i = 0 ; i < str.length() ; i++ ){
        if( indexString.indexOf(str.charAt( i )) != -1 ){
          position = indexString.indexOf(str.charAt( i ));
          indexString = indexString.substring(0, position) + "-"
                      + indexString.substring(position + 1);
          counter++;
        }
      }
    }
    if( counter == number ){
      status = true;
    }
    else{
      status = false;
    }
    return status;
  }
} // end of class