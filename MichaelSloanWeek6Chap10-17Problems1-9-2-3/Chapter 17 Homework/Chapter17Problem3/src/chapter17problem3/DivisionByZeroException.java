/*
 * IT-2650 Java Programming, Spring 2022
 * Instructor: Martin P. Walsh
 * Student Name: Michael Sloan
 * Homework Assignment: Chap 17 - Problem 3
 * Purpose of Assignment: Create a calculator using Swing.
 */
package chapter17problem3;

/**
 *
 * @author Michael Sloan
 */
public class DivisionByZeroException extends Exception
{
  public DivisionByZeroException()
  {
    super("Division by Zero");
  }

  public DivisionByZeroException(String message)
  {
    super(message);
  }
}
