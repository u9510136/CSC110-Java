/*CSC 110 Hsuan-Yu Lin(Sam) noon class
  Lab09 LineNumbers*/
  
import java.util.Scanner;
import java.io.*;
  
public class LineNumbers{
  public static void main( String[] args ) throws FileNotFoundException{
  
    Scanner kb = new Scanner(System.in);
    
    String fileName;
    String str;
    int line = 1;

    System.out.print("Enter the file name of the text:  ");
    
    fileName = kb.nextLine();
    
    File file = new File(fileName);
    Scanner inputFile = new Scanner(file);
    
    PrintWriter outputFile = new PrintWriter("WithLineNumbers.txt");
    
    System.out.println("It will look like this:");
    
    while (inputFile.hasNext()){
      str = inputFile.nextLine();
      System.out.println(line + ": " + str );
      outputFile.println( line + ": " + str );
      line++;
    }
    inputFile.close(); 
    outputFile.close();
    
  } 

}