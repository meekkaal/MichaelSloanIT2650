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
public class InsufficientFundsException extends Exception
{

  public InsufficientFundsException()
  {
    super("Insufficient funds to withdraw this amoount.");
  }

  public InsufficientFundsException(String message)
  {
    super(message);
  }
}
