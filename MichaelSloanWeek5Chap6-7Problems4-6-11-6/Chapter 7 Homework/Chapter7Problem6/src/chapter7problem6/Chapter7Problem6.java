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
    
    
    
  }
  
}
