/*
 * Axel Eschholz
 * 100161044
 * Assignment 5
 */
public class FarmerInTheDell
{
  
  public static void main(String args[])
  {
    String first;
    String middle;
    String second;
    for (int verse = 0; verse < 10; verse++)
    {
      //Define switch statement (it might be more expedient to iterate over an array)
      //This will choose the subject of the verse
      switch (verse) {
        case 0:
          first = "farmer";
          second = "dell";
          break;
        case 1:
          first = "farmer";
          second = "wife";
          break;
        case 2:
          first = "wife";
          second = "child";
          break;
        case 3:
          first = "child";
          second = "nurse";
          break;
        case 4:
          first = "nurse";
          second = "cow";
          break;
        case 5:
          first = "cow";
          second = "dog";
          break;
        case 6:
          first = "cow";
          second = "dog";
          break;
        case 7:
          first = "dog";
          second = "cat";
          break;
        case 8:
          first = "cat";
          second = "mouse";
          break;
        case 9:
          first = "cheese";
          second = "alone";
          break;
        default:
          first = "";
          second = "";
          //apparently I have to include a default, it isn't intended to ever be triggered
      }
      
      //choose connecting words
      if (verse == 0)
        middle = " in the ";
      else if (verse == 9)
        middle = " stands ";
      else
        middle = " takes the ";
      
      //print out verse
      System.out.println("The " + first + middle + second);
      System.out.println("The " + first + middle + second);
      System.out.println("Heigh-ho, the derry-o");
      System.out.println("The " + first + middle + second + "\n");        
    }
  }
}