//Hsuan-Yu Lin(Sam) CSC110 noon class
//Lab13 Rectangle class

public class Rectangle{

  private double length;
  private double width;
  private char pen;
  private char fill;
  private int indent;
  
  public Rectangle( double len , double w ){
    if( len > 0 && w > 0 ){
      length = len;
      width = w;
      pen = '*';
      fill = ' ';
    }
  }
  
  public Rectangle( double len , double w , char p , char f ){
    if( len > 0 && w > 0 ){
      length = len;
      width = w;
      pen = p;
      fill = f;
    }
  }
  
  public double getLength(){
    return length;
  }
  
  public double getWidth(){
    return width;
  }
  
  public void setLength( double len ){
    if( len <= 0 ){
      throw new IllegalArgumentException("Invalid length for Rectangle object");
    }
    else{
      length = len;
    }
  }
  
  public void setWidth( double wid ){
    if( wid <= 0 ){
      throw new IllegalArgumentException("Invalid width for Rectangle object");
    }
    else{
      width = wid;
    }
  }
  
  public void setPen( char c ){
    pen = c;
  }
  
  public void setFill( char c ){
    fill = c;
  }
  
  public void setIndent( int n ){
    if( n < 0 ){
      n = 0;
    }
    indent = n;
  } 

  public String toString(){
    
    String figure;
    
    figure = "";
    
    for( int i = 0 ; i < length ; i++ ){
      for( int j = 0 ; j < indent ; j++ ){
        figure = figure + " ";
      }
      if( i == 0 || i == length - 1 ){
        for( int k = 0 ; k < width ; k++ ){
          figure = figure + pen;
        }
        figure = figure + "\n";
      }
      else{
        for( int l = 0 ; l < width ; l++ ){
          if( l == 0 || l == width - 1 ){
            figure = figure + pen;
          }
          else{
            figure = figure + fill;
          }
        }
        figure = figure + "\n";
      }
    }
    return figure;
  }
}