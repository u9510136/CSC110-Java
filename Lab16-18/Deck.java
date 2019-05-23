//Hsuan-Yu Lin(Sam) CSC110 noon class
//Deck class

import java.util.ArrayList;
import java.util.Random;

public class Deck{

  private ArrayList<Card> deck = new ArrayList<>();
  public Random rand = new Random();

  public Deck(){
    
    for( Suit suit : Suit.values() ){
      for( Rank rank : Rank.values() ){
        deck.add( new Card( suit , rank ));
      }
    }
  }
  
  public void shuffle(){
  
    int num1;
    int num2;
  
    for( int i = 0 ; i < deck.size() ; i++ ){
      num1 = rand.nextInt( deck.size() );
      num2 = rand.nextInt( deck.size() );
      System.out.println(num1 + " " + num2 );
      Card swap1 = deck.get(num1);
      Card swap2 = deck.get(num2);
      deck.set( num1 , swap2 );
      deck.set( num2 , swap1 );
    }
  }
  
  public Card deal(){
    
    Card draw = deck.get(0);
    deck.remove(0);
    
    return draw; 
  }
  
  public int report(){
   
   return deck.size();
  }
  
  public String toString(){
    
    String result;
    
    result = "The card remaining is the Deck:\n";
    
    for( int i = 0 ; i < deck.size() ; i++ ){
      result = result + deck.get(i) + "\n";
    }
    
    return result;
  }


  public static void main( String[] arg ){      

    Deck deck1 = new Deck();
    
    System.out.println(deck1);
    System.out.println(deck1.report());
    
    deck1.shuffle();
     
    System.out.println(deck1);
    System.out.println(deck1.report());
    
    for( int i = 0 ; i < 10 ; i++){
      deck1.deal();
    }     
      
    System.out.println(deck1);
    System.out.println(deck1.report());
        
  } 
}