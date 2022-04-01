/*
 * IT-2650 Java Programming, Spring 2022
 * Instructor: Martin P. Walsh
 * Student Name: Michael Sloan
 * Homework Assignment: Chap 2 - Problem 11
 * Purpose of Assignment: Create a program to calculate total grade for three exercises as a percentage.
 */
package chapter2problem11;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Chapter2Problem11
{
  public static void main(String[] args)
  {
    System.out.println("IT-2650 Java Programming");
    System.out.println("Student Name: Michael Sloan");
    System.out.println("Homework Assignment: Chapter 2, Problem 11");
    System.out.println("_________________________________");
    System.out.println("");

    Scanner keyboard = new Scanner(System.in);
    DecimalFormat percent = new DecimalFormat("0.00%");
    
    System.out.println("Name of exercise 1:");
    String exerciseName1 = keyboard.nextLine();
    System.out.println("Score received for exercise 1:");
    int exerciseScore1 = keyboard.nextInt();
    System.out.println("Total points possible for exercise 1:");
    int possibleExerciseScore1 = keyboard.nextInt();
    keyboard.nextLine();
    
    System.out.println("Name of exercise 2:");
    String exerciseName2 = keyboard.nextLine();
    System.out.println("Score received for exercise 2:");
    int exerciseScore2 = keyboard.nextInt();
    System.out.println("Total points possible for exercise 2:");
    int possibleExerciseScore2 = keyboard.nextInt();
    keyboard.nextLine();
    
    System.out.println("Name of exercise 3:");
    String exerciseName3 = keyboard.nextLine();
    System.out.println("Score received for exercise 3:");
    int exerciseScore3 = keyboard.nextInt();
    System.out.println("Total points possible for exercise 3:");
    int possibleExerciseScore3 = keyboard.nextInt();
    keyboard.nextLine();
    
    int totalScore = exerciseScore1 + exerciseScore2 + exerciseScore3;
    int totalPossible = possibleExerciseScore1 + possibleExerciseScore2 + possibleExerciseScore3;
        
    System.out.printf("%-20s%-20s%-20s %n", "Exercise", "Score", "Total Possible");
    System.out.printf("%-20s%-20d%-20d %n", exerciseName1, exerciseScore1, possibleExerciseScore1);
    System.out.printf("%-20s%-20d%-20d %n", exerciseName2, exerciseScore2, possibleExerciseScore2);
    System.out.printf("%-20s%-20d%-20d %n", exerciseName3, exerciseScore3, possibleExerciseScore3);
    System.out.printf("%-20s%-20d%-20d %n%n", "Total", totalScore, totalPossible);
    System.out.println("Your total is " + totalScore + " out of " + totalPossible + ", or " + percent.format((double) totalScore / (double) totalPossible) + " percent.");
  }
  
}
