public class Employee extends Person
{
  long id;
  
  public Employee(String first, String last, int age, Address address, long id)
  {
    super(first,last,age,address);
    this.id = id;
  }
  
  public double getId(){return id;}
  public void setId(long id){this.id = id;}
  
  public String toString()
  {
    return firstName + " " + lastName + " is " + age 
      + " years old and lives at " + address + ".\nEmployee ID: " + id;
  }
}