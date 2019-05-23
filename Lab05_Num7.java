/*CSC 110 Hsuan-Yu Lin(Sam) noon class
  Lab05_Num7 Sort name*/
  
import java.util.Scanner;
  
public class Lab05_Num7{
  public static void main( String[] args ){
  
    Scanner kb = new Scanner(System.in);
    
    String name1;
    String name2;
    String name3;
    
    System.out.print("Enter the first name:  ");
    name1 = kb.nextLine();
    System.out.print("Enter the second name:  ");
    name2 = kb.nextLine();
    System.out.print("Enter the third name:  ");
    name3 = kb.nextLine();
    
    if(name1.compareTo(name2) <= 0 && name2.compareTo(name3) <= 0){
        System.out.println(name1);
        System.out.println(name2);
        System.out.println(name3);
    }
    else if(name1.compareTo(name3) <= 0 && name3.compareTo(name2) <= 0){
        System.out.println(name1);
        System.out.println(name3);
        System.out.println(name2);
    }
    else if(name2.compareTo(name3) <= 0 && name3.compareTo(name1) <= 0){
        System.out.println(name2);
        System.out.println(name3);
        System.out.println(name1);
    }
    else if(name2.compareTo(name1) <= 0 && name1.compareTo(name3) <= 0){
        System.out.println(name2);
        System.out.println(name1);
        System.out.println(name3);
    }
    else if(name3.compareTo(name1) <= 0 && name1.compareTo(name2) <= 0){
        System.out.println(name3);
        System.out.println(name1);
        System.out.println(name2);
    }
    else if(name3.compareTo(name2) <= 0 && name2.compareTo(name1) <= 0){
        System.out.println(name3);
        System.out.println(name2);
        System.out.println(name1);
    }
  } 

}