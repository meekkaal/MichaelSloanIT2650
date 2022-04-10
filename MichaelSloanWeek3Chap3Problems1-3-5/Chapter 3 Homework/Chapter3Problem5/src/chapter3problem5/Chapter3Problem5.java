/*
 * IT-2650 Java Programming, Spring 2022
 * Instructor: Martin P. Walsh
 * Student Name: Michael Sloan
 * Homework Assignment: Chap 3 - Problem 5
 * Purpose of Assignment: Write a program to compute monthly payment and amortization of a loan.
 */
package chapter3problem5;

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
    
    System.out.println("Enter the House Purchase Cost");
    int purchaseCost = keyboard.nextInt();
    
    System.out.println("Enter the Down Payment");
    int downPayment = keyboard.nextInt();
    
    System.out.println("Enter the Annual Interest Rate as a whole number");
    double interestRate = (keyboard.nextDouble() / 100) / 12;
    
    System.out.println("Enter the Term in Months");
    int loanTerm = keyboard.nextInt();
    
    int loanAmount = purchaseCost - downPayment;
    System.out.println("The Monthly Payment is: " + ((loanAmount * interestRate)/(1 - Math.pow(1 + interestRate, loanTerm))));
    
    System.out.printf("%-15s%-15s%-15s%-15s%-15s %n", "Month", "Monthly", "Interest", "Principal", "Remaining");
    System.out.printf("%-15s%-15s%-15s%-15s%-15s  %n", "Number", "Pymt", "Paid", "Paid", "Balance");
    for (int i = 0; i < 360; i++)
    {
      //System.out.printf("%-15s%-15s%-15s%-15s%-15s  %n", "Number", "Pymt", "Paid", "Paid", "Balance");
    }
  }
  
}
