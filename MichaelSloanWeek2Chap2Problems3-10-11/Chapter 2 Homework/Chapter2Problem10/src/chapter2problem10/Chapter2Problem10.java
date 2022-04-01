/*
 * IT-2650 Java Programming, Spring 2022
 * Instructor: Martin P. Walsh
 * Student Name: Michael Sloan
 * Homework Assignment: Chap 2 - Problem 10
 * Purpose of Assignment: Create an application which outputs a bill based on 3 items.
 */
package chapter2problem10;

import java.util.Scanner;
import java.text.NumberFormat;

public class Chapter2Problem10
{
  public static void main(String[] args)
  {
    System.out.println("IT-2650 Java Programming");
    System.out.println("Student Name: Michael Sloan");
    System.out.println("Homework Assignment: Chapter 2, Problem 10");
    System.out.println("_________________________________");
    System.out.println("");

    Scanner keyboard = new Scanner(System.in);
    NumberFormat currency = NumberFormat.getCurrencyInstance();
    
    final double SALES_TAX = 0.0625;
        
    System.out.println("Name of item 1:");
    String item1Name = keyboard.nextLine();
    System.out.println("Quantity of item 1:");
    int item1Quantity = keyboard.nextInt();
    System.out.println("Price of item 1:");
    double item1Price = keyboard.nextDouble();
    keyboard.nextLine();
    
    System.out.println("Name of item 2:");
    String item2Name = keyboard.nextLine();
    System.out.println("Quantity of item 2:");
    int item2Quantity = keyboard.nextInt();
    System.out.println("Price of item 2:");
    double item2Price = keyboard.nextDouble();
    keyboard.nextLine();
    
    System.out.println("Name of item 3:");
    String item3Name = keyboard.nextLine();
    System.out.println("Quantity of item 3:");
    int item3Quantity = keyboard.nextInt();
    System.out.println("Price of item 3:");
    double item3Price = keyboard.nextDouble();
    keyboard.nextLine();
    
    double item1Total = item1Quantity * item1Price;
    double item2Total = item2Quantity * item2Price;
    double item3Total = item3Quantity * item3Price;
    double subTotal = item1Total + item2Total + item3Total;
    double calculatedTax = SALES_TAX * subTotal;
    double total = subTotal + calculatedTax;
        
    System.out.println("------------- Invoice ----------------");
    System.out.printf("%-30s%-10s%10s%10s %n", "Item", "Quantity", "Price", "Total");
    System.out.printf("%-30s%-10s%10s%10s %n", item1Name, item1Quantity, currency.format(item1Price), currency.format(item1Total));
    System.out.printf("%-30s%-10s%10s%10s %n", item2Name, item2Quantity, currency.format(item2Price), currency.format(item2Total));
    System.out.printf("%-30s%-10s%10s%10s %n%n", item3Name, item3Quantity, currency.format(item3Price), currency.format(item3Total));
    
    System.out.printf("%-50s%10s %n", "SubTotal", currency.format(subTotal));
    System.out.printf("%-50s%10s %n", "6.25 Sales Tax", currency.format(calculatedTax));
    System.out.printf("%-50s%10s %n", "Total", currency.format(total));
  }
  
}
