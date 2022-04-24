package chapter7problem6;

/**
 * This is a Vehicle class.
 *
 * @author Michael Sloan
 */
public class Vehicle
{
  private String manufacturerName;
  private int cylinders;
  private Person owner;

  /**
   * Default constructor.
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
   * @param manufacturerName String name of manufacturer.
   * @param cylinders Int amount of cylinders.
   * @param owner Person owner of the vehicle.
   */
  public Vehicle(String manufacturerName, int cylinders, Person owner)
  {
    this.manufacturerName = manufacturerName;
    this.cylinders = cylinders;
    this.owner = owner;
  }

  /**
   *
   * @param manufacturerName String name of manufacturer.
   * @param cylinders Int amount of cylinders.
   */
  public Vehicle(String manufacturerName, int cylinders)
  {
    this.manufacturerName = manufacturerName;
    this.cylinders = cylinders;
  }
  
  /**
   * Copy constructor.
   * 
   * @param vehicle Another Vehicle object.
   */
  public Vehicle(Vehicle vehicle)
  {
    manufacturerName = vehicle.manufacturerName;
    cylinders = vehicle.cylinders;
    owner = vehicle.owner;
  }

  /**
   *
   * @return String name of manufacturer.
   */
  public String getManufacturerName()
  {
    return manufacturerName;
  }

  /**
   *
   * @param manufacturerName String name of manufacturer.
   */
  public void setManufacturerName(String manufacturerName)
  {
    this.manufacturerName = manufacturerName;
  }

  /**
   *
   * @return Int amount of cylinders.
   */
  public int getCylinders()
  {
    return cylinders;
  }

  /**
   *
   * @param cylinders Int amount of cylinders.
   */
  public void setCylinders(int cylinders)
  {
    this.cylinders = cylinders;
  }

  /**
   *
   * @return Person owner of the vehicle.
   */
  public Person getOwner()
  {
    return owner;
  }

  /**
   *
   * @param owner Person owner of the vehicle.
   */
  public void setOwner(Person owner)
  {
    this.owner = owner;
  }

  /**
   *
   * @return String representation of the vehicle.
   */
  public String toString()
  {
    return manufacturerName + ", " + cylinders + " cylinders, owned by " + owner;
  }

  /**
   *
   * @param other Other object for comparison
   * @return Boolean indicating equality of the objects.
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
