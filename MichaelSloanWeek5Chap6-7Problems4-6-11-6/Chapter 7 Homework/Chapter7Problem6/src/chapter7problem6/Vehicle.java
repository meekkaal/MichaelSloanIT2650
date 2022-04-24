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

  public Vehicle()
  {

  }

  public Vehicle(String manufacturerName, int cylinders, Person owner)
  {
    this.manufacturerName = manufacturerName;
    this.cylinders = cylinders;
    this.owner = owner;
  }

  public Vehicle(String manufacturerName, int cylinders)
  {
    this.manufacturerName = manufacturerName;
    this.cylinders = cylinders;
  }

  public String getManufacturerName()
  {
    return manufacturerName;
  }

  public void setManufacturerName(String manufacturerName)
  {
    this.manufacturerName = manufacturerName;
  }

  public int getCylinders()
  {
    return cylinders;
  }

  public void setCylinders(int cylinders)
  {
    this.cylinders = cylinders;
  }

  public Person getOwner()
  {
    return owner;
  }

  public void setOwner(Person owner)
  {
    this.owner = owner;
  }

  public String toString()
  {
    return "";
  }

  public boolean equals(Vehicle other)
  {
    return true;
  }

}
