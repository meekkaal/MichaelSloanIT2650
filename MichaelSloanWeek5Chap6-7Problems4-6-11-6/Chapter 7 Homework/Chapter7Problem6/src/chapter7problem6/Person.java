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
  public boolean equals (Object other)
  {
    return true;
  }
  
}
