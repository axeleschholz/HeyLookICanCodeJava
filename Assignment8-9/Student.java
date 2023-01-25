import java.text.NumberFormat;
public class Student implements Mottos
{
  //define instance data
  protected String firstName;
  protected String lastName;
  protected int id;
  protected double balance;
  
  //constructor
  public Student(String firstName, String lastName, int id, double balance)
  {
    this.firstName = firstName;
    this.lastName = lastName;
    this.id = id;
    this.balance = balance;
  }
  
  //setters and getters
  public String getFirstName(){return firstName;}
  public void setFirstName(String firstName){this.firstName = firstName;}
  public String getLastName(){return lastName;}
  public void setLastName(String lastName){this.lastName = lastName;}
  public int getId(){return id;}
  public void setId(int id){this.id = id;}
  public double getBalance(){return balance;}
  public void setBalance(double balance){this.balance = balance;}
  
  //format function to be used in child classes
  protected String formatYears(int years)
  {
    if(years == 1)
      return years + " year";
    else
      return years + " years";
  }
  
  //polymorphic motto class
  public String motto()
  {
    return "Stay home and stay safe";
  }
  
  //Highest level of the toString function
  public String toString()
  {
    return firstName + " " + lastName + " (" + id + ") has balance " 
      + NumberFormat.getCurrencyInstance().format(balance) + "\n" + motto();
  }
}