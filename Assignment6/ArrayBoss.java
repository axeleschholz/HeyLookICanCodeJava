/* Axel Eschholz
 * 100161044e
 * Assignment 6 - ArrayBoss
 */
public class ArrayBoss
{
  private int intArray[];
  private double doubleArray[];
  private char charArray[];
  
  public ArrayBoss(int i, int d, int c)
  {
    intArray = new int[i];
    doubleArray = new double[d];
    charArray = new char[c];
  }
  
  //steal methods
  public void stealIntegerArray(int[] passedArray)
  {
    intArray = passedArray;
    intArray[0] = -1234;
  }
  public void stealDoubleArray(double[] passedArray)
  {
    doubleArray = passedArray;
    doubleArray[0] = -1234;
  }
  public void stealCharacterArray(char[] passedArray)
  {
    charArray = passedArray;
    charArray[0] = '?';
  }
  
  //copy methods
  public void copyIntegerArray(int[] passedArray)
  {
    for(int i = 0; i < intArray.length; i++)
    {
      intArray[i] = passedArray[i];
    }
  }
  
  public void copyDoubleArray(double[] passedArray)
  {
    for(int i = 0; i < doubleArray.length; i++)
    {
      doubleArray[i] = passedArray[i];
    }
  }
  
  public void copyCharacterArray(char[] passedArray)
  {
    for(int i = 0; i < charArray.length; i++)
    {
      charArray[i] = passedArray[i];
    }
  }
  
  //reverse methods
  public void reverseCopyArray(int[] passedArray)
  {
    for(int i = 0; i < intArray.length; i++)
    {
      intArray[i] = passedArray[(passedArray.length - 1) - i];
    }
  }
  
  public void reverseCopyArray(double[] passedArray)
  {
    for(int i = 0; i < doubleArray.length; i++)
    {
      doubleArray[i] = passedArray[(passedArray.length - 1) - i];
    }
  }
  
  public void reverseCopyArray(char[] passedArray)
  {
    for(int i = 0; i < charArray.length; i++)
    {
      charArray[i] = passedArray[(passedArray.length - 1) - i];
    }
  }
  
  //toString null checks and method
  public String toString()
  {
    //null checks
    boolean full = true;
    if (intArray[intArray.length - 1] == 0)
      full = false;
    if (doubleArray[doubleArray.length - 1] == 0)
      full = false;
    if (charArray[charArray.length - 1] == '\u0000')
      full = false;
    
    //printout
    if (full)
    {
      String printout;
      printout = "ArrayBoss Arrays:\nInteger Array: ";
      for(int i = 0; i < intArray.length; i++)
      {
        printout += intArray[i];
        if (i != (intArray.length - 1))
          printout += ", ";
      }
      printout += "\nDouble Array: ";
      for(int i = 0; i < doubleArray.length; i++)
      {
        printout += doubleArray[i];
        if (i != (doubleArray.length - 1))
          printout += ", ";
      }
      printout += "\nCharacter Array: ";
      for(int i = 0; i < charArray.length; i++)
      {
        printout += charArray[i];
        if (i != (charArray.length - 1))
          printout += ", ";
      }
      return printout;
    }
    else
      return "The arrays have not yet all been filled";
  }
      
}