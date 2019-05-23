//Hsuan-Yu Lin(Sam) CSC110 noon class
//Lab13 CarDemo
/* This program shows some demos of cars*/

import java.util.Scanner;

public class CarDemo{
  public static void main( String[] args ){
  
    int modelYear;
    String maker;
    final int startSpeed = 0;
    
    Scanner kb = new Scanner(System.in);
    
    System.out.print("Please Enter the model year of the car: ");
    modelYear = kb.nextInt();
    
    System.out.print("Please Enter name of company makes the car: ");
    maker = kb.next();
    
    Car car = new Car( modelYear , maker );
    
    System.out.println();
    System.out.println("The model year of the car: " + car.getYearModel() );
    System.out.println("The name of company: " + car.getMake() );
    System.out.println("The current speed of the car is: " + car.getSpeed()
                       + ". Start testing:");
    for( int i = 0 ; i < 5 ; i++ ){
      car.accelerate();
      System.out.println("Current speed of the car:  " + car.getSpeed() );
    }
    
    System.out.println();
    
    for( int j = 0 ; j < 5 ; j++ ){
      car.brake();
      System.out.println("Current speed of the car:  " + car.getSpeed() );
    }
    
    System.out.println();
    System.out.println();
    
    Car decar = new Car();
    
    System.out.println();
    System.out.println("The model year of the car: " + decar.getYearModel() );
    System.out.println("The name of company: " + decar.getMake() );
    System.out.println("The current speed of the car is: " + decar.getSpeed()
                       + ". Start testing:");
    for( int i = 0 ; i < 5 ; i++ ){
      decar.accelerate();
      System.out.println("Current speed of the car:  " + decar.getSpeed() );
    }
    
    System.out.println();
    
    for( int j = 0 ; j < 5 ; j++ ){
      decar.brake();
      System.out.println("Current speed of the car:  " + decar.getSpeed() );
    }
  
  }


} 