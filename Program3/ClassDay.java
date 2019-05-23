//Hsuan-Yu Lin(Sam) noon class Program 3
/*This program computes and shows the calneder in the semester of 
  date of class with letting the users enter the first date of class 
  and how many days of class they have per week. Except the first date of class
  the class date will be computed at ClassDay.java*/

public class ClassDay{
  private int month;
  private int day;
  private int year;
  private int perWeek;
  private char dayOfWeek;
  
  public ClassDay( int month , int day , int year 
                  , char dayOfWeek , int perWeek ){
    this.month = month;
    this.day = day;
    this.year = year;
    this.perWeek = perWeek;
    this.dayOfWeek = dayOfWeek; 
  }
  
  //compute the next date of class
  public ClassDay nextDay(){
    
    int max = findMaxDays( month , year );
    
    if( perWeek == 2 && dayOfWeek == 'T'){
      this.day += 2;
      this.dayOfWeek = 'R';
    }
    else if( perWeek == 2 && dayOfWeek == 'R'){
      this.day += 5;
      this.dayOfWeek = 'T';
    }
    else if( perWeek == 3 && dayOfWeek == 'M'){
      this.day += 2;
      this.dayOfWeek = 'W';
    } 
    else if( perWeek == 3 && dayOfWeek == 'W'){
      this.day += 2;
      this.dayOfWeek = 'F';
    }
    else if( perWeek == 3 && dayOfWeek == 'F'){
      this.day += 3;
      this.dayOfWeek = 'M';
    }
    else if( perWeek == 4 && dayOfWeek != 'R'){
      this.day += 1;
      if( dayOfWeek == 'M' ){
       this.dayOfWeek = 'T';
      }
      else if( dayOfWeek == 'T'){
        this.dayOfWeek = 'W';
      }
      else{
        this.dayOfWeek = 'R';
      } 
    }
    else{
      this.day += 4;
      this.dayOfWeek = 'M';
    }
    if( day > max ){
      day = day - max;
      month++;
    }
    
    ClassDay current = new ClassDay( month , day , year 
                                    , dayOfWeek , perWeek );
    return current;
  }
  
  // return a string to the main program
  public String toString(){
    
    String result = String.format( "%2d/%02d", month, day );
    
    return result;
  }
  
  //decide if the semester year is leap year
  private boolean isLeapYear( int year ){
    
    boolean leapYear = false;
    
    if( year % 400 == 0 ){
      leapYear = true;
    }
    else if( year % 4 == 0 && year % 100 != 0 ){
      leapYear = true;
    }
    return leapYear;
  }
  
  //decide the maximum day by month
  private int findMaxDays( int month , int year ){
    
    int maxDays;
    
    if(( month < 6 && month % 2 == 1) ||( month > 7 && month % 2 == 0 )){ //1.3.5.8.10.12
      maxDays = 31;
    }
    else if( month == 2 ){
      if(isLeapYear(year)){
        maxDays = 29;
      }
      else{
        maxDays = 28;
      }
    }
    else{
      maxDays = 30;
    }
    
    return maxDays;
  }
}