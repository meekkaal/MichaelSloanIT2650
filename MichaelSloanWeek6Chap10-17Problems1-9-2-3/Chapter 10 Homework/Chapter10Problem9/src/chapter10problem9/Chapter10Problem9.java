/*
 * IT-2650 Java Programming, Spring 2022
 * Instructor: Martin P. Walsh
 * Student Name: Michael Sloan
 * Homework Assignment: Chap 10 - Problem 9
 * Purpose of Assignment: Read numbers from a binary file and display statistics about them.
 */
package chapter10problem9;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.ObjectInputStream;

/**
 *
 * @author Michael Sloan
 */
public class Chapter10Problem9
{

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args)
  {
    System.out.println("IT-2650 Java Programming");
    System.out.println("Student Name: Michael Sloan");
    System.out.println("Homework Assignment: Chapter 10, Problem 9");
    System.out.println("_________________________________");
    System.out.println("");

    int counter = 0;
    double sum = 0;
    int largestNumber = Integer.MIN_VALUE;
    int smallestNumber = Integer.MAX_VALUE;

    try
    {
      ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("./chapter10numbers.dat"));

      try
      {
        System.out.println("Number");
        while (true)
        {
          int foundNumber = inputStream.readInt();
          System.out.println(foundNumber);
          sum += foundNumber;
          counter++;
          
          if (foundNumber > largestNumber)
          {
            largestNumber = foundNumber;
          }
          else if (foundNumber < smallestNumber)
          {
            smallestNumber = foundNumber;
          }
        }
      } catch (EOFException e)
      {
        System.out.println();
      }

      System.out.printf("%-16s %-10s%n", "Grand Total:", sum);
      System.out.printf("%-16s %-10s%n", "Count:", counter);
      System.out.printf("%-16s %-10s%n", "Average:", sum / counter);
      System.out.printf("%-16s %-10s%n", "Smallest number:", smallestNumber);
      System.out.printf("%-16s %-10s%n", "Largest number:", largestNumber);   
      inputStream.close();
      
    } catch (Exception e)
    {
      System.out.println(e);
    }

  }

}
