/*
 * IT-2650 Java Programming, Spring 2022
 * Instructor: Martin P. Walsh
 * Student Name: Michael Sloan
 * Homework Assignment: Chap 6 - Problem 11
 * Purpose of Assignment: Write a program to assign passenger seats in an airplane.
 */
package chapter6problem11;

import java.util.Scanner;

/**
 *
 * @author Michael Sloan
 */
public class Chapter6Problem11
{

  static int filledSeats = 0;

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args)
  {
    System.out.println("IT-2650 Java Programming");
    System.out.println("Student Name: Michael Sloan");
    System.out.println("Homework Assignment: Chapter 6, Problem 11");
    System.out.println("_________________________________");
    System.out.println("");

    Scanner keyboard = new Scanner(System.in);

    System.out.println("You will be selecting seats for this airplane.");

    char[][] seats = new char[7][4];
    for (int i = 0; i < 7; i++)
    {
      seats[i][0] = 'A';
      seats[i][1] = 'B';
      seats[i][2] = 'C';
      seats[i][3] = 'D';
    }
    printSeats(seats);

    String seatNumber = " ";

    // print seating pattern and put an X in the seatNumber location
    while (filledSeats < 28 && seatNumber.length() > 0)
    {
      System.out.println("Enter seat to assign (e.g., '1A')," + "or q to quit.");
      seatNumber = keyboard.nextLine();
      if (seatNumber.equals("q"))
      {
        System.out.println("Program ended.");
        System.exit(0);
      }
      int row = seatNumber.charAt(0) - '1';
      int col = seatNumber.charAt(1) - 'A';
      if (row < 0 || row > 7 || col < 0 || col > 4)
      {
        System.out.println("Input error. Enter seat to assign (e.g., '1A')," + "or q to quit.");
        seatNumber = keyboard.nextLine();
        if (seatNumber.equals("q"))
        {
          System.out.println("Program ended.");
          System.exit(0);
        }
      } else
      {
        if (seats[row][col] != 'X')
        {
          seats[row][col] = 'X';
          filledSeats++;
          printSeats(seats);
        }
      }
    }

  }

  private static void printSeats(char[][] seats)
  {
    for (int i = 0; i < seats.length; i++)
    {
      System.out.println((i + 1) + "  " + seats[i][0] + seats[i][1] + " " + seats[i][2] + seats[i][3]);
    }
    int numberOfSeatsAvailable = (28 - filledSeats);
    System.out.println("There are " + numberOfSeatsAvailable + " seats available.");
  }

}
