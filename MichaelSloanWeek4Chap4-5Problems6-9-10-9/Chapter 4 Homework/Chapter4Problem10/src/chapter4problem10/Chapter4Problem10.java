/*
 * IT-2650 Java Programming, Spring 2022
 * Instructor: Martin P. Walsh
 * Student Name: Michael Sloan
 * Homework Assignment: Chap 4 - Problem 10
 * Purpose of Assignment: Application to store pet info and calculate medicine dosage.
 */
package chapter4problem10;

import java.util.Scanner;

/**
 *
 * @author Michael Sloan
 */
public class Chapter4Problem10
{

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args)
  {
    System.out.println("IT-2650 Java Programming");
    System.out.println("Student Name: Michael Sloan");
    System.out.println("Homework Assignment: Chapter 4, Problem 10");
    System.out.println("_________________________________");
    System.out.println("");

    Pet usersPet = new Pet("Jane Doe");
    System.out.println("My records on your pet are incomplete.");
    System.out.println("Here is what they currently say:");
    System.out.println(usersPet);

    Scanner keyboard = new Scanner(System.in);
    System.out.println("Please enter the pet's name:");
    String name = keyboard.nextLine();
    System.out.println("Please enter the pet's type (dog or cat):");
    String type = keyboard.nextLine();
    System.out.println("Please enter the pet's age:");
    int age = keyboard.nextInt();
    System.out.println("Please enter the pet's weight:");
    double weight = keyboard.nextDouble();
    usersPet.set(name, age, weight, type);
    System.out.println("My records now say:");
    System.out.println(usersPet);
  }

}
