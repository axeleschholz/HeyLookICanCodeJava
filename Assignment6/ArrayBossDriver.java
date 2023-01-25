/* Axel Eschholz
 * 100161044e
 * Assignment 6 - ArrayBossDriver
 */
import java.util.*;
public class ArrayBossDriver
{
  public static void printArrays(int[] intArray, double[] doubleArray, char[] charArray)
  {
    System.out.print("Integer Array: ");
    for(int i = 0; i < intArray.length; i++)
    {
      System.out.print(intArray[i]);
      if(i != intArray.length - 1)
        System.out.print(", ");
    }
    System.out.print("\nDouble Array: ");
    for(int i = 0; i < doubleArray.length; i++)
    {
      System.out.print(doubleArray[i]);
      if(i != doubleArray.length - 1)
        System.out.print(", ");
    }
    System.out.print("\nCharacter Array: ");
    for(int i = 0; i < charArray.length; i++)
    {
      System.out.print(charArray[i]);
      if(i != charArray.length - 1)
        System.out.print(", ");
    }
    System.out.println("\n");
  }
  
  public static void main(String args[])
  {
    //initialize objects
    int intArray[] = new int[5];
    double doubleArray[] = new double[5];
    char charArray[] = new char[5];
    Random gen = new Random();
    
    //populate arrays
    for(int i = 0; i < 5; i++)
    {
      intArray[i] = gen.nextInt(13) + 3;
      doubleArray[i] = gen.nextDouble();
      charArray[i] = (char)(gen.nextInt(26) + 'a');
    }
    
    //create ArrayBoss object
    ArrayBoss arrays = new ArrayBoss(intArray.length, doubleArray.length, charArray.length);
    
    //print out arrays
    printArrays(intArray, doubleArray, charArray);
    
    //perform ArrayBoss operations
    arrays.stealIntegerArray(intArray);
    arrays.copyDoubleArray(doubleArray);
    arrays.reverseCopyArray(charArray);
    
    //print out arrays again
    printArrays(intArray, doubleArray, charArray);
    
    //print altered arrays
    System.out.println(arrays);
  }
  
}