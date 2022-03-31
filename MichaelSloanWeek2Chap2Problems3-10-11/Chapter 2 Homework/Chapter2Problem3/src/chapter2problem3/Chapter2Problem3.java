/*
 * IT-2650 Java Programming, Spring 2022
 * Instructor: Martin P. Walsh
 * Student Name: Michael Sloan
 * Homework Assignment: Chap 2 - Problem 3
 * Purpose of Assignment: Application that outputs sum, difference, and product of two numbers.
 */
package chapter2problem3;

import java.util.Scanner;

public class Chapter2Problem3
{
  public static void main(String[] args)
  {
    System.out.println("IT-2650 Java Programming");
    System.out.println("Student Name: Michael Sloan");
    System.out.println("Homework Assignment: Chapter 2, Problem 3");
    System.out.println("_________________________________");
    System.out.println("");

    Scanner keyboard = new Scanner(System.in);
    
    int firstNumber, secondNumber, sum, difference, product;
    
    System.out.println("Enter first number to add:");
    firstNumber = keyboard.nextInt();
    System.out.println("Enter second number to add:");
    secondNumber = keyboard.nextInt();
    
    sum = firstNumber + secondNumber;
    difference = firstNumber - secondNumber;
    product = firstNumber * secondNumber;
    
    System.out.println("Adding " + firstNumber + " + " + secondNumber + " equals " + sum);
    System.out.println("Subtracting " + firstNumber + " - " + secondNumber + " equals " + difference);
    System.out.println("Multiplying " + firstNumber + " * " + secondNumber + " equals " + product);
  }
  
}
