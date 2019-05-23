/*CSC 110 Hsuan-Yu Lin(Sam) noon class
  Program2 standard and Gaussian number*/
  
import java.util.Scanner;
import java.util.Random;
import java.io.*;
  
public class Prog02{
  public static void main( String[] args ) throws IOException{
  
    Scanner kb = new Scanner(System.in);
    Random rand = new Random();
    PrintWriter outputFile = new PrintWriter("regNums.txt");
    
    int numberOfGenerate;
    int randNum;
    double minNum;
    double maxNum;
    double sum;
    double range;
    double average;
    double txtNum;
    double standardDeviation;
    int gaussNum;
    final int GAUSS_STDEV = 10;
    final int GAUSS_MEAN = 75;
    int counter;
    int checkNum;
    
    System.out.print("How many random number should I renerate:  ");
    numberOfGenerate = kb.nextInt();
    
    System.out.println();
    
    minNum = 100;
    maxNum = 0;
    sum = 0;
    
    for( int i = 0 ; i < numberOfGenerate ; i++ ){
      randNum = rand.nextInt(101);
      outputFile.println(randNum);
      
      if( randNum < minNum ){
        minNum = randNum;
      }
      if( randNum > maxNum ){
        maxNum = randNum;
      }
      sum = sum + randNum;
    }
    
    average = sum / numberOfGenerate;
    range = maxNum - minNum + 1;
    
    outputFile.close();
    
    File file = new File("regNums.txt");
    Scanner inputFile = new Scanner(file);
    
    sum = 0;
    
    while ( inputFile.hasNextDouble() ){
      txtNum = inputFile.nextDouble();
      sum = sum + Math.pow( txtNum - average , 2 );
    }
    
    inputFile.close();
    
    standardDeviation = Math.sqrt( sum / numberOfGenerate );
       
    System.out.println("Measures for the uniformly distributed integers in "
                       + "file, regNums.txt:");
    System.out.printf("  Min: %.0f\n", minNum);
    System.out.printf("  Max: %.0f\n", maxNum);
    System.out.printf("Range: %.0f\n", range);
    System.out.printf(" Mean: %.2f\n", average);
    System.out.printf("StDev: %.2f\n", standardDeviation);

    FileWriter fw = new FileWriter("regNums.txt", true);
    PrintWriter outputFile2 = new PrintWriter(fw);
    
    outputFile2.printf("  Min: %.0f", minNum);
    outputFile2.println();
    outputFile2.printf("  Max: %.0f", maxNum);
    outputFile2.println();
    outputFile2.printf("Range: %.0f", range);
    outputFile2.println();
    outputFile2.printf(" Mean: %.2f", average);
    outputFile2.println();
    outputFile2.printf("StDev: %.2f", standardDeviation);
    
    outputFile2.close();
    // Part 1 end
    
    PrintWriter outputFile3 = new PrintWriter("gaussNums.txt");
    
    sum = 0;
    
    for( int j = 0 ; j < numberOfGenerate ; j++ ){
      gaussNum =(int)( rand.nextGaussian()* GAUSS_STDEV + GAUSS_MEAN );
      outputFile3.println(gaussNum);
      
      if( gaussNum < minNum || j == 0 ){
        minNum = gaussNum;
      }
      if( gaussNum > maxNum || j == 0 ){
        maxNum = gaussNum;
      }
      sum = sum + gaussNum;
    }
    average = sum / numberOfGenerate;
    range = maxNum - minNum + 1;
    
    outputFile3.close();
    
    PrintWriter outputFile4 = new PrintWriter("barChartFile.txt");
    
    File file2 = new File("gaussNums.txt");
    Scanner inputFile2 = new Scanner(file2);
    
    System.out.println();
    System.out.println("Bar Chart for the normally distributed integers "
                       + "in file, gaussNums.txt (50..100):");
    
    for( int k = 50 ; k <= 100 ; ++k ){
      counter = 0;
      inputFile2 = new Scanner( new File("gaussNums.txt"));
      while( inputFile2.hasNextInt() ){
        checkNum = inputFile2.nextInt();
        if( checkNum == k ){
          counter++;
        }
      }
      if( k != 100 ){
        System.out.print("  " + k + ": " );
        outputFile4.print("  " + k + ": " );
      }
      else{
        System.out.print(" " + k + ": " );
        outputFile4.print(" " + k + ": " );
      }
      for(int m = 0 ; m < counter ; m++ ){
        System.out.print("*");
        outputFile4.print("*");
      }
      System.out.println();
      outputFile4.println();  
    }
    inputFile2.close();
    outputFile4.close();
    
    File file3 = new File("gaussNums.txt");
    Scanner inputFile3 = new Scanner(file3);
    
    sum = 0;
    
    while ( inputFile3.hasNextDouble() ){
      txtNum = inputFile3.nextDouble();
      sum = sum + Math.pow( txtNum - average , 2 );
    }
    
    inputFile3.close();
    
    standardDeviation = Math.sqrt( sum / numberOfGenerate );
    
    System.out.println();
    System.out.println("Measures for the normally distributed integers in "
                       + "file, gaussNums.txt:");
    System.out.printf("  Min: %.0f\n", minNum);
    System.out.printf("  Max: %.0f\n", maxNum);
    System.out.printf("Range: %.0f\n", range);
    System.out.printf(" Mean: %.2f\n", average);
    System.out.printf("StDev: %.2f\n", standardDeviation);

    FileWriter fw2 = new FileWriter("gaussNums.txt", true);
    PrintWriter outputFile5 = new PrintWriter(fw2);
   
    outputFile5.println();
    outputFile5.printf("  Min: %.0f", minNum);
    outputFile5.println();
    outputFile5.printf("  Max: %.0f", maxNum);
    outputFile5.println();
    outputFile5.printf("Range: %.0f", range);
    outputFile5.println();
    outputFile5.printf(" Mean: %.2f", average);
    outputFile5.println();
    outputFile5.printf("StDev: %.2f", standardDeviation);
    
    outputFile5.close();
    
    
  } // public static void

} // public class