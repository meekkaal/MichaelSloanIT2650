package chapter7problem6;

/**
 *
 * @author Michael Sloan
 */
public class Person
{
  private String name;
  
  public Person()
  {
    this.name = "";
  }
  public Person(String name)
  {
    this.name = name;
  }
  public Person(Person theObject)
  {
    
  }
  public String getName()
  {
    return name;
  }
  public void setName(String theName)
  {
   name = theName; 
  }
  @Override
  public String toString()
  {
    return (name);
  }

  /**
   *
   * @param other
   * @return
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
