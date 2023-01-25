/* Axel Eschholz
 * 100161044
 * Assignment 8/9
 */
public class StudentBody
{
  //define array
  private Student students[];

  public StudentBody()
  {
    //initialize and populate array
    students = new Student[9];
    students[0] = new Student("Elle", "Stephenson", 1724181, 36.15);
    students[1] = new UnionMember("Aishwarya", "Sifat", 1648182, 122.22, 22112);
    students[2] = new President("Billy", "Flanagan", 1946781, 44.44, 21521, 3);
    students[3] = new Secretary("Jimmy", "Simms", 1989221, 0.44, 23212, 1);
    students[4] = new Secretary("Shanny", "Lu", 1918183, 1221.42, 22184, 2);
    students[5] = new HockeyPlayer("Craig", "Fitzpatrick", 1928186, 15000, 'C', 18341, 61, "left");
    students[6] = new HockeyPlayer("Sylvian", "Proulx", 1938187, 25, 'D', 34321, 9, "right");
    //Just a note that the player below has two different student ID's in the question.
    //One is in the description, the other is in the output.
    students[7] = new VolleyballPlayer("Rashida", "Raghavan", 1900411, 3211, 'S', 25154, 7, 32);
    students[8] = new Captain("Conchita", "Martinez", 1912289, 14878, 'L', 42911, 6, 31, 2);
  }
  
  //function to print student information
  public void printStudents()
  {
    System.out.println("Your student body: \n");
    for(int i = 0; i < students.length; i++)
    {
      System.out.println(students[i] + "\n");
    }
  }
}