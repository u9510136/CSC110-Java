//Hsuan-Yu Lin(Sam) CSC110 noon class
//Poker card, Card class

public class Card{

  private Suit suit;
  private Rank rank;
    
  public Card( Suit s , Rank r ){
    
    suit = s;
    rank = r;

  }
  
  public int compareTo( Card other ){
  
    int result;
    result = 0;
    
    if( rank.compareTo( other.rank ) > 0 ){
      result = 1;
    }
    else if( rank.compareTo( other.rank ) > 0 ){
      result = -1;
    }
    
    return result;
  }
  
  public String toString(){
  
    String result;
    
    result = rank + " of " + suit;
  
    return result;
  }
  
  public boolean equals( Card other ){
  
    boolean equal;
    equal = false;
    
    if( rank.equals( other.rank )){
      equal = true;
    }
    
    return equal;
  }
  
  public Rank getRank(){
    return rank;
  }
  
  public Suit getSuit(){
    return suit;
  }
  
  public static void main( String[] arg ) {      
    Card c1 = new Card( Suit.SPADES, Rank.FIVE );
    Card c2 = new Card( Suit.HEARTS, Rank.TWO );
    Card c3 = new Card( Suit.CLUBS, Rank.EIGHT );
    Card c4 = new Card( Suit.DIAMONDS, Rank.FIVE );
   
    Card r1 = new Card( Suit.CLUBS, Rank.ACE );
    Card r2 = new Card( Suit.DIAMONDS, Rank.JACK );
    Card r3 = new Card( Suit.HEARTS, Rank.QUEEN );
    Card r4 = new Card( Suit.SPADES, Rank.KING );
      
    System.out.println( c1 );
    System.out.println( c2 );
    System.out.println( c3 );
      
    if (c1.compareTo( c2 ) < 0)
        System.out.println( c2 + " outranks " + c1 );
    else if (c1.compareTo( c2 ) > 0)
        System.out.println( c1 + " outranks " + c2 );
          
    if (c1.compareTo( c3 ) < 0)
        System.out.println( c3 + " outranks " + c1 );
    else if (c1.compareTo( c3 ) > 0)
       System.out.println( c1 + " outranks " + c3 );
         
    if (c1.compareTo( c1 ) == 0)
         System.out.println( c1 + " is equal to " + c1 );
    else System.out.println( c1 + " is NOT equal to " + c1 );

    if ( c1.equals( c4 ) )
       System.out.println(c1 + " is equal to " + c4);
    else
       System.out.println(c1 + " is NOT equal to " + c4);
       
    if (r1.compareTo(r2) < 0)
       System.out.println(r1 + " comes before " + r2);
    else if (r1.compareTo(r2) > 0)
       System.out.println(r1 + " comes after " + r2);
    else
       System.out.println(r1 + " is equal to " + r2);
        
    if (r4.compareTo(r3) < 0)
       System.out.println(r4 + " comes before " + r3);
    else if (r4.compareTo(r3) > 0)
      System.out.println(r4 + " comes after " + r3);
    else
       System.out.println(r4 + " is equal to " + r3);
   } 

}