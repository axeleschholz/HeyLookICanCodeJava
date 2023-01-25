public class HockeyPlayer extends Athlete
{
  private String direction;
  
  public HockeyPlayer(String firstName, String lastName, int id, double balance,
                 char position, int athleteID, int number, String direction)
  {
    super(firstName, lastName, id, balance, position, athleteID, number);
    this.direction = direction;
  }
  
  public String getDirection(){return direction;}
  public void setDirection(String direction){this.direction = direction;}
  
  public String motto()
  {
    return "Goals, goals, goals";
  }
  
  public String toString()
  {
    return super.toString() + "\nShoots: " + direction;
  }
}