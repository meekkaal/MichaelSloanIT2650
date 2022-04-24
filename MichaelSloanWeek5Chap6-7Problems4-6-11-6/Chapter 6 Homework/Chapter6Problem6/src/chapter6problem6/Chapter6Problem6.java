/*
 * IT-2650 Java Programming, Spring 2022
 * Instructor: Martin P. Walsh
 * Student Name: Michael Sloan
 * Homework Assignment: Chap 6 - Problem 6
 * Purpose of Assignment: Read multiple numbers into an array then count the occurrences of each.
 */
package chapter6problem6;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Michael Sloan
 */
public class Chapter6Problem6
{

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args)
  {
    System.out.println("IT-2650 Java Programming");
    System.out.println("Student Name: Michael Sloan");
    System.out.println("Homework Assignment: Chapter 6, Problem 6");
    System.out.println("_________________________________");
    System.out.println("");

    Scanner keyboard = new Scanner(System.in);

    System.out.println("How many numbers to enter? (At most 50)");
    int amount = keyboard.nextInt();
    int[] numberArray = new int[amount];
    System.out.println("Enter each of the " + amount + " numbers. Please put a space between each number.");

    for (int i = 0; i < numberArray.length; i++)
    {
      numberArray[i] = keyboard.nextInt();
    }

    System.out.printf("%-15s%-15s %n", "N", "Count");

    Arrays.sort(numberArray);
    int count = 1;

    for (int i = numberArray.length - 1; i >= 0; i--)
    {
      if (i > 0 && numberArray[i] == numberArray[i - 1])
      {
        count++;
      } else
      {
        System.out.printf("%-15s%-15s %n", numberArray[i], count);
        count = 1;
      }
    }
  }

}
