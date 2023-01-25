public class Student extends Person
{
  long id;
  
  public Student(String first, String last, int age, Address address, long id)
  {
    super(first,last,age,address);
    this.id = id;
  }
  
  public double getId(){return id;}
  public void setId(long id){this.id = id;}
  
  public String toString()
  {
    return firstName + " " + lastName + " is " + age 
      + " years old and lives at " + address + ".\nStudent ID: " + id;
  }
}