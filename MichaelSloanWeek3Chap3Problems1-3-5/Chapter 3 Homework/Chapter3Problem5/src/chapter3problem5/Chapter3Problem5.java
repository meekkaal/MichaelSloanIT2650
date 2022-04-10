/*
 * IT-2650 Java Programming, Spring 2022
 * Instructor: Martin P. Walsh
 * Student Name: Michael Sloan
 * Homework Assignment: Chap 3 - Problem 5
 * Purpose of Assignment: Write a program to compute monthly payment and amortization of a loan.
 */
package chapter3problem5;

import java.math.RoundingMode;
import java.text.NumberFormat;
import java.util.Scanner;

/**
 *
 * @author Michael Sloan
 */
public class Chapter3Problem5
{

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args)
  {
    System.out.println("IT-2650 Java Programming");
    System.out.println("Student Name: Michael Sloan");
    System.out.println("Homework Assignment: Chapter 2, Problem 5");
    System.out.println("_________________________________");
    System.out.println("");
    
    Scanner keyboard = new Scanner(System.in);
    NumberFormat currency = NumberFormat.getCurrencyInstance();
    
    System.out.println("Enter the House Purchase Cost");
    int purchaseCost = keyboard.nextInt();
    
    System.out.println("Enter the Down Payment");
    int downPayment = keyboard.nextInt();
    
    System.out.println("Enter the Annual Interest Rate as a whole number");
    double monthlyInterestRate = (keyboard.nextDouble() / 12) / 100;
    
    System.out.println("Enter the Term in Months");
    int loanTerm = keyboard.nextInt();
    
    double loanAmount = purchaseCost - downPayment;
    double monthlyPayment = (loanAmount * monthlyInterestRate/(1 - 1 / Math.pow(1 + monthlyInterestRate, loanTerm)));
    System.out.println("The Monthly Payment is: " + currency.format(monthlyPayment));
    
    System.out.printf("%-15s%-15s%-15s%-15s%-15s %n", "Month", "Monthly", "Interest", "Principal", "Remaining");
    System.out.printf("%-15s%-15s%-15s%-15s%-15s  %n", "Number", "Pymt", "Paid", "Paid", "Balance");
    
    double totalInterestPaid = 0;
    double totalPrincipalPaid = 0;
    int totalMonths = 0;
    
    for (int i = 1; i <= 360; i++)
    {
      double monthlyInterestPaid = loanAmount * monthlyInterestRate;
      double monthlyPrincipalPaid = monthlyPayment - monthlyInterestPaid;
      loanAmount -= monthlyPrincipalPaid;
      totalInterestPaid += monthlyInterestPaid;
      totalPrincipalPaid += monthlyPrincipalPaid;
      System.out.printf("%-15s%-15s%-15s%-15s%-15s  %n", i, currency.format(monthlyPayment), currency.format(monthlyInterestPaid), currency.format(monthlyPrincipalPaid), currency.format(Math.abs(loanAmount)));
      totalMonths++;
    }
    
    System.out.println("It will take you " + totalMonths + " months to pay off the house.");
    System.out.println("You will have paid " + currency.format(totalInterestPaid) + " in interest and " + currency.format(totalPrincipalPaid) + " in principal." );
  }
  
}
