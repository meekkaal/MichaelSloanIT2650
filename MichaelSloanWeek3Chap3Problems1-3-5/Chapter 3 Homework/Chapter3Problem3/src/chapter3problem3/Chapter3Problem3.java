/*
 * IT-2650 Java Programming, Spring 2022
 * Instructor: Martin P. Walsh
 * Student Name: Michael Sloan
 * Homework Assignment: Chap 3 - Problem 3
 * Purpose of Assignment: Compute the height of a future person based on both parents' heights.
 */
package chapter3problem3;

import java.util.Scanner;

/**
 *
 * @author Michael Sloan
 */
public class Chapter3Problem3
{

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args)
  {
    System.out.println("IT-2650 Java Programming");
    System.out.println("Student Name: Michael Sloan");
    System.out.println("Homework Assignment: Chapter 2, Problem 3");
    System.out.println("_________________________________");
    System.out.println("");

    Scanner keyboard = new Scanner(System.in);

    boolean running = true;

    while (running)
    {
      int childHeight = 0;

      System.out.println("Enter the gender of your future child. Use 1 for female, 0 for male.");
      int gender = keyboard.nextInt();
      if (gender != 0 && gender != 1)
      {
        continue;
      }
      System.out.println("Enter the height in feet then the height in inches of the mom.");
      int momFeet = keyboard.nextInt();
      int momInches = keyboard.nextInt();
      int momHeight = (momFeet * 12) + momInches;
      System.out.println("Enter the height in feet then the height in inches of the dad.");
      int dadFeet = keyboard.nextInt();
      int dadInches = keyboard.nextInt();
      int dadHeight = (dadFeet * 12) + dadInches;

      
      switch (gender)
      {
        case 0:
          childHeight = ((momHeight * 13 / 12) + dadHeight) / 2;
          break;
        case 1:
          childHeight = ((dadHeight * 12 / 13) + momHeight) / 2;
          break;
        default:
          System.out.println("Error, please restart the program.");
          break;     
      }

      System.out.println("You future child is estimated to grow to " + (childHeight / 12) + " feet and " + (childHeight % 12) + " inches.");

      System.out.println("Enter 'Y' to run again, anything else to exit.");
      if (!keyboard.next().equalsIgnoreCase("Y"))
      {
        running = false;
      }
    }

  }

}
