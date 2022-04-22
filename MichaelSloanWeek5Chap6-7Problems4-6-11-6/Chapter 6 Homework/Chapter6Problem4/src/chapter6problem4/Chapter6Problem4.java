/*
 * IT-2650 Java Programming, Spring 2022
 * Instructor: Martin P. Walsh
 * Student Name: Michael Sloan
 * Homework Assignment: Chap 6 - Problem 4
 * Purpose of Assignment: Delete repeats in an array.
 */
package chapter6problem4;

import java.util.Arrays;

/**
 *
 * @author Michael Sloan
 */
public class Chapter6Problem4
{

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args)
  {
    System.out.println("IT-2650 Java Programming");
    System.out.println("Student Name: Michael Sloan");
    System.out.println("Homework Assignment: Chapter 6, Problem 4");
    System.out.println("_________________________________");
    System.out.println("");

    char[] example1 =
    {
      'a', 'b', 'c'
    };
    char[] example2 =
    {
      'a', 'b', 'c', 'c'
    };
    char[] example3 =
    {
      'a', 'a', 'b'
    };
    char[] example4 =
    {
      'b', 'a', 'a'
    };
    char[] example5 =
    {
      'c', 'c', 'c', 'd'
    };
    char[] example6 =
    {
      'a', 'b', 'a', 'c', 'a', 'a', 'c', 'd', 'e', 'e'
    };
    char[] example7 =
    {
      'a', 'a', 'b', 'b', 'b', 'c', 'd'
    };

    System.out.println("Example 1");
    System.out.println("Original array values: " + Arrays.toString(example1));
    System.out.print("Revised array values after repeates removed: ");
    int size = example1.length;
    size = deleteRepeats(example1, size);
    for (int i = 0; i < size; i++)
    {
      System.out.print(example1[i] + ", ");
    }

    System.out.println("\n\nExample 2");
    System.out.println("Original array values: " + Arrays.toString(example2));
    System.out.print("Revised array values after repeates removed: ");
    for (int i = 0; i < deleteRepeats(example2, example2.length); i++)
    {
      System.out.print(example2[i] + ", ");
    }

    System.out.println("\n\nExample 3");
    System.out.println("Original array values: " + Arrays.toString(example3));
    System.out.print("Revised array values after repeates removed: ");
    for (int i = 0; i < deleteRepeats(example3, example3.length); i++)
    {
      System.out.print(example3[i] + ", ");
    }

    System.out.println("\n\nExample 4");
    System.out.println("Original array values: " + Arrays.toString(example4));
    System.out.print("Revised array values after repeates removed: ");
    for (int i = 0; i < deleteRepeats(example4, example4.length); i++)
    {
      System.out.print(example4[i] + ", ");
    }

    System.out.println("\n\nExample 5");
    System.out.println("Original array values: " + Arrays.toString(example5));
    System.out.print("Revised array values after repeates removed: ");
    for (int i = 0; i < deleteRepeats(example5, example5.length); i++)
    {
      System.out.print(example5[i] + ", ");
    }

    System.out.println("\n\nExample 6");
    System.out.println("Original array values: " + Arrays.toString(example6));
    System.out.print("Revised array values after repeates removed: ");
    for (int i = 0; i < deleteRepeats(example6, example6.length); i++)
    {
      System.out.print(example6[i] + ", ");
    }

    System.out.println("\n\nExample 7");
    System.out.println("Original array values: " + Arrays.toString(example7));
    System.out.print("Revised array values after repeates removed: ");
    for (int i = 0; i < deleteRepeats(example7, example7.length); i++)
    {
      System.out.print(example7[i] + ", ");
    }
  }

  private static int deleteRepeats(char[] a, int newSize)
  {

    for (int i = 0; i < newSize; i++)
    {
      boolean duplicate = false;
      for (int j = 0; j < i; j++)
      {
        if (a[i] == a[j])
        {
          duplicate = true;
          break;
        }        
      }
      if (duplicate)
      {
        for (int j = i+1; j < newSize; j++)
        {
          a[j-1] = a[j];
        }
        newSize--;
        i--;
      }
    }

    return newSize;
  }

}
