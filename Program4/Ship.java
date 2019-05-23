//Hsuan-Yu Lin(Sam) CSC110 noon class
//Program 4 Ship.class
//This class create a single ship with given parameter

public class Ship{

  private int row;
  private int col;
  private int size;
  private boolean verti;
  private char id;
  
  public Ship( int r , int c , int s , boolean v , char i ){
  
    row = r;
    col = c;
    size = s;
    verti = v;
    id = i;
  }
  
  public int getRow(){
    return row;
  }
  
  public int getCol(){
    return col;
  }
  
  public int getSize(){
    return size;
  }
  
  public boolean getVerti(){
    return verti;
  }
  
  public char getID(){
    return id;
  }
  
  public String toString(){
    
    return " " + id;
  }
  
  public static void main( String[] arg ){
  
    
  }


}