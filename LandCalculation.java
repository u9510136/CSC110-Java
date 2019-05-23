/*CSC 110 Hsuan-Yu Lin(Sam) noon class
  LandCalculation*/
  
public class LandCalculation{
  public static void main( String[] args ){
   
    final double rate = 43560;
    double sf , acres;
    
    sf = 389767;
    acres = sf / rate;
    
    System.out.print("A tract of land with " + sf + " sqare feet has ");
    System.out.print(acres + " acres.");
  
  } 

}