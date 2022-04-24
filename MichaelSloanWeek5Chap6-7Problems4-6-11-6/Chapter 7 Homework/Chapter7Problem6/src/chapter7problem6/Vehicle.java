package chapter7problem6;

/**
 *
 * @author Michael Sloan
 */
public class Vehicle
{
  private String manufacturerName;
  private int cylinders;
  private Person owner;

  /**
   *
   */
  public Vehicle()
  {
    this.manufacturerName = "None";
    this.cylinders = 0;
    this.owner = new Person();
  }
  
  /**
   *
   * @param manufacturerName
   * @param cylinders
   * @param owner
   */
  public Vehicle(String manufacturerName, int cylinders, Person owner)
  {
    this.manufacturerName = manufacturerName;
    this.cylinders = cylinders;
    this.owner = owner;
  }

  /**
   *
   * @param manufacturerName
   * @param cylinders
   */
  public Vehicle(String manufacturerName, int cylinders)
  {
    this.manufacturerName = manufacturerName;
    this.cylinders = cylinders;
  }
  
  /**
   *
   * @param vehicle
   */
  public Vehicle(Vehicle vehicle)
  {
    manufacturerName = vehicle.manufacturerName;
    cylinders = vehicle.cylinders;
    owner = vehicle.owner;
  }

  /**
   *
   * @return
   */
  public String getManufacturerName()
  {
    return manufacturerName;
  }

  /**
   *
   * @param manufacturerName
   */
  public void setManufacturerName(String manufacturerName)
  {
    this.manufacturerName = manufacturerName;
  }

  /**
   *
   * @return
   */
  public int getCylinders()
  {
    return cylinders;
  }

  /**
   *
   * @param cylinders
   */
  public void setCylinders(int cylinders)
  {
    this.cylinders = cylinders;
  }

  /**
   *
   * @return
   */
  public Person getOwner()
  {
    return owner;
  }

  /**
   *
   * @param owner
   */
  public void setOwner(Person owner)
  {
    this.owner = owner;
  }

  /**
   *
   * @return
   */
  public String toString()
  {
    return manufacturerName + ", " + cylinders + " cylinders, owned by " + owner;
  }

  /**
   *
   * @param other
   * @return
   */
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
      Vehicle otherVehicle = (Vehicle)other;
      return (manufacturerName.equals(otherVehicle.manufacturerName) 
              && cylinders == otherVehicle.cylinders 
              && owner.equals(otherVehicle.owner));
    }
  }

}
