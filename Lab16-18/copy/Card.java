//Hsuan-Yu Lin(Sam) CSC110 noon class
//Poker card, Card class

public class Card{

  private int rank;
  private int suit;
  
  private const int[] RANK = {1,2,3,4,5,6,7,8,9,10,11,12,13};
  private const int[] SUIT = {0,1,2,3};
    
  public Card( int r , int s ){
   
   if( r < 1 || r > 13 || s < 0 || s > 3 ){
     throw new IllegalArgumentException("Either rank or suit is not valid!!");
   }
   else{
     rank = r;
     suit = s;
   } 
  }
  
  public int compareTo( Card other ){
  
    int result;
    
    return result;
  }
  
  public String toString(){
  
    String result;
  
    return result;
  }
  
  public boolean equals( Card other ){
  
    boolean equal;
    
    return equal;
  }
  
  public void setCard( int r , int s ){
  
  } 

}