public class Graduate extends Person
{
  long id;
  int office;
  
  public Graduate(String first, String last, int age, Address address, long id, int office)
  {
    super(first,last,age,address);
    this.id = id;
    this.office = office;
  }
  
  public double getId(){return id;}
  public void setId(long id){this.id = id;}
  public int getOffice(){return office;}
  public void setOffice(int office){this.office = office;}
  
  public String toString()
  {
    return firstName + " " + lastName + " is " + age 
      + " years old and lives at " + address + ".\nStudent ID: " + id + "\nOffice: "
      + office;
  }
}