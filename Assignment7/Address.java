public class Address
{
  private int number;
  private String street;
  private String town;
  
  public Address(int n, String s, String t)
  {
    number = n;
    street = s;
    town = t;
  }
  
  public int getNumber(){return number;}
  public void setNumber(int n){number = n;}
  public String getStreet(){return street;}
  public void setStreet(String s){street = s;}
  public String getTown(){return town;}
  public void setTown(String t){town = t;}
  
  public String toString()
  {
    return number + " " + street + ", " + town;
  }
}