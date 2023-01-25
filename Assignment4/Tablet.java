/**
 * Axel Eschholz
 * 100161044
 * Assignment 4 - Tablet
 */
public class Tablet
{
  private int age;
  private double capacity;
  private double used;
  
  public Tablet(int a, double c, double u)
  {
    age = a;
    capacity = c;
    used = u;
  }
  
  //mutators and actuators:
  public void setAge(int newAge)
  {
    age = newAge;
  }
  public void setCapacity(double newCapacity)
  {
    capacity = newCapacity;
  }
  public void setUsed(double newUsed)
  {
    used = newUsed;
  }
  public int getAge()
  {
    return age;
  }
  public double getCapacity()
  {
    return capacity;
  }
  public double getUsed()
  {
    return used;
  }
  
  //define toString method
  public String toString()
  {
    double gbFree = capacity - used;
    int percentUsed = (int) (((used/capacity) * 100) + 0.5);
    String ageOutput;
    if (age >= 12)
      ageOutput = (age / 12) + " years";
    else
      ageOutput = age + " months";
    return "This tablet is " + ageOutput + " old with a capacity of " + capacity + " gb and has " + used + " gb used. There is " + gbFree + " gb free on this tablet, which means it is " 
      + percentUsed + "% full.";
  }
}