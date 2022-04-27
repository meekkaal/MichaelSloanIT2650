/*
 * IT-2650 Java Programming, Spring 2022
 * Instructor: Martin P. Walsh
 * Student Name: Michael Sloan
 * Homework Assignment: Chap 9 - Problem 7
 * Purpose of Assignment: Use Try and Catch to validate bank account activity.
 */
package chapter9problem7;

import java.util.Scanner;

/**
 *
 * @author Michael Sloan
 */
public class Chapter9Problem7
{

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args)
  {
    System.out.println("IT-2650 Java Programming");
    System.out.println("Student Name: Michael Sloan");
    System.out.println("Homework Assignment: Chapter 9, Problem 7");
    System.out.println("_________________________________");
    System.out.println("");

    Scanner keyboard = new Scanner(System.in);
    try
    {
      System.out.println("Enter your STARTING BANK BALANCE");
      Account account = new Account(keyboard.nextDouble());

      System.out.println("Enter your DEPOSIT amount");
      account.deposit(keyboard.nextDouble());

      System.out.println("Enter your WITHDRAWAL amount");
      account.withdraw(keyboard.nextDouble());
      System.out.println("Your ENDING BALANCE is " + account.getBalance());

    } catch (InsufficientFundsException e)
    {
      System.out.println("Not enough money.");
      System.out.println(e);
    } catch (NegativeDepositException e)
    {
      System.out.println("Invalid deposit amount.");
      System.out.println(e);
    } catch (Exception e)
    {
      System.out.println("An exception occurred.");
      System.out.println(e);
    }
  }
}
