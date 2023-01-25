/**
 * Axel Eschholz
 * 100161044
 * Assignment 4 - MyTablets
 */
import java.util.*;
public class MyTablets {
  
  public static void main(String args[])
  {
    //initialize objects and put them in an array
    ArrayList<Tablet> tablets = new ArrayList<Tablet>();
    tablets.add(new Tablet(24,512,200));
    tablets.add(new Tablet(60,256,18));
    tablets.add(new Tablet(2,512,308.5));
    
    //print all items in the array
    for(int i = 0; i < tablets.size(); i++) {
      System.out.println(tablets.get(i));
    }
    
    //First set of edits
    tablets.get(0).setUsed(0);
    tablets.get(2).setCapacity(1000);
    tablets.get(1).setUsed(tablets.get(1).getUsed() + 25);
    
    //print all items in the array
    for(int i = 0; i < tablets.size(); i++) {
      System.out.println(tablets.get(i));
    }
    
    //Second set of edits
    tablets.remove(1);
    tablets.add(new Tablet(120,128,127));
    
    //print all items in the array and calculate totals
    double totalStorage = 0;
    double totalUsed = 0;
    for(int i = 0; i < tablets.size(); i++) {
      Tablet tablet = tablets.get(i);
      totalStorage += tablet.getCapacity();
      totalUsed += tablet.getUsed();
      System.out.println(tablet);
    }
    
    System.out.println("Total storage: " + totalStorage + " gb");
    System.out.println("Total free space: " + (totalStorage - totalUsed) + " gb");
    
  }
  
}
