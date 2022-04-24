package chapter7problem6;

/**
 *
 * @author Michael Sloan
 */
public class Truck extends Vehicle
{
  private double loadCapacity;
  private int towingCapacity;
  
    
  public Truck(String manufacturerName, int cylinders, double loadCapacity, int towingCapacity)
  {
    super(manufacturerName,cylinders);
    this.loadCapacity = loadCapacity;
    this.towingCapacity = towingCapacity;
  }
  
}
