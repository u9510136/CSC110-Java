/*CSC 110 Hsuan-Yu Lin(Sam) noon class
  Arrays subprograms practice*/

import java.util.Scanner;

public class Lab14{
  public static void main( String[] args ){
  
    Scanner kb = new Scanner(System.in);
  
    int size;
    int[] test;
    int diff;
    boolean sort;
    int[] even;
    int[] sumOfPair;
    int[] test2;
    int size2;
    int[] unionArray;
  
    System.out.println("This program includes 5 subprograms to test arrays");
  
    System.out.print("Enter the size of array:  ");
    size = kb.nextInt();
  
    test = new int[size];
  
    for( int i = 0 ; i < size ; i++ ){
      System.out.print("Enter the number you want to store in the array: ");
      test[i] = kb.nextInt();
    }

    diff = range( test );
    System.out.println("The range in the array is " + diff );
    System.out.println();
    
    sort = isSorted( test );
    System.out.print("The array is ");
    System.out.println(sort ? "SORTED" : "NOT SORTED");
    System.out.println();
    
    even = extractEvens( test );
    for( int j = 0 ; j < even.length ; j++ ){
      System.out.print( even[j] + " ");
    }
    System.out.println();
    System.out.println();

    
    sumOfPair = compress( test );
    for( int k = 0 ; k < sumOfPair.length ; k++ ){
      System.out.print( sumOfPair[k] + " " );
    }
    System.out.println();
    System.out.println();

    System.out.print("Enter the size for 2nd array:  ");
    size2 = kb.nextInt();
    for( int m = 0 ; m < size2 ; m++ ){
      System.out.print("Enter the element in 2nd array: ");
    }
    unionArray = union( test , test2 );
    for( int n = 0 ; n < unionArray.length ; n++ ){
      System.out.print( unionArray[n] + " ");
    }
    
      
  } //end of main
  
  public static int range( int array[] ){
    
    int range;
    int max;
    int min;
    
    max = array[0];
    min = array[0];
    
    for( int i = 1 ; i < array.length ; i++ ){
      if( array[i] > max ){
        max = array[i];
      }
      else if( array[i] < min ){
        min = array[i];
      }
    }
    range = max - min + 1;
    
    return range;
  }
  
  public static boolean isSorted( int array[] ){
    
    boolean isSort;
    isSort = true;
    
    for( int i = 0 ; i < array.length - 1 ; i++ ){
      if( array[i] > array[i+1] ){
        isSort = false;
      }
    }
    return isSort;
  }
  
  public static int[] extractEvens( int array[] ){
    
    int[] even;
    int count;
    int index;
    index = 0;
    count = 0;
    
    for( int i = 0 ; i < array.length ; i++ ){
      if( array[i] % 2 == 0 ){
        count++;
      }
    }
    even = new int[count];
    
    for( int j = 0 ; j < array.length ; j++ ){
      if( array[j] % 2 == 0 ){
        even[index] = array[j];
        index++; 
      }
    }
    
    return even;
  }
  
  public static int[] compress( int array[] ){
    
    int sum[];
    
    if( array.length % 2 == 0 ){
      sum = new int[array.length / 2 ];
      for( int i = 0 ; i < array.length ; i += 2 ){
        sum[ i / 2 ] = array[ i ] + array[ i + 1 ];
      }
    }
    else{
      sum = new int[array.length / 2 + 1 ];
      for( int j = 0 ; j < array.length - 1  ; j += 2 ){
        sum[ j / 2 ] = array[ j ] + array[ j + 1 ];
      }
      sum[sum.length - 1 ] = array[ array.length - 1 ];
    }
    
    return sum;

  }
  
  public static int[] union( int array1[] , int array2[] ){
    
    int[] union;
    
  }
}