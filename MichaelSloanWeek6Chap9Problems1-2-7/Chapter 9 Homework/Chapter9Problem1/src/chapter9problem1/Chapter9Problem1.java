/*
 * IT-2650 Java Programming, Spring 2022
 * Instructor: Martin P. Walsh
 * Student Name: Michael Sloan
 * Homework Assignment: Chap 9 - Problem 1
 * Purpose of Assignment:
 */
package chapter9problem1;

import java.util.Scanner;

/**
 *
 * @author Michael Sloan
 */
public class Chapter9Problem1
{

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args)
  {
    System.out.println("IT-2650 Java Programming");
    System.out.println("Student Name: Michael Sloan");
    System.out.println("Homework Assignment: Chapter 9, Problem 1");
    System.out.println("_________________________________");
    System.out.println("");

    Scanner keyboard = new Scanner(System.in);
    boolean done = false;

    while (!done)
    {
      try
      {
        System.out.println("How many numbers do you want to enter?");
        int[] numbers = new int[keyboard.nextInt()];
        double sum = 0;

        for (int i = 0; i < numbers.length; i++)
        {
          System.out.println("Enter number " + (i + 1));
          numbers[i] = keyboard.nextInt();
          sum += numbers[i];
        }

        double average = sum / numbers.length;

        System.out.println("The average is " + average);
        System.out.println("Would you like to try again? (enter Q to quit, any other key to restart.)");
        if (keyboard.next().toUpperCase().equals("Q"))
        {
          done = true;
        }
      }
      catch (NegativeArraySizeException e)
      {
        System.out.println("Number must be greater than 0.");
      }

    }
    
    System.exit(0);

  }

}
