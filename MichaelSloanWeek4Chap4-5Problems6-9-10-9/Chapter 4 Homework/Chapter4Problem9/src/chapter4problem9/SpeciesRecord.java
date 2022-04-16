package chapter4problem9;

import java.text.DecimalFormat;

/**
 *
 * @author Michael Sloan
 */
public final class SpeciesRecord
{

  DecimalFormat percent = new DecimalFormat("#0.00%");

  private String name = "";
  private long population = 0;
  private double growthRate = 0;

  public SpeciesRecord()
  {
    System.out.println("Record is: " + this);
  }

  public SpeciesRecord(String name)
  {
    this.name = name;
    System.out.println("Record is: " + this);
  }

  public SpeciesRecord(String name, int population)
  {
    this.name = name;
    this.population = population;
    System.out.println("Record is: " + this);
  }

  public SpeciesRecord(String name, int population, double growthRate)
  {
    this.name = new String(name);
    this.population = population;
    this.growthRate = growthRate;
    System.out.println("Record is: " + this);
  }
  
  public SpeciesRecord(SpeciesRecord record)
  {
    name = record.name;
    population = record.population;
    growthRate = record.growthRate;
    System.out.println("Duplicate record is: " + this);
  }

  public String getName()
  {
    return name;
  }

  public void setName(String name)
  {
    System.out.println("Setting name.");
    this.name = name;
    System.out.println("Record is now: " + this);
  }

  public long getPopulation()
  {
    return population;
  }

  public void setPopulation(long population)
  {
    System.out.println("Setting population.");
    this.population = population;
    System.out.println("Record is now: " + this);
  }

  public String getGrowthRate()
  {
    return percent.format(growthRate);
  }

  public void setGrowthRate(double growthRate)
  {
    System.out.println("Setting growth rate.");
    this.growthRate = growthRate;
    System.out.println("Record is now: " + this);
  }

  public boolean isEndangered()
  {
    return growthRate < 0;
  }

  @Override
  public String toString()
  {
    return ("Name: " + name + ", current population: " + population + ", growth rate: " + percent.format(growthRate));
  }

  public boolean equals(SpeciesRecord record)
  {
    return (name.equals(record.name))
            && (population == record.population)
            && (growthRate == record.growthRate);
  }
}
