/*CSC 110 Hsuan-Yu Lin(Sam) noon class
  Lab03 volume and surface area compute*/
  
import java.util.Scanner;
  
public class Lab03{
  public static void main( String[] args ){
  
  Scanner kb = new Scanner(System.in);
  
  double length, width, height, radius, volume, surfacearea;
  
  System.out.print("Please type in the length of the rectangular solid: ");
  length = kb.nextDouble();
  System.out.print("Please type in the width of the rectangular solid: ");
  width = kb.nextDouble();
  System.out.print("Please type in the height of the rectangular solid: ");
  height = kb.nextDouble();
  
  volume = length * width * height;
  surfacearea = 2 * ( length * width + length * height + width * height);
  
  System.out.println("Rectangular Solid Data:");
  System.out.println("  Volume: " + volume);
  System.out.println("  Surface Area: " + surfacearea);
  System.out.println("");
  
  
  System.out.print("Please type in the radius of the cylinder: ");
  radius = kb.nextDouble();
  System.out.print("Please type in the height of the cylinder: ");
  height = kb.nextDouble();

  
  volume = Math.PI * radius * radius * height;
  surfacearea = 2 * Math.PI * radius * ( height + radius );
  
  System.out.println("Cylinder Data:");
  System.out.println("  Volume: " + volume);
  System.out.println("  Surface Area: " + surfacearea);
  System.out.println("");
  
  System.out.print("Please type in the radius of the sphere: ");
  radius = kb.nextDouble();
  
  volume = Math.PI * radius * radius * radius * 4.0 / 3.0;
  surfacearea = 4 * Math.PI * radius * radius;
  
  System.out.println("Sphere Data:");
  System.out.println("  Volume: " + volume);
  System.out.println("  Surface Area: " + surfacearea);
  System.out.println("");  
  
  
  System.out.print("Please type in the height of the Cone: ");
  height = kb.nextDouble();
  System.out.print("Please type in the radius of the Cone: ");
  radius = kb.nextDouble();

  
  volume = Math.PI * radius * radius * height * 1.0 / 3.0;
  surfacearea = Math.PI * radius;
  surfacearea = surfacearea * (Math.sqrt( height * height + radius * radius) + radius );
  
  System.out.println("Cylinder Data:");
  System.out.println("  Volume: " + volume);
  System.out.println("  Surface Area: " + surfacearea);
  System.out.println("");

  
  } 

}