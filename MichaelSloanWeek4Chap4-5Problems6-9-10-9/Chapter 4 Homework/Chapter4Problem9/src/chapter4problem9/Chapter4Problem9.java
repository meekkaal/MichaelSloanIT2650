/*
 * IT-2650 Java Programming, Spring 2022
 * Instructor: Martin P. Walsh
 * Student Name: Michael Sloan
 * Homework Assignment: Chap 4 - Problem 9
 * Purpose of Assignment: Test program for a species record class.
 */
package chapter4problem9;


/**
 *
 * @author Michael Sloan
 */
public class Chapter4Problem9
{

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args)
  {
    System.out.println("IT-2650 Java Programming");
    System.out.println("Student Name: Michael Sloan");
    System.out.println("Homework Assignment: Chapter 4, Problem 9");
    System.out.println("_________________________________");
    System.out.println("");
    
    SpeciesRecord Unicorn = new SpeciesRecord();
    Unicorn.setName("Unicorn");
    
    SpeciesRecord Rabbit = new SpeciesRecord("Rabbit");
    SpeciesRecord Horse = new SpeciesRecord("Horse", 3000);
    Horse.setGrowthRate(.567);
    
    SpeciesRecord Dodo = new SpeciesRecord("Dodo", 0, -.335);
    Dodo.setPopulation(2);
    
    SpeciesRecord GermanShepherd = new SpeciesRecord("German Sheperd", 550, .45);
    
    System.out.println("Getting population of rabbits: " + Rabbit.getPopulation());
    System.out.println("Getting growth rate of German Shepherds: " + GermanShepherd.getGrowthRate());
    System.out.println("Getting name from first record: " + Unicorn.getName());
    
    System.out.println("The Dodo is endangered: " + Dodo.isEndangered());
    System.out.println("The rabbit is endangered: " + Rabbit.isEndangered());
    System.out.println("Horses and Unicorns are the same: " + Horse.equals(Unicorn));
    
    System.out.println("Making an identical object of German Shepherds.");
    SpeciesRecord GermanShepherd2 = new SpeciesRecord(GermanShepherd);
    System.out.println("Duplicate is same as original German Shepherd: " + GermanShepherd2.equals(GermanShepherd));
  }
  
}
