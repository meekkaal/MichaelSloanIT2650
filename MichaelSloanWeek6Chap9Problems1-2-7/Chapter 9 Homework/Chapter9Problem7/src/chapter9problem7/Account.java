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
public class Account
{

  private double balance;

  public Account()
  {
    balance = 0;
  }

  public Account(double initialDeposit) throws InsufficientFundsException
  {
    if (initialDeposit >= 0)
    {
      balance = initialDeposit;
    } else
    {
      throw new InsufficientFundsException("Starting bank balance must be greater than or equal to zero.");
    }
  }

  public double getBalance()
  {
    return balance;
  }

  // returns new balance or -1 if error  
  public double deposit(double amount) throws NegativeDepositException
  {
    if (amount >= 0)
    {
      balance += amount;
    } else
    {
      throw new NegativeDepositException();
    }
    return balance;
  }

  // returns new balance or -1 if invalid amount  
  public double withdraw(double amount) throws InsufficientFundsException
  {
    if ((amount > balance) || (amount < 0))
    {
      throw new InsufficientFundsException();
    } else
    {
      balance -= amount;
    }
    return balance;
  }
}
