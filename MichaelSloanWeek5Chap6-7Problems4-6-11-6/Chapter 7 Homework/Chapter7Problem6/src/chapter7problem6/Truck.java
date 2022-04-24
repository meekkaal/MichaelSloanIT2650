package chapter7problem6;

/**
 *
 * @author Michael Sloan
 */
public class Truck extends Vehicle
{
  private double loadCapacity;
  private int towingCapacity;
  
  public Truck()
  {
    loadCapacity = 0;
    towingCapacity = 0; 
  }  
    
  /**
   *
   * @param manufacturerName
   * @param cylinders
   * @param owner
   * @param loadCapacity
   * @param towingCapacity
   */
  public Truck(String manufacturerName, int cylinders, Person owner, double loadCapacity, int towingCapacity)
  {
    super(manufacturerName,cylinders, owner);
    this.loadCapacity = loadCapacity;
    this.towingCapacity = towingCapacity;
  }
  
  public Truck(Truck truck)
  {
    super(truck);
    loadCapacity = truck.loadCapacity;
    towingCapacity = truck.towingCapacity;
  }
  
  public double getLoadCapacity()
  {
    return loadCapacity;
  }
  
  public void setLoadCapacity(double loadCapacity)
  {
    this.loadCapacity = loadCapacity;
  }
  
  public int getTowingCapacity()
  {
    return towingCapacity;
  }
  
  public void setTowingCapacity(int towingCapacity)
  {
    this.towingCapacity = towingCapacity;
  }
  
  
  @Override
  public String toString()
  {
    return super.toString() + ", load capacity " + loadCapacity + ", towing capacity " + towingCapacity;
  }
  
  /**
   *
   * @param other
   * @return
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
