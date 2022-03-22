/*
 * IT-2650 Java Programming, Spring 2022
 * Instructor: Martin P. Walsh
 * Student Name: Michael Sloan
 * Homework Assignment: Chap 1 - Problem 6
 * Purpose of Assignment: 
 */
package chapter1problem6;

import java.util.Scanner;
import java.text.DecimalFormat;
import java.lang.Math;

public class Chapter1Problem6
{

  public static void main(String[] args)
  {
    System.out.println("IT-2650 Java Programming");
    System.out.println("Student Name: Michael Sloan");
    System.out.println("Homework Assignment: Chapter 1, Problem 6");
    System.out.println(" _________________________________ ");
    System.out.println("");

    Scanner keyboard = new Scanner(System.in);
    DecimalFormat df = new DecimalFormat("#,###,##0.00");

    double gearSize = 0;
    double cadence = 0;
    double bikeSpeed = 0;

    System.out.println("Enter your Gear Size in inches:");
    gearSize = keyboard.nextDouble();
    System.out.println("Enter your Revolutions Per Minute (RPM):");
    cadence = keyboard.nextDouble();
    bikeSpeed = gearSize * Math.PI * (1.0 / 12.0) * (1.0 / 5280.0) * cadence * 60;

    System.out.println("With a gear size of " + gearSize + " and a cadence (i.e. RPM) of " + cadence + " your bike speed will be " + df.format(bikeSpeed) + " miles per hour.");
  }

}
