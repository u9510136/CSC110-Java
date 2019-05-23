//Hsuan-Yu Lin(Sam) CSC110 noon class
//Lab13 Car class
/*This program holds some cars data include yearModel, make and speed*/

public class Car{

  private int yearModel;
  private String make;
  private int speed;
  
  public Car( int ym , String m ){
    
    yearModel = ym;
    make = m;
    speed = 0; 
  }
  
  public Car(){
    
    yearModel = 1932;
    make = "DeSoto";
    speed = 0;
  }
  
  public int getYearModel(){
    return yearModel;
  }
  
  public String getMake(){
    return make;
  } 
  
  public int getSpeed(){
    return speed;
  }
  
  public void accelerate(){
    speed = speed + 5;
  }
  
  public void brake(){
    speed = speed - 5;
  }
}