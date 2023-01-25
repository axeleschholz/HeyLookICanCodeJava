public abstract class Athlete extends Student
{
  protected int number;
  protected char position;
  protected int athleteID;
  
  public Athlete(String firstName, String lastName, int id, double balance,
                 char position, int athleteID, int number)
  {
    super(firstName, lastName, id, balance);
    this.position = position;
    this.athleteID = athleteID;
    this.number = number;
  }
  
  public char getPosition(){return position;}
  public void setPosition(char position){this.position = position;}
  public int getNumber(){return number;}
  public void setNumber(int number){this.number = number;}
  public int getAthleteID(){return athleteID;}
  public void setAthleteID(int athleteID){this.athleteID = athleteID;}
  
  public String toString()
  {
    return super.toString() + "\nAthletics ID: " + athleteID 
      + "\nNumber: " + number + "\nPosition: " + position;
  }
}