// Use this client to help test your Rectangle class for Lab13
// Download it into the same folder as your Rectangle.java file.
// Add other tests if you want to.
public class RectangleClient {
   public static void main( String[] args ) {
   
      // to make sure validation is working,
      // try each of the following commented statements, one at a time
      // Rectangle crash1 = new Rectangle( 0, 5 );
      // Rectangle crash1 = new Rectangle( 4, 0 );
      // Rectangle crash1 = new Rectangle( 0, 5, 'O', '^' );
      // Rectangle crash1 = new Rectangle( 4, 0, 'O', '^' );     
      Rectangle box1 = new Rectangle( 4, 5 );
      box1.setIndent(-1);
      // box1.setLength(0);
      // box1.setWidth(0);
      System.out.println( box1 );
      Rectangle box2 = new Rectangle( 6, 12, '+', 'X' );
      box2.setIndent( 5 );
      System.out.println( box2 );
      Rectangle box3 = new Rectangle( 11, 20, '$', 'o' );
      box3.setIndent( 20 );
      System.out.println( box3 );
   }
}