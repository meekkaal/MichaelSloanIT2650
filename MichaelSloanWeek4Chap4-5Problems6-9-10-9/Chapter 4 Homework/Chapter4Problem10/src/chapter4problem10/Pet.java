package chapter4problem10;

import java.text.DecimalFormat;

/**
 *
 * @author Michael Sloan
 */
public class Pet
{
  
  DecimalFormat dose = new DecimalFormat("0.0000");

  private String name;
  private int age;//in years
  private double weight;//in pounds
  private String animalType;//dog or cat

  @Override
  public String toString()
  {
    return ("Type: " + animalType + " Name: " + name + " Age: " + age
            + " years" + "\nWeight: " + weight + " pounds"
            + "\nDose of carprofen: " + dose.format(carprofen())
            + "\nDose of acepromazine: " + dose.format(acepromazine()));
  }

  public Pet(String initialName, int initialAge,
          double initialWeight)
  {
    name = initialName;
    if ((initialAge < 0) || (initialWeight < 0))
    {
      System.out.println("Error: Negative age or weight.");
      System.exit(0);
    } else
    {
      age = initialAge;
      weight = initialWeight;
    }
  }

  public void set(String newName, int newAge, double newWeight, String newType)
  {
    name = newName;
    if ((newAge < 0) || (newWeight < 0))
    {
      System.out.println("Error: Negative age or weight.");
      System.exit(0);
    } else
    {
      age = newAge;
      weight = newWeight;
    }

    if (!(newType.toUpperCase().equalsIgnoreCase("cat") || newType.toUpperCase().equalsIgnoreCase("dog")))
    {
      System.out.println("Error: Pet type must be dog or cat.");
      System.exit(0);
    } else
    {
      animalType = newType;
    }
  }

  public Pet(String initialName)
  {
    name = initialName;
    age = 0;
    weight = 0;
    animalType = "No type yet.";
  }

  public void setName(String newName)
  {
    name = newName;
  }

  public Pet(int initialAge)
  {
    name = "No name yet.";
    animalType = "No type yet.";
    weight = 0;
    if (initialAge < 0)
    {
      System.out.println("Error: Negative age.");
      System.exit(0);
    } else
    {
      age = initialAge;
    }
  }

  public void setAge(int newAge)
  {
    if (newAge < 0)
    {
      System.out.println("Error: Negative age.");
      System.exit(0);
    } else
    {
      age = newAge;
    }
  }

  public Pet(double initialWeight)
  {
    name = "No name yet";
    animalType = "No type yet.";
    age = 0;
    if (initialWeight < 0)
    {
      System.out.println("Error: Negative weight.");
      System.exit(0);
    } else
    {
      weight = initialWeight;
    }
  }

  public void setWeight(double newWeight)
  {
    if (newWeight < 0)
    {
      System.out.println("Error: Negative weight.");
      System.exit(0);
    } else
    {
      weight = newWeight;
    }
  }

  public Pet()
  {
    name = "No name yet.";
    age = 0;
    weight = 0;
    animalType = "No type yet.";
  }

  public String getName()
  {
    return name;
  }

  public int getAge()
  {
    return age;
  }

  public double getWeight()
  {
    return weight;
  }

  public double acepromazine()
  {
    if (animalType.equalsIgnoreCase("dog"))
    {
      return (weight / 2.2) * (.03 / 10);
    } else if (animalType.equalsIgnoreCase("cat"))
    {
      return (weight / 2.2) * (.002 / 10);
    } else
    {
      return 0;
    }
  }

  public double carprofen()
  {
    if (animalType.equalsIgnoreCase("dog"))
    {
      return (weight / 2.2) * (.5 / 12);
    } else if (animalType.equalsIgnoreCase("cat"))
    {
      return (weight / 2.2) * (.25 / 12);
    } else
    {
      return 0;
    }
  }

}
