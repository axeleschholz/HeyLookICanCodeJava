public class Secretary extends UnionMember
{
  private int years;
  
  public Secretary(String firstName, String lastName, int id, double balance,
                   int unionID, int years)
  {
    super(firstName, lastName, id, balance, unionID);
    this.years = years;
  }
  
  public int getYears(){return years;}
  public void setYears(int years){this.years = years;}
  
  public String toString()
  {
    return super.toString() + "\nHas managed accounts for: " + formatYears(years);
  }
}