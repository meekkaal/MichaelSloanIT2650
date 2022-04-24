/*
 * IT-2650 Java Programming, Spring 2022
 * Instructor: Martin P. Walsh
 * Student Name: Michael Sloan
 * Homework Assignment: Chap 7 - Problem 6
 * Purpose of Assignment: Test methods of Vehicle, Truck, and Person classes. Truck extends the Vehicle class.
 */
package chapter7problem6;

/**
 *
 * @author Michael Sloan
 */
public class Chapter7Problem6
{

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args)
  {
    System.out.println("IT-2650 Java Programming");
    System.out.println("Student Name: Michael Sloan");
    System.out.println("Homework Assignment: Chapter 7, Problem 6");
    System.out.println("_________________________________");
    System.out.println("");
    
    
    // test person 1
    Person p1 = new Person();
    System.out.println("p1: " + p1);
    p1.setName("Bob");
    System.out.println("p1's name is: " + p1.getName());
    
    // test person 2
    Person p2 = new Person("Joe");
    System.out.println("p2: " + p2);
    
    // test person 3 equals person 1
    Person p3 = new Person("Bob");
    System.out.println("p3 equal to p1: " + p3.equals(p1));
    System.out.println("p2 equal to p1:  " + p2.equals(p1));
    
    // test vehicle 1
    Vehicle v1 = new Vehicle();
    System.out.println("v1: " + v1);
    v1.setManufacturerName("Ford");
    System.out.println("v1's manufacturer is: " + v1.getManufacturerName());
    v1.setCylinders(4);
    System.out.println("v1's cylinders: " + v1.getCylinders());
    v1.setOwner(p2);
    System.out.println("v1's owner is: " + v1.getOwner());
    
    // test vehicle 2
    Vehicle v2 = new Vehicle("Chevy", 4, new Person("Betty"));
    System.out.println("v2: " + v2);
    
    //test vehicle 3
    Vehicle v3 = new Vehicle(v1);
    System.out.println("v3 equal to v1: " + v3.equals(v1));
    System.out.println("v2 equal to v1: " + v2.equals(v1));
    
    //test truck 1
    Truck t1 = new Truck();
    System.out.println("t1: " + t1);
    t1.setLoadCapacity(54.36);
    System.out.println("t1's load capacity is: " + t1.getLoadCapacity());
    t1.setTowingCapacity(10);
    System.out.println("t1's towing capacity is: " + t1.getTowingCapacity());
    
    //test truck 2
    Truck t2 = new Truck("Chevy", 4, v2.getOwner(), 34.5, 65);
    System.out.println("t2: " + t2);
    
    Truck t3 = new Truck(t1);
    System.out.println("t3 equal to t1: " + t3.equals(t1));
    System.out.println("v2 equal to t1: " + v2.equals(t1));
    
    
    
    
  }
  
}
