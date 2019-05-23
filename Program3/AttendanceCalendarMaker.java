//Hsuan-Yu Lin(Sam) noon class Program 3
/*This program computes and shows the calneder in the semester of 
  date of class with letting the users enter the first date of class 
  and how many days of class they have per week. Except the first date of class
  the class date will be computed at ClassDay.java*/

import java.util.Scanner;

//main program: get information from the users and show the calendar
public class AttendanceCalendarMaker{
  public static void main( String[] args ){
    
    int month;
    int day;
    int year;
    int meetingPerWeek;
    char dayOfWeek;
    final int TOTAL_WEEK = 16;
    
    month = getMonth();
    day = getDay();
    year = getYear();
    meetingPerWeek = getMeetingsPerWeek();
    if( meetingPerWeek == 3 || meetingPerWeek == 4 ){
      dayOfWeek = 'M';
    }
    else{
      dayOfWeek = 'T';
    }

    ClassDay current = new ClassDay( month , day , year 
                                    , dayOfWeek , meetingPerWeek );
    if( meetingPerWeek == 2 ){
      System.out.printf("Wk\t  T\t  R\n");
    }
    else if( meetingPerWeek == 3 ){
      System.out.printf("Wk\t  M\t  W\t  F\n");
    }
    else{
      System.out.printf("Wk\t  M\t  T\t  W\t  R\n");
    }
    
    for( int i = 0 ; i < TOTAL_WEEK ; i++ ){
      System.out.printf("%2d\t", i + 1 );
      for ( int j = 0 ; j < meetingPerWeek ; j++ ){
        System.out.printf( current + "\t");
        current = current.nextDay();
      }
      System.out.println();
    }
    System.out.println("Attendance Calendar Maker terminating.");
  }
  
  //get the first class month from the users
  public static int getMonth(){
    
    Scanner kb = new Scanner(System.in);
    
    int result;
    
    System.out.print("Please Enter the starting month(8-Aug or 1-Jan): ");
    result = kb.nextInt();
    while( result != 1 && result != 8 ){
      System.out.println("Semesters begins in either August (8) or January (1)");
      System.out.print("Please Enter the starting month(8-Aug or 1-Jan): ");
      result = kb.nextInt();
    }
    return result;
  }
  
  //get the first class day from the users
  public static int getDay(){
    
    Scanner kb = new Scanner(System.in);
    
    int result;
    
    System.out.print("Please Enter the date of first class: ");
    result = kb.nextInt();
    while( result < 1 || result > 31 ){
      System.out.println("Day value must between 1 and 31, inclusive.");
      System.out.print("Please Enter the date of first class: ");
      result = kb.nextInt();
    }
    return result;
  }
  
  //get the class year from the users
  public static int getYear(){
  
    Scanner kb = new Scanner(System.in);
    
    int result;
    
    System.out.print("Please Enter the year containing this semester: ");
    result = kb.nextInt();
    while( result < 1 || result > 3000 ){
      System.out.println("Year value must between 1 and 3000, inclusive.");
      System.out.print("Please Enter the year containing this semester: ");
      result = kb.nextInt();
    }
    return result;
  }
  
  //get how many classes per week from the users
  public static int getMeetingsPerWeek(){
    
    Scanner kb = new Scanner(System.in);
    
    int result;
    
    System.out.print("Please Enter the class meeting per week: ");
    result = kb.nextInt();
    while( result != 2 && result != 3 && result != 4){
      System.out.println("The class meeting per week must be 2, 3 or 4");
      System.out.print("Please Enter the class meeting per week: ");
      result = kb.nextInt();
    }
    return result;
  } 
}