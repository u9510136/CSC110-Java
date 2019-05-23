
   // a main method for the Card class: for testing Card class
   public static void main( String[] arg ) {      
      Card c1 = new Card( 5, 3 );
      Card c2 = new Card( 2, 0 );
      Card c3 = new Card( 8, 2 );
      Card c4 = new Card( 5, 1 );
      Card queen = new Card( 12, 0 );
      Card king = new Card( 13, 3 );
      
      System.out.println( c1 );
      System.out.println( c2 );
      System.out.println( c3 );
      System.out.println( queen );
      System.out.println( king );
      
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
         
      if (king.compareTo( queen ) > 0)
         System.out.println( king + " outranks " + queen );
      else if (king.compareTo( queen ) < 0)
         System.out.println( queen + " outranks " + king );
      else System.out.println( king + " is equal to " + queen );
      
      if ( c1.equals( c2 ) )
         System.out.println( c1 + " is equal to " + c2);
      else
         System.out.println( c1 + " is NOT equal to " + c2);

      if ( c1.equals( c4 ) )
         System.out.println( c1 + " is equal to " + c4);
      else
         System.out.println( c1 + " is NOT equal to " + c4);
   }
