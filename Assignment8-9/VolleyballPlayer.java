public class VolleyballPlayer extends Athlete
{
  protected int spikes;
  public VolleyballPlayer(String firstName, String lastName, int id, double balance,
                 char position, int athleteID, int number, int spikes)
  {
    super(firstName, lastName, id, balance, position, athleteID, number);
    this.spikes = spikes;
  }
  
  public int getSpikes(){return spikes;}
  public void setSpikes(int spikes){this.spikes = spikes;}
  
  public String motto()
  {
    return "All for Acadia";
  }
  
  public String toString()
  {
    return super.toString() + " \nSpike Count: " + spikes;
  }
}
