public class Person
{
  protected String firstName;
  protected String lastName;
  protected int age;
  protected Address address;
  
  public Person(String first, String last, int age, Address a)
  {
    firstName = first;
    lastName = last;
    this.age = age;
    address = a;
  }
  
  public String getFirstName(){return firstName;}
  public void setFirstName(String first){firstName = first;}
  public String getLastName(){return lastName;}
  public void setLastName(String last){lastName = last;}
  public int getAge(){return age;}
  public void setNumber(int age){this.age = age;}
  public Address getAddress(){return address;}
  public void setAddress(Address address){this.address = address;}
  
  public String toString()
  {
    return firstName + " " + lastName + " is " + age + " years old and lives at " + address + ".";
  }
    
}