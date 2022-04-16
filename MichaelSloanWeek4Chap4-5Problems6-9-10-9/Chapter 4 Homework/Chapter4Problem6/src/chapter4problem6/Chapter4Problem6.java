/*
 * IT-2650 Java Programming, Spring 2022
 * Instructor: Martin P. Walsh
 * Student Name: Michael Sloan
 * Homework Assignment: Chap 4 - Problem 6
 * Purpose of Assignment: Weighted Average of Student Grades
 */
package chapter4problem6;

import java.util.Scanner;
import java.text.DecimalFormat;

/**
 *
 * @author Michael Sloan
 */
public class Chapter4Problem6
{

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args)
  {
    System.out.println("IT-2650 Java Programming");
    System.out.println("Student Name: Michael Sloan");
    System.out.println("Homework Assignment: Chapter 4, Problem 6");
    System.out.println("_________________________________");
    System.out.println("");
    
    Scanner keyboard = new Scanner(System.in);
    DecimalFormat gradeFormat = new DecimalFormat("##0.00");
    StudentRecord record = new StudentRecord();
    
    
    System.out.println("Enter the student't score on the first quiz (10 Possible Points):");
    int quizScore1 = keyboard.nextInt();
    System.out.println("Enter the student't score on the second quiz (10 Possible Points):");
    int quizScore2 = keyboard.nextInt();
    System.out.println("Enter the student't score on the third quiz (10 Possible Points):");
    int quizScore3 = keyboard.nextInt();
    System.out.println("Enter the student't score on the midterm (100 Possible Points):");
    int midtermScore = keyboard.nextInt();
    System.out.println("Enter the student't score on the final (100 Possible Points):");
    int finalScore = keyboard.nextInt();
    
    record.setQuizScores(quizScore1, quizScore2, quizScore3);
    record.setTestScores(midtermScore, finalScore);
    
    record.calculateNumericGrade();
    record.calculateLetterGrade();
    
    
    System.out.println("Student Record: " + record.getScores()
                       + " Overall numeric grade: " + gradeFormat.format(record.getTotalScore())
                       + " Letter Grade: " + record.getLetterGrade()
            );
  }
  
}
