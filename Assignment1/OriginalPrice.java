/* 
 * OriginalPrice - Assignment #1
 * Name: Axel Eschholz
 * ID: 161044e
 */ 

//import dependancies
import java.util.*;
import java.text.NumberFormat;

public class OriginalPrice
{
  
  //Define main method
  public static void main(String args[])
  {
    //Initialize scanner
    Scanner scan = new Scanner(System.in);
    
    //Define output format
    NumberFormat cf = NumberFormat.getCurrencyInstance();
      
    //Ask for price after task as a float
    System.out.print("Please enter the price with tax included:\n$");
    float after_tax = scan.nextFloat();
    
    //Ask for tax rate as a percentage - should this be personproof?
    System.out.println("Please enter the tax rate as a percent:");
    float tax_rate = scan.nextInt();
    
    //convert the percentage to a factor
    float tax_factor = (tax_rate / 100) + 1;
      
    //find original price
    float before_tax = after_tax / tax_factor;
      
    //return answer to the user
    System.out.println("The price before tax was " + cf.format(before_tax));
  }
  
  
}