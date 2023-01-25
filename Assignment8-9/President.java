public class President extends UnionMember
{
  private int tenure;
  
  public President(String firstName, String lastName, int id, double balance,
                   int unionID, int tenure)
  {
    super(firstName, lastName, id, balance, unionID);
    this.tenure = tenure;
  }
  
  public int getTenure(){return tenure;}
  public void setTenure(int tenure){this.tenure = tenure;}
  
  public String toString()
  {
    return super.toString() + "\nTenured for: " + formatYears(tenure);
  }
}