/*
 * IT-2650 Java Programming, Spring 2022
 * Instructor: Martin P. Walsh
 * Student Name: Michael Sloan
 * Homework Assignment: Student Project Part A
 * Purpose of Assignment: Desktop Loop Comparison Console Application – Which Loop structure is the fastest?
 */
package studentprojectparta;

import java.text.DecimalFormat;
import java.time.Instant;
import java.time.Duration;

/**
 *
 * @author Michael Sloan
 */
public class StudentProjectPartA
{

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args)
  {
    System.out.println("IT-2650 Java Programming");
    System.out.println("Student Name: Michael Sloan");
    System.out.println("Homework Assignment: Student Project Part A");
    System.out.println("_________________________________");
    System.out.println("");
    
    DecimalFormat format = new DecimalFormat("0.0000");

    System.out.println("Average Elapsed Time for 10,000,000 loops in seconds");
    System.out.println("___________________________");
    System.out.println();

    double whileLoopAverage = whileLoop();
    System.out.println("While loop average elapsed time: " + format.format(whileLoopAverage) + " seconds");
    double doWhileLoopAverage = doWhileLoop();
    System.out.println("Do While loop average elapsed time: " + format.format(doWhileLoopAverage) + " seconds");
    double forLoopAverage = forLoop();
    System.out.println("For loop average elapsed time: " + format.format(forLoopAverage) + " seconds");

    System.out.println();
    System.out.print("Fastest average time is: ");
    if (whileLoopAverage < doWhileLoopAverage && whileLoopAverage < forLoopAverage)
    {
      System.out.println("While Loop " + format.format(whileLoopAverage) + " seconds");
    } else
    {
      if (doWhileLoopAverage < whileLoopAverage && doWhileLoopAverage < forLoopAverage)
      {
        System.out.println("Do While Loop " + format.format(doWhileLoopAverage) + " seconds");
      } else
      {
        if (forLoopAverage < whileLoopAverage && forLoopAverage < doWhileLoopAverage)
        {
          System.out.println("For Loop " + format.format(forLoopAverage) + " seconds");
        }
      }
    }
  }

  private static Double whileLoop()
  {
    int intCounter = 1;
    int intLoops = 0;
    double dblSquared = 0.0;
    double dblLog = 0.0;
    double dblElapsedTime = 0.0;
    long sum = 0;
    long[] whileCounter = new long[10];

    for (int i = 0; i < 10; i++)
    {
      Instant startTime = Instant.now();
      while (intCounter < 10000001)
      {
        dblSquared = Math.pow(intCounter, 2);
        dblLog = Math.log10(intCounter);
        intCounter++;
        intLoops++;
      }
      Instant endTime = Instant.now();
      whileCounter[i] = Duration.between(startTime, endTime).toMillis();
      sum = sum + whileCounter[i];
      intCounter = 1;
    }
    return (sum / whileCounter.length) / 1000.0;

  }

  private static Double doWhileLoop()
  {
    int intCounter = 1;
    double dblSquared = 0.0;
    double dblLog = 0.0;
    double dblElapsedTime = 0.0;
    long sum = 0;
    int intLoops = 0;

    long[] doWhileCounter = new long[10];

    for (int i = 0; i < 10; i++)
    {
      Instant startTime = Instant.now();
      do
      {
        dblSquared = Math.pow(intCounter, 2);
        dblLog = Math.log10(intCounter);
        intCounter++;
        intLoops++;
      } while (intCounter <= 10000000);
      Instant endTime = Instant.now();
      doWhileCounter[i] = Duration.between(startTime, endTime).toMillis();
      sum = sum + doWhileCounter[i];
      intCounter = 1;
    }

    return (sum / doWhileCounter.length) / 1000.0;
  }

  private static Double forLoop()
  {
    double dblSquared = 0.0;
    double dblLog = 0.0;
    double dblElapsedTime = 0.0;
    long sum = 0;
    int intLoops = 0;
    long[] forCounter = new long[10];

    for (int i = 0; i < 10; i++)
    {
      Instant startTime = Instant.now();
      for (int intCounter = 1; intCounter <= 10000000; ++intCounter)
      {
        ++intLoops;
        dblSquared = Math.pow(intLoops, 2);
        dblLog = Math.log10(intLoops);
      }
      Instant endTime = Instant.now();
      forCounter[i] = Duration.between(startTime, endTime).toMillis();
      sum = sum + forCounter[i];
    }
    return (sum / forCounter.length) / 1000.0;
  }

}
