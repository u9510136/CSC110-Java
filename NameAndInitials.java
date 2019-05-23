/*CSC 110 Hsuan-Yu Lin(Sam) noon class
  NameAndInitials*/
  

public class NameAndInitials{
  public static void main( String[] args ){
   
    String first , middle , last ;
    char fir , mid , las ;    

    first = "Hsuan";
    middle = "Yu";
    last  = "Lin";
    
    fir = first.charAt(0);
    mid = middle.charAt(0);
    las = last.charAt(0);
    
    System.out.println("Your name is " + first + " " + middle + " " + last);
    System.out.println("Your initials is " + fir + mid + las);
    
  
  } 

}