/*
 * IT-2650 Java Programming, Spring 2022
 * Instructor: Martin P. Walsh
 * Student Name: Michael Sloan
 * Homework Assignment: Chap 10 - Problem 9
 * Purpose of Assignment:
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

    int[] numbers = new int[100];
    int counter = 0;
    double sum = 0;
    
    try
    {
      ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("./chapter10numbers.dat"));
      
      try
      {
        System.out.println("Number");
        while (true)
        {
          int foundNumber = inputStream.readInt();
          numbers[counter++] = foundNumber;
          System.out.println(foundNumber);
          sum += foundNumber;
        }
      }
      catch (EOFException e)
      {
        System.out.println();
      }
      
      int largestNumber = Integer.MIN_VALUE;
      int smallestNumber = Integer.MAX_VALUE;
      
      for (int i = 0; i < counter; i++)
      {
        if (numbers[i] > largestNumber)
        {
          largestNumber = numbers[i];
        }
        else if (numbers[i] < smallestNumber)
        {
          smallestNumber = numbers[i];
        }
      }
      
      
      System.out.printf("%-16s %-10s%n", "Grand Total:", sum);
      System.out.printf("%-16s %-10s%n", "Count:", counter);
      System.out.printf("%-16s %-10s%n", "Average:", sum / counter);
      System.out.printf("%-16s %-10s%n", "Smallest number:", smallestNumber);
      System.out.printf("%-16s %-10s%n", "Largest number:", largestNumber);
    }
    catch (Exception e)
    {
      System.out.println(e);
    }

  }

}
