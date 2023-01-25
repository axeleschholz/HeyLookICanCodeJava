/* Assignment 2
 * Axel Eschholz
 * 161044e
 */ 

import java.util.*;

public class FunWithStrings
{
  public static void main(String args[])
  {
    Scanner scan = new Scanner(System.in);
    System.out.println("Please provide me with a first name, containing at least five characters.");
    String firstName = scan.nextLine();
    System.out.println("Please provide me with a last name, containing at least five characters.");
    String lastName = scan.nextLine();
    System.out.println("Please provide me with a number between 1 and 9.");
    int num = scan.nextInt();
    
    System.out.println("Let's have fun with your input...");
    System.out.println("I can yell your name - like this: " + firstName.toUpperCase() + " " + lastName.toUpperCase());
    System.out.println("I know the 3rd character in your first name is " + firstName.substring(2,3) + ".");
    System.out.println("The last name (" + lastName + ") has " + lastName.length() + " characters.");
    System.out.println("I can print your first name with your number in the middle: " + firstName.substring(0,2) + num + firstName.substring(2) + ".");
    System.out.println("I can replace all the \"e's\" in your name with an *: " + lastName.replace('e','*') + ".");
  }
}