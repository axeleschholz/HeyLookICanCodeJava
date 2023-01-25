/*
 * Axel Eschholz
 * 100161044
 * Assignment 3 alternate - ExtraClues
 */
import java.util.*;
public class ExtraClues
{
  public static void main(String args[])
  {
    // initialize variables and objects
    Scanner scan = new Scanner(System.in);
    Random gen = new Random();
    int number = gen.nextInt(99) + 1;
    int count = 0;
    int guess;
    
    //enter loop
    do
    {
      //guess input
      System.out.println("\nPlease guess a number between 1 and 99:");
      guess = scan.nextInt();
      count++;
      
      //conditionals
      if (guess == number)
        break;
      if ((guess / 10) == ((number / 10)) || ((guess % 10) == (number % 10)))
        System.out.println("You guessed one digit correctly!");
      if ((guess + number) %  7 == 0)
        System.out.println("The sum of our numbers is divisible by 7!");
    } while (guess != number);
    
    //final output
    System.out.println("Congratulations, you did it in " + count + " tries.");
    
  }
  
}