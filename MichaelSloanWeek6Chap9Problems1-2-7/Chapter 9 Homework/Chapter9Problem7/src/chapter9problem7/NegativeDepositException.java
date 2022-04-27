/*
 * IT-2650 Java Programming, Spring 2022
 * Instructor: Martin P. Walsh
 * Student Name: Michael Sloan
 * Homework Assignment: Chap 9 - Problem 7
 * Purpose of Assignment: Use Try and Catch to validate bank account activity.
 */
package chapter9problem7;

/**
 *
 * @author Michael Sloan
 */
public class NegativeDepositException extends Exception
{

  public NegativeDepositException()
  {
    super("You can't deposit a negative amount.");
  }

  public NegativeDepositException(String message)
  {
    super(message);
  }
}
