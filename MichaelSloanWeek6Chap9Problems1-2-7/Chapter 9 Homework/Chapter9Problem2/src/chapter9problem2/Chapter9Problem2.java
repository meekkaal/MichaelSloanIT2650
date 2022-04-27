/*
 * IT-2650 Java Programming, Spring 2022
 * Instructor: Martin P. Walsh
 * Student Name: Michael Sloan
 * Homework Assignment: Chap 9 - Problem 2
 * Purpose of Assignment:
 */
package chapter9problem2;

import java.util.Scanner;
import java.util.InputMismatchException;

/**
 *
 * @author Michael Sloan
 */
public class Chapter9Problem2
{

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args)
  {
    System.out.println("IT-2650 Java Programming");
    System.out.println("Student Name: Michael Sloan");
    System.out.println("Homework Assignment: Chapter 9, Problem 2");
    System.out.println("_________________________________");
    System.out.println("");

    Scanner keyboard = new Scanner(System.in);
    boolean done = false;
    int n1, n2;
    double r;

    while (!done)
    {
      try
      {
        System.out.println("Enter two numbers. Please leave a space between the numbers. I will compute the ratio.");
        n1 = keyboard.nextInt();
        n2 = keyboard.nextInt();
        if (n2 == 0)
        {
          throw new ArithmeticException();
        }
        r = (double) n1 / n2;
        System.out.println("The ratio r = " + r);
        done = true;
      } catch (ArithmeticException e)
      {
        System.out.println("There was an exception: Divide by zero... Try again.");
      } catch (InputMismatchException e)
      {
        System.out.println("You must enter an integer. Try again.");
      } catch (Exception e)
      {
        System.out.println("There was an exception: " + e + "... Try again.");
      }
      keyboard.nextLine();
    }
  }
}
