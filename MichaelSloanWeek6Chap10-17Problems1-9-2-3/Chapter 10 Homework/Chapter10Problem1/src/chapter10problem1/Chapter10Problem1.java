/*
 * IT-2650 Java Programming, Spring 2022
 * Instructor: Martin P. Walsh
 * Student Name: Michael Sloan
 * Homework Assignment: Chap 10 - Problem 1
 * Purpose of Assignment: Read two text files containing names into memory then prompt the user for a name to search.
 */
package chapter10problem1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author Michael Sloan
 */
public class Chapter10Problem1
{

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args)
  {
    System.out.println("IT-2650 Java Programming");
    System.out.println("Student Name: Michael Sloan");
    System.out.println("Homework Assignment: Chapter 10, Problem 1");
    System.out.println("_________________________________");
    System.out.println("");
    
    Scanner keyboard = new Scanner(System.in);
    Scanner boyNameInputStream = null;
    Scanner girlNameInputStream = null;
    String[][] boyNames = new String[1000][2];
    String[][] girlNames = new String[1000][2];
    
    try
    {
      boyNameInputStream = new Scanner(new FileInputStream("./boynames.txt"));
      girlNameInputStream = new Scanner(new FileInputStream("./girlnames.txt"));
    }
    catch (FileNotFoundException e)
    {
      System.out.println("Problem opening files.");
      System.exit(0);
    }
    
    while (boyNameInputStream.hasNextLine())
    {
      for (int i = 0; i < boyNames.length; i++)
      {
        boyNames[i][0] = boyNameInputStream.next();
        boyNames[i][1] = boyNameInputStream.next();
        boyNameInputStream.nextLine();
      }
    }
    
    while (girlNameInputStream.hasNextLine())
    {
      for (int i = 0; i < girlNames.length; i++)
      {
        girlNames[i][0] = girlNameInputStream.next();
        girlNames[i][1] = girlNameInputStream.next();
        girlNameInputStream.nextLine();
      }
    }
    
    System.out.println("Enter name: ");
    String name = keyboard.nextLine();
    boolean foundMatch = false;
    
    for (int i = 0; i < girlNames.length; i++)
    {
      if (girlNames[i][0].equals(name))
      {
        System.out.println(name + " is ranked " + (i+1) + " in popularity among girls with " + girlNames[i][1] + " namings.");
        foundMatch = true;
      }
    }
    if (!foundMatch)
    {
      System.out.println(name + " is not ranked among the top 1000 girl names");
    }
    
    for (int i = 0; i < boyNames.length; i++)
    {
      if (boyNames[i][0].equals(name))
      {
        System.out.println(name + " is ranked " + (i+1) + " in popularity among boys with " + boyNames[i][1] + " namings.");
        foundMatch = true;
      }
    }
    if (!foundMatch)
    {
      System.out.println(name + " is not ranked among the top 1000 boy names");
    }
    
    
    boyNameInputStream.close();
    girlNameInputStream.close();
  }
  
}
