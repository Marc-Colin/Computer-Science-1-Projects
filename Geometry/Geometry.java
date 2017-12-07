package geometry;
import java.util.Scanner;

public class Geometry
{
   public static void main(String[] args)
   {
      int choice;       // The user's choice
      double value = 0; // The method's return value
      char letter;      // The user's Y or N decision
      double radius;    // The radius of the circle
      double length;    // The length of the rectangle
      double width;     // The width of the rectangle
      double height;    // The height of the triangle
      double base;      // The base of the triangle
      double side1;     // The first side of the triangle
      double side2;     // The second side of the triangle
      double side3;     // The third side of the triangle

      Scanner keyboard = new Scanner(System.in);
      do
      {
         printMenu();
         choice = keyboard.nextInt();

         switch(choice)
         {
            case 1:
               System.out.print("Enter the radius of " +
                                "the circle: ");
               radius = keyboard.nextDouble();
               value = circleArea(radius);
               System.out.println("The area of the " +
                                  "circle is " + value);
               break;
            case 2:
               System.out.print("Enter the length of " +
                                "the rectangle: ");
               length = keyboard.nextDouble();
               System.out.print("Enter the width of " +
                                "the rectangle: ");
               width = keyboard.nextDouble();
               value = rectangleArea(length, width);
               System.out.println("The area of the " +
                                  "rectangle is " + value);
               break;
            case 3:
               System.out.print("Enter the height of " +
                                "the triangle: ");
               height = keyboard.nextDouble();
               System.out.print("Enter the base of " +
                                "the triangle: ");
               base = keyboard.nextDouble();
               value = triangleArea(height, base);
               System.out.println("The area of the " +
                                  "triangle is " + value);
               break;
            case 4:
               System.out.print("Enter the radius of " +
                                "the circle: ");
               radius = keyboard.nextDouble();
               value = circleCircumference(radius);
               System.out.println("The circumference " +
                                  "of the circle is " +
                                  value);
               break;
            case 5:
               System.out.print("Enter the length of " +
                                "the rectangle: ");
               length = keyboard.nextDouble();
               System.out.print("Enter the width of " +
                                "the rectangle: ");
               width = keyboard.nextDouble();
               value = rectanglePerimeter(length, width);
               System.out.println("The perimeter of " +
                                  "the rectangle is " +
                                  value);
               break;
            case 6:
               System.out.print("Enter the length of " +
                                "side 1 of the " +
                                "triangle: ");
               side1 = keyboard.nextDouble();
               System.out.print("Enter the length of " +
                                "side 2 of the " +
                                "triangle: ");
               side2 = keyboard.nextDouble();
               System.out.print("Enter the length of " +
                                "side 3 of the " +
                                "triangle: ");
               side3 = keyboard.nextDouble();
               value = trianglePerimeter(side1, side2, side3);
               System.out.println("The perimeter of " +
                                  "the triangle is " +
                                  value);
               break;
            default:
               System.out.println("You did not enter " +
                                  "a valid choice.");
         }
         keyboard.nextLine(); // Consume the new line

         System.out.println("Do you want to exit " +
                            "the program (Y/N)?: ");
         String answer = keyboard.nextLine();
         letter = answer.charAt(0);

      } while(letter != 'Y' && letter != 'y');
   }
   public static void printMenu()
   {
       System.out.println("This is a geometry calculator");
       System.out.println("Choose what you would like to calculate");
       System.out.println("1. Find the area of a circle");
       System.out.println("2. Find the area of a rectangle");
       System.out.println("3. Find the area of a triangle");
       System.out.println("4. Find the cicumference of a circle");
       System.out.println("5. Find the perimeter of a rectangle");
       System.out.println("6. Find the perimeter of a triangle");
       System.out.print("Enter the number of your choice: ");
   }
   public static double circleArea(double radius)
   // calculates the area of a circle
   {
    double value;
    value = Math.PI * (radius * 2);
    return (value);   
   }
   public static double rectangleArea(double length, double width)
   // calculates the area of a rectangle
   {
    double value;
    value = length * width;
    return (value);   
   }
   public static double triangleArea(double hight, double base)
   // calculates the area of a triangle
   {
    double value;
    value = 0.5 * (hight * base);
    return (value);   
   }
   public static double circleCircumference(double radius)
   // calculates the circumference of a circle
   {
    double value;
    value = 2 * (Math.PI * radius);
    return (value);   
   }
   public static double rectanglePerimeter(double length, double width)
   // calculates the perimeter of a rectangle
   {
    double value;
    value = (2 * length) + (2 * width);
    return (value);   
   }
   public static double trianglePerimeter(double side1, double side2, double side3)
   // calculates the perimeter of a triangle
   {
    double value;
    value = side1 + side2 + side3;
    return (value);
   }
}