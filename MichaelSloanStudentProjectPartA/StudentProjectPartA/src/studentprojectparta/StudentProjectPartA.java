package studentprojectparta;

import java.text.DecimalFormat;
import java.time.Duration;
import java.time.Instant;

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
    
    System.out.println("While loop average elapsed time: " + format.format((double)whileLoop() / 1000) + " seconds");
    System.out.println("Do While loop average elapsed time: ");
    System.out.println("For loop average elapsed time: ");
    
    
    
  }
  private static Long whileLoop()
  {
    int intCounter = 1;
    double dblSquared = 0.0;
    double dblLog = 0.0;
    double dblElapsedTime = 0.0;
    int intLoops = 0;
    Instant startTime = Instant.now();
    
    while (intCounter < 10000001)
    {
      intCounter = ++intCounter;
      intLoops = ++intLoops;
      dblSquared = Math.pow(intCounter, 2);
      dblLog = Math.log10(intCounter);   
    }
    
    Instant stopTime = Instant.now();
    
    return Duration.between(startTime, stopTime).toMillis();
    
  }
  
  private static void doWhileLoop()
  {
    
  }
  
  private static void forLoop()
  {
    
  }
  
}
