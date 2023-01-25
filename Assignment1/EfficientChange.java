/* 
 * OriginalPrice - Assignment #1
 * Name: Axel Eschholz
 * ID: 161044e
 */ 

//import dependancies
import java.util.*;

public class EfficientChange
{
  
  public static void main(String args[])
  {
    int twenty, ten, five, two, one, quarter, dime, nickel, penny;
    
    System.out.println("Please enter an amount of money:");
    Scanner scan = new Scanner(System.in);
    double remaining = scan.nextDouble();
    
    //Breakdown the total by each denomination:
    twenty = (int) (remaining / 20);
    remaining -= twenty * 20;
    
    ten = (int) (remaining / 10);
    remaining -= ten * 10;
    
    five = (int) (remaining /5);
    remaining -= five * 5;
    
    two = (int) (remaining / 2);
    remaining -= two * 2;
    
    one = (int) (remaining / 1);
    remaining -= one * 1;
    
    quarter = (int) (remaining / 0.25);
    remaining -= quarter * 0.25;
    
    dime = (int) (remaining / 0.1);
    remaining -= dime * 0.1;
    
    nickel = (int) (remaining / 0.05);
    remaining -= nickel * 0.05;
    
    penny = (int) (remaining / 0.01);
    remaining -= penny * 0.01;
    
    System.out.println("Your change is as follows:");
    System.out.println("  " + twenty + " twenty dollar bills");
    System.out.println("  " + ten + " ten dollar bills");
    System.out.println("  " + five + " five dollar bills");
    System.out.println("  " + two + " two dollar coins (toonies)");
    System.out.println("  " + one + " one dollar coins (loonies)");
    System.out.println("  " + quarter + " quarters");
    System.out.println("  " + dime + " quarters");
    System.out.println("  " + nickel + " nickels");
    System.out.println("  " + penny + " pennies");
  }
}