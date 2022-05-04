/*
 * IT-2650 Java Programming, Spring 2022
 * Instructor: Martin P. Walsh
 * Student Name: Michael Sloan
 * Homework Assignment: Chap 18 - Problem 7
 * Purpose of Assignment: Use Swing + MouseListener to create an application that marks and logs where a user clicks.
 */
package chapter18problem7;

/**
 *
 * @author Michael Sloan
 */
public class Chapter18Problem7
{

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args)
  {
    System.out.println("IT-2650 Java Programming");
    System.out.println("Student Name: Michael Sloan");
    System.out.println("Homework Assignment: Chapter 18, Problem 7");
    System.out.println("_________________________________");
    System.out.println("");
    
    MouseDemoFrame gui = new MouseDemoFrame();
    gui.setVisible(true);
  }
  
}
