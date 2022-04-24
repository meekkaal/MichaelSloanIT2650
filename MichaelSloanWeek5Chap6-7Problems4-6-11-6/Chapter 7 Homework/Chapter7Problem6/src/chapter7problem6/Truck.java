package chapter7problem6;

/**
 * This is a Truck class.
 *
 * @author Michael Sloan
 */
public class Truck extends Vehicle
{
  private double loadCapacity;
  private int towingCapacity;
  
  /**
   * Default constructor.
   *
   */
  public Truck()
  {
    loadCapacity = 0;
    towingCapacity = 0; 
  }  
    
  /**
   *
   * @param manufacturerName String name of manufacturer.
   * @param cylinders Int amount of cylinders.
   * @param owner Person owner of the Truck.
   * @param loadCapacity Double load capacity in pounds.
   * @param towingCapacity Int towing capacity.
   */
  public Truck(String manufacturerName, int cylinders, Person owner, double loadCapacity, int towingCapacity)
  {
    super(manufacturerName,cylinders, owner);
    this.loadCapacity = loadCapacity;
    this.towingCapacity = towingCapacity;
  }
  
  /**
   * Copy constructor
   *
   * @param truck Another Truck object.
   */
  public Truck(Truck truck)
  {
    super(truck);
    loadCapacity = truck.loadCapacity;
    towingCapacity = truck.towingCapacity;
  }
  
  /**
   *
   * @return Double load capacity in pounds.
   */
  public double getLoadCapacity()
  {
    return loadCapacity;
  }
  
  /**
   *
   * @param loadCapacity Double load capacity in pounds.
   */
  public void setLoadCapacity(double loadCapacity)
  {
    this.loadCapacity = loadCapacity;
  }
  
  /**
   *
   * @return Int towing capacity.
   */
  public int getTowingCapacity()
  {
    return towingCapacity;
  }
  
  /**
   *
   * @param towingCapacity Int towing capacity.
   */
  public void setTowingCapacity(int towingCapacity)
  {
    this.towingCapacity = towingCapacity;
  }
  
  /**
   *
   * @return String representation of the Truck.
   */
  @Override
  public String toString()
  {
    return super.toString() + ", load capacity " + loadCapacity + ", towing capacity " + towingCapacity;
  }
  
  /**
   *
   * @param other Other Truck for comparison.
   * @return Boolean indicating equality.
   */
  @Override
  public boolean equals(Object other)
  {
    if (other == null)
    {
      return false;
    }
    else if (getClass() != other.getClass())
    {
      return false;
    }
    else
    {
      Truck otherTruck = (Truck)other;
      return (loadCapacity == otherTruck.loadCapacity 
              && towingCapacity == otherTruck.towingCapacity 
              && getOwner().equals(otherTruck.getOwner()));
    }
  }
}
