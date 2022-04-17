package chapter5problem9;

import java.util.Scanner;

/**
 *
 * @author torna
 */
public class Date
{

  private String month;
  private int day;
  private int year; //a four digit number.

  /**
   * Default constructor.
   *
   */
  public Date()
  {
    month = "January";
    day = 1;
    year = 1000;
  }

  /**
   *
   * @param monthInt Number of the month
   * @param day Number of the day
   * @param year Number of the year
   */
  public Date(int monthInt, int day, int year)
  {
    setDate(monthInt, day, year);
  }

  /**
   *
   * @param monthString String of the month
   * @param day Number of the day
   * @param year Number of the year
   */
  public Date(String monthString, int day, int year)
  {
    setDate(monthString, day, year);
  }

  /**
   *
   * @param year number of the year
   */
  public Date(int year)
  {
    setDate(1, 1, year);
  }

  /**
   *
   * @param aDate constructor using passed in Date
   */
  public Date(Date aDate)
  {
    if (aDate == null)//Not a real date.
    {
      System.out.println("Fatal Error.");
      System.exit(0);
    }

    month = aDate.month;
    day = aDate.day;
    year = aDate.year;
  }

  /**
   *
   * @param monthInt numeric value of month
   * @param day numeric value of day in month
   * @param year numeric value of year
   */
  public void setDate(int monthInt, int day, int year)
  {
    if (dateOK(monthInt, day, year))
    {
      this.month = monthString(monthInt);
      this.day = day;
      this.year = year;
    } else
    {
      System.out.println("Fatal Error");
      System.exit(0);
    }
  }

  /**
   * Sets a date based on month, day, and year.
   *
   * @param monthString Name of month
   * @param day numeric value of day
   * @param year numeric value of year
   */
  public void setDate(String monthString, int day, int year)
  {
    if (dateOK(monthString, day, year))
    {
      this.month = monthString;
      this.day = day;
      this.year = year;
    } else
    {
      System.out.println("Fatal Error");
      System.exit(0);
    }
  }

  /**
   * Sets a date based on year
   *
   * @param year numeric value of year
   */
  public void setDate(int year)
  {
    setDate(1, 1, year);
  }

  /**
   * Sets a new year for a date.
   *
   * @param year numeric value of year
   */
  public void setYear(int year)
  {
    if ((year < 1000) || (year > 9999))
    {
      System.out.println("Fatal Error");
      System.exit(0);
    } else
    {
      this.year = year;
    }
  }

  /**
   * Sets a new month number for a date.
   *
   * @param monthNumber numeric value of month
   */
  public void setMonth(int monthNumber)
  {
    if ((monthNumber <= 0) || (monthNumber > 12))
    {
      System.out.println("Fatal Error");
      System.exit(0);
    } else
    {
      month = monthString(monthNumber);
    }
  }

  /**
   * Sets the day.
   *
   * @param day numeric value of day
   */
  public void setDay(int day)
  {
    if ((day <= 0) || (day > 31))
    {
      System.out.println("Fatal Error");
      System.exit(0);
    } else
    {
      this.day = day;
    }
  }

  /**
   * Retrieves the month number of a date.
   *
   * @return integer of month number
   */
  public int getMonth()
  {
    if (month.equals("January"))
    {
      return 1;
    } else if (month.equals("February"))
    {
      return 2;
    } else if (month.equalsIgnoreCase("March"))
    {
      return 3;
    } else if (month.equalsIgnoreCase("April"))
    {
      return 4;
    } else if (month.equalsIgnoreCase("May"))
    {
      return 5;
    } else if (month.equals("June"))
    {
      return 6;
    } else if (month.equalsIgnoreCase("July"))
    {
      return 7;
    } else if (month.equalsIgnoreCase("August"))
    {
      return 8;
    } else if (month.equalsIgnoreCase("September"))
    {
      return 9;
    } else if (month.equalsIgnoreCase("October"))
    {
      return 10;
    } else if (month.equals("November"))
    {
      return 11;
    } else if (month.equals("December"))
    {
      return 12;
    } else
    {
      System.out.println("Fatal Error");
      System.exit(0);
      return 0; //Needed to keep the compiler happy
    }
  }

  /**
   *
   * @return the day
   */
  public int getDay()
  {
    return day;
  }

  /**
   *
   * @return the year
   */
  public int getYear()
  {
    return year;
  }

  /**
   * Returns the date details encoded in a String.
   *
   * @return String representation of Date details
   */
  public String toString()
  {
    return (month + " " + day + ", " + year);
  }

  /**
   *
   * @param otherDate Date object used for comparison
   * @return Boolean indicating equality of two Dates
   */
  public boolean equals(Date otherDate)
  {
    if (otherDate == null)
    {
      return false;
    } else
    {
      return ((month.equals(otherDate.month))
              && (day == otherDate.day) && (year == otherDate.year));
    }
  }

  /**
   *
   * @param otherDate Date object used for comparison
   * @return Boolean indicating if a Date precedes another Date
   */
  public boolean precedes(Date otherDate)
  {
    return ((year < otherDate.year)
            || (year == otherDate.year && getMonth() < otherDate.getMonth())
            || (year == otherDate.year && month.equals(otherDate.month)
            && day < otherDate.day));
  }

  /**
   * Read input from the user.
   *
   */
  public void readInput()
  {
    boolean tryAgain = true;
    Scanner keyboard = new Scanner(System.in);
    while (tryAgain)
    {
      System.out.println("Enter month, day, and year.");
      System.out.println("Do not use a comma.");
      String monthInput = keyboard.next();
      int dayInput = keyboard.nextInt();
      int yearInput = keyboard.nextInt();
      if (dateOK(monthInput, dayInput, yearInput))
      {
        setDate(monthInput, dayInput, yearInput);
        tryAgain = false;
      } else
      {
        System.out.println("Illegal date. Reenter input.");
      }
    }
  }

  private boolean dateOK(int monthInt, int dayInt, int yearInt)
  {
    return ((monthInt >= 1) && (monthInt <= 12)
            && (dayInt >= 1) && (dayInt <= 31)
            && (yearInt >= 1000) && (yearInt <= 9999));
  }

  private boolean dateOK(String monthString, int dayInt, int yearInt)
  {
    return (monthOK(monthString)
            && (dayInt >= 1) && (dayInt <= 31)
            && (yearInt >= 1000) && (yearInt <= 9999));
  }

  private boolean monthOK(String month)
  {
    return (month.equals("January") || month.equals("February")
            || month.equals("March") || month.equals("April")
            || month.equals("May") || month.equals("June")
            || month.equals("July") || month.equals("August")
            || month.equals("September") || month.equals("October")
            || month.equals("November") || month.equals("December"));
  }

  private String monthString(int monthNumber)
  {
    switch (monthNumber)
    {
      case 1:
        return "January";
      case 2:
        return "February";
      case 3:
        return "March";
      case 4:
        return "April";
      case 5:
        return "May";
      case 6:
        return "June";
      case 7:
        return "July";
      case 8:
        return "August";
      case 9:
        return "September";
      case 10:
        return "October";
      case 11:
        return "November";
      case 12:
        return "December";
      default:
        System.out.println("Fatal Error");
        System.exit(0);
        return "Error"; //to keep the compiler happy
    }
  }
}
