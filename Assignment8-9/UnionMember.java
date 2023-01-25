public class UnionMember extends Student
{
  protected int unionID;
  
  public UnionMember(String firstName, String lastName, int id, double balance, int unionID)
  {
    super(firstName, lastName, id, balance);
    this.unionID = unionID;
  }
  
  public int getUnionID(){return unionID;}
  public void setUnionID(int unionID){this.unionID = unionID;}
  
  public String motto()
  {
    return "Represent all";
  }
  
  public String toString()
  {
    return super.toString() +  "\nUnion ID: " + unionID;
  }
}
