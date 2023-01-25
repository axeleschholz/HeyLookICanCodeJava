public class Captain extends VolleyballPlayer
{
  private int years;
  
  public Captain(String firstName, String lastName, int id, double balance,
                 char position, int athleteID, int number, int spikes, int years)
  {
    super(firstName, lastName, id, balance, position, athleteID, number, spikes);
    this.years = years;
  }
  
  public int getYears(){return years;}
  public void setYears(int years){this.years = years;}
  
  public String toString()
  {
    return super.toString() + "\nHas Served: " + formatYears(years) + " as captain";
  }
}