/* Axel Eschholz
 * 100161044
 * Assignment 7
 */
public class People
{
  public static void main(String[] args)
  {
    Address address1 = new Address(7, "Nowhere Hollow", "Albanian Forest");
    Address address2 = new Address(123, "Sesame Street", "Somewhere");
    Address address3 = new Address(0, "Tardis Way", "Galifrey");
    Address address4 = new Address(7, "Maple Lane", "Vancouver");
    
    Employee employee = new Employee("The", "Count", 10, address2, 123456789);
    Person person = new Person("Tom", "Riddle", 147, address1);
    Student student = new Student("John", "Smith", 12003, address3, 12);
    Graduate graduate = new Graduate("Canada", "Person", 25, address4, 10101010, 3);
                                     
    System.out.println(employee);
    System.out.println();
    System.out.println(person);
    System.out.println();
    System.out.println(student);
    System.out.println();
    System.out.println(graduate);
    System.out.println();
  }
}