package mileage;
import java.util.Scanner;
public class Mileage 
{
    public static void main(String[] args) 
    {
      Scanner keyboard = new Scanner(System.in);
      double milesDriven;
      double gasUsed;
      double Mileage;
      
      System.out.println("This program will calculate your miles per gallon.");
      System.out.print("Please enter the miles you have driven: ");
      milesDriven = keyboard.nextDouble();
              
      while (milesDriven == 0 || milesDriven < 0)
      {
         System.out.println("The value '0' is invalid");
         System.out.print("Please enter the miles you have driven: ");
         milesDriven = keyboard.nextDouble();
      }
      System.out.print("Please enter the amount in gallons of gas you have used: ");
      gasUsed = keyboard.nextDouble();
      while (gasUsed == 0 || gasUsed < 0)
      {
         System.out.println("The value '0' is invalid");
         System.out.print("Please enter the amount in gallons of gas you have used: ");
         gasUsed = keyboard.nextDouble();
      }
      Mileage = (milesDriven / gasUsed);
      System.out.println("Your milage is: " + Mileage);
    }  
}
