/*
 * Recipe - Assignment #1
 * Axel Eschholz
 * 161044e
 */

//import dependancies
import java.util.*;
  
public class Recipe
{
  
  public static void main(String args[])
  {
    //initialize scanner
    Scanner scan = new Scanner(System.in);
    
    //define base variables
    float sugar = (float)0.5;
    double butter = 1;
    double flour = 4;
    
    //prompt user input
    System.out.println("Please enter the number of cupcakes you would like to make. Make sure to only put in multiples of 24.");
    int cupcakes = scan.nextInt();
    
    //calculate new values and print output
    int factor = cupcakes / 24;
    System.out.println("To make " + (cupcakes * factor) + " cupcakes, you will need: ");
    System.out.println("  " + (sugar * factor) + " cups of sugar");
    System.out.println("  " + (butter * factor) + " cups of butter");
    System.out.println("  " + (flour * factor) + " cups of flour");
    
  }
  
}