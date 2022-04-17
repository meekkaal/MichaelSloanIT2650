/*
 * IT-2650 Java Programming, Spring 2022
 * Instructor: Martin P. Walsh
 * Student Name: Michael Sloan
 * Homework Assignment: Chap 5 - Problem 9
 * Purpose of Assignment: Create example javadoc documentation
 */
package chapter5problem9;

/**
 * NOTE WELL: This application will compile but will not run because neither class file has a Main method The purpose of this problem
 * is to create documentation, not to run an application. To generate Javadoc HTML documentation for both source files you will use the
 * following command prompt command: “C:\(SRC folder)> javadoc –author –version *.java “ (Note – you must be in the Project’s SRC
 * folder)
 *
 * @version 1.0 Spring 2022
 * @author Michael Sloan
 */
public class Chapter5Problem9
{

  private String name;
  private Date born;
  private Date died;//null indicates still alive.

  /**
   * Chapter5Question9 constructor (originally was Person constructor.)
   *
   * @param initialName Initial name of person
   * @param birthDate Birth date of person
   * @param deathDate Death date of person
   */
  public Chapter5Problem9(String initialName, Date birthDate, Date deathDate)
  {
    if (consistent(birthDate, deathDate))
    {
      name = initialName;
      born = new Date(birthDate);
      if (deathDate == null)
      {
        died = null;
      } else
      {
        died = new Date(deathDate);
      }
    } else
    {
      System.out.println("Inconsistent dates. Aborting.");
      System.exit(0);
    }
  }

  /**
   * Chapter5Question9 copy constructor.
   *
   * @param original original class object used for new copy
   */
  public Chapter5Problem9(Chapter5Problem9 original)
  {
    if (original == null)
    {
      System.out.println("Fatal error.");
      System.exit(0);
    }

    name = original.name;
    born = new Date(original.born);

    if (original.died == null)
    {
      died = null;
    } else
    {
      died = new Date(original.died);
    }
  }

  /**
   * Sets a new name, birth, and death date.
   *
   * @param newName New name of person
   * @param birthDate New birth date of person
   * @param deathDate New death date of person
   */
  public void set(String newName, Date birthDate, Date deathDate)
  {
    if (consistent(birthDate, deathDate))
    {
      name = newName;
      born = new Date(birthDate);
      if (deathDate == null)
      {
        died = null;
      } else
      {
        died = new Date(deathDate);
      }
    } else
    {
      System.out.println("Inconsistent dates. Aborting.");
      System.exit(0);
    }
  }

  /**
   * Return's the person's details encoded in a String.
   *
   * @return String containing person's details
   */
  public String toString()
  {
    String diedString;
    if (died == null)
    {
      diedString = ""; //Empty string
    } else
    {
      diedString = died.toString();
    }

    return (name + ", " + born + "-" + diedString);
  }

  /**
   *
   * @param otherPerson instance of person used for comparison
   * @return Boolean indicating equality of two persons
   */
  public boolean equals(Chapter5Problem9 otherPerson)
  {
    if (otherPerson == null)
    {
      return false;
    } else
    {
      return (name.equals(otherPerson.name)
              && born.equals(otherPerson.born)
              && datesMatch(died, otherPerson.died));
    }
  }

  /**
   * To match date1 and date2 must either be the same date or both be null.
   */
  private static boolean datesMatch(Date date1, Date date2)
  {
    if (date1 == null)
    {
      return (date2 == null);
    } else if (date2 == null) //&& date1 != null
    {
      return false;
    } else // both dates are not null.
    {
      return (date1.equals(date2));
    }
  }

  /**
   * Precondition: newDate is a consistent date of birth. Postcondition: Date of birth of the calling object is newDate.
   *
   * @param newDate New birth date to be assigned to a person
   */
  public void setBirthDate(Date newDate)
  {
    if (consistent(newDate, died))
    {
      born = new Date(newDate);
    } else
    {
      System.out.println("Inconsistent dates. Aborting.");
      System.exit(0);
    }
  }

  /**
   * Precondition: newDate is a consistent date of death. Postcondition: Date of death of the calling object is newDate.
   *
   * @param newDate New death date to be assigned to a person
   */
  public void setDeathDate(Date newDate)
  {

    if (!consistent(born, newDate))
    {
      System.out.println("Inconsistent dates. Aborting.");
      System.exit(0);
    }

    if (newDate == null)
    {
      died = null;
    } else
    {
      died = new Date(newDate);
    }
  }

  /**
   * Change the person's name.
   *
   * @param newName New name to be assigned to a person
   */
  public void setName(String newName)
  {
    name = newName;
  }

  /**
   * Precondition: The date of birth has been set, and changing the year part of the date of birth will give a consistent date of
   * birth. Postcondition: The year of birth is (changed to) newYear.
   *
   * @param newYear New birth year for person
   */
  public void setBirthYear(int newYear)
  {
    if (born == null) //Precondition is violated
    {
      System.out.println("Fata; Error. Aborting.");
      System.exit(0);
    }
    born.setYear(newYear);
    if (!consistent(born, died))
    {
      System.out.println("Inconsistent dates. Aborting.");
      System.exit(0);
    }
  }

  /**
   * Precondition: The date of death has been set, and changing the year part of the date of death will give a consistent date of
   * death. Postcondition: The year of death is (changed to) newYear.
   *
   * @param newYear new death year for person
   */
  public void setDeathYear(int newYear)
  {
    if (died == null) //Precondition is violated
    {
      System.out.println("Fata; Error. Aborting.");
      System.exit(0);
    }
    died.setYear(newYear);
    if (!consistent(born, died))
    {
      System.out.println("Inconsistent dates. Aborting.");
      System.exit(0);
    }
  }

  /**
   * Retrieves the person's name.
   *
   * @return String of person's name
   */
  public String getName()
  {
    return name;
  }

  /**
   * Retrieves the person's birth date.
   *
   * @return Date of person's birth date
   */
  public Date getBirthDate()
  {
    return new Date(born);
  }

  /**
   * Retrieves the person's death date.
   *
   * @return Date of person's death date.
   */
  public Date getDeathDate()
  {
    if (died == null)
    {
      return null;
    } else
    {
      return new Date(died);
    }
  }

  /**
   * To be consistent, birthDate must not be null. If there is no date of death (deathDate == null), that is consistent with any
   * birthDate. Otherwise, the birthDate must come before or be equal to the deathDate.
   */
  private static boolean consistent(Date birthDate, Date deathDate)
  {
    if (birthDate == null)
    {
      return false;
    } else if (deathDate == null)
    {
      return true;
    } else
    {
      return (birthDate.precedes(deathDate)
              || birthDate.equals(deathDate));
    }
  }

}
