/*
 * IT-2650 Java Programming, Spring 2022
 * Instructor: Martin P. Walsh
 * Student Name: Michael Sloan
 * Homework Assignment: Chap 1 - Problem 9
 * Purpose of Assignment: Create an application to estimate ideal body weight.
 */
package chapter1problem9;

import java.util.Scanner;

public class Chapter1Problem9
{
  public static void main(String[] args)
  {
    System.out.println("IT-2650 Java Programming");
    System.out.println("Student Name: Michael Sloan");
    System.out.println("Homework Assignment: Chapter 1, Problem 9");
    System.out.println(" _________________________________ ");
    System.out.println("");
    
    Scanner keyboard = new Scanner(System.in);
    
    int heightFeet, heightInches;
    int idealWeight = 110;
    
    System.out.println("Please enter your Height as two numbers, Feet followed by Inches");
    System.out.println("--------------------------------");
    System.out.println("Enter the Feet portion of your Height as a whole number:");
    heightFeet = keyboard.nextInt();
    System.out.println(" Enter the Inches portion of your Height as a whole number:");
    heightInches = keyboard.nextInt();
    System.out.println(" _________________________________ ");
    System.out.println("Based on your Height your ideal body weight is:");
    System.out.println(idealWeight + " pounds");
    
    
  }
  
}
