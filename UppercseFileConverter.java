/*CSC 110 Hsuan-Yu Lin(Sam) noon class
  Lab09 UppercseFileConverter*/
  
import java.util.Scanner;
import java.io.*;
  
public class UppercseFileConverter{
  public static void main( String[] args ) throws FileNotFoundException{
  
    Scanner kb = new Scanner(System.in);
    
    String readFileName;
    String writeFileName;
    String str;
    
    System.out.print("Enter the file name to read:  ");
    readFileName = kb.nextLine();
    
    System.out.print("Enter the file name to write:  ");
    writeFileName = kb.nextLine();
    
    File file = new File(readFileName);
    Scanner inputFile = new Scanner(file);
    
    PrintWriter outputFile = new PrintWriter(writeFileName);
    
    while (inputFile.hasNext()){
      str = inputFile.nextLine();
      outputFile.println(str.toUpperCase());
    }

    inputFile.close();
    outputFile.close();
    
  } 

}