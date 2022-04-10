/*
 * IT-2650 Java Programming, Spring 2022
 * Instructor: Martin P. Walsh
 * Student Name: Michael Sloan
 * Homework Assignment: Chap 3 - Problem 1
 * Purpose of Assignment: Write a program to estimate the square root of a given number.
 */
package chapter3problem1;

import java.util.Scanner;

/**
 *
 * @author Michael Sloan
 */
public class Chapter3Problem1
{

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args)
  {
    System.out.println("IT-2650 Java Programming");
    System.out.println("Student Name: Michael Sloan");
    System.out.println("Homework Assignment: Chapter 3, Problem 1");
    System.out.println("_________________________________");
    System.out.println("");

    Scanner keyboard = new Scanner(System.in);

    System.out.println("This program estimates square roots.");
    System.out.println("Enter an integer to estimate the square root of:");
    int number = keyboard.nextInt();
    double guess = number / 2.0;
    double newGuess;

    do
    {
      newGuess = number / guess;
      guess = (guess + newGuess) / 2.0;
      System.out.println("Current guess: " + guess);
    } while ((guess - newGuess) / guess > 0.01 && Math.pow(guess, 2) != number);

    System.out.printf("The estimated square root of %d is: %4.2f%n", number, guess);
  }

}
