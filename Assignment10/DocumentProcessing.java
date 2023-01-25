/* Axel Eschholz
 * 100161044
 * Assignment 10
 */
import java.util.*;
import java.io.*;
public class DocumentProcessing
{
  public static void main(String[] args) throws IOException, BadCodeException
  {
    Scanner filescan = new Scanner(new File("codes.txt"));
    BadCodeException problem = new BadCodeException("Invalid code.");
    int count = 0;
    String line;
    char check;
    
    while(filescan.hasNextLine())
    {
      line = filescan.nextLine();
      check = line.charAt(0);
      try
      {
        switch (check) {
          case 'A':
            count++;
            break;
          case 'B':
            count++;
            break;
          case 'C':
            count++;
            break;
          default:
            throw problem;
        }
      }
      catch (BadCodeException exception)
      {
        System.out.println(line + " is not a valid code");
       }
      }
    System.out.println("There were " + count + " valid document names in the file.");
    }
  }
    