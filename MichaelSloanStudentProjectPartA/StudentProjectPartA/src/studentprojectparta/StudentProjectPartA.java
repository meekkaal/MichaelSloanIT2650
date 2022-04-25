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
    DecimalFormat format = new DecimalFormat("0.0000");

    System.out.println("Average Elapsed Time for 10,000,000 loops in seconds");
    System.out.println("___________________________");
    System.out.println();

    double whileLoop = whileLoop();
    System.out.println("While loop average elapsed time: " + format.format(whileLoop) + " seconds");
    double doWhileLoop = doWhileLoop();
    System.out.println("Do While loop average elapsed time: " + format.format(doWhileLoop) + " seconds");
    double forLoop = forLoop();
    System.out.println("For loop average elapsed time: " + format.format(forLoop) + " seconds");

    System.out.print("Fastest average time is: ");
    if (whileLoop < doWhileLoop && whileLoop < forLoop)
    {
      System.out.println(format.format(whileLoop) + " seconds");
    } else
    {
      if (doWhileLoop < whileLoop && doWhileLoop < forLoop)
      {
        System.out.println(format.format(doWhileLoop) + " seconds");
      } else
      {
        if (forLoop < whileLoop && forLoop < doWhileLoop)
        {
          System.out.println(format.format(forLoop) + " seconds");
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
        ++intCounter;
        ++intLoops;
        dblSquared = Math.pow(intCounter, 2);
        dblLog = Math.log10(intCounter);
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
        ++intCounter;
        ++intLoops;
        dblSquared = Math.pow(intCounter, 2);
        dblLog = Math.log10(intCounter);
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
