package chapter7problem6;

/**
 * This is a Person class.
 *
 * @author Michael Sloan
 */
public class Person
{
  private String name;
  
  /**
   * Default constructor.
   *
   */
  public Person()
  {
    this.name = "";
  }

  /**
   * Constructor that uses a name parameter.
   *
   * @param name String name of the person.
   */
  public Person(String name)
  {
    this.name = name;
  }

  /**
   * Copy constructor.
   *
   * @param theObject Another Person object.
   */
  public Person(Person theObject)
  {
    name = theObject.name;
  }

  /**
   * Retrieve the person's name.
   *
   * @return String value for person's name.
   */
  public String getName()
  {
    return name;
  }

  /**
   * Set the person's name.
   *
   * @param theName String value for person's name.
   */
  public void setName(String theName)
  {
   name = theName; 
  }

  /**
   *
   * @return String representation of the person.
   */
  @Override
  public String toString()
  {
    return (name);
  }

  /**
   *
   * @param other Other object for comparison.
   * @return Boolean indicating equality
   */
  @Override
  public boolean equals (Object other)
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
      Person otherPerson = (Person)other;
      return (name.equals(otherPerson.name));
    }
  }
  
}
