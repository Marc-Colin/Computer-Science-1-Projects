package scientificcalculator;
import java.util.Scanner;


public class ScientificCalculator
{
    public static void main(String[] args)
    {
     int choice;
     double answer = 0;
     char repeat = 'Y';
     Scanner keyboard = new Scanner(System.in);
     
     while (repeat == 'Y' || repeat == 'y')
     {
     choice = CalculatorMenu();
     
     while (choice < 1 && choice > 10)
     {
      System.out.println("This is an invalid choice.");
      choice = CalculatorMenu();  
     }
     
     switch (choice)
     {
         case 1:
             answer = Addition();
             break;
         case 2:
             answer = Subtraction();
             break;
         case 3:
             answer = Multiplication();
             break;
         case 4:
             answer = Division();
             break;
         case 5:
             answer = RaisePower();
             break;
         case 6:
             answer = SquareRoot();
             break;
         case 7:
             QuadraticFormula();
             break;
         case 8:
             answer = Sine();
             break;
         case 9:
             answer = Cosine();
             break;
         case 10:
             answer = Tangent();
             break;
         default:
     }
     
     System.out.println("The answer is " + answer);
     System.out.print("Would you like to preform another operation? Y or N: ");
     String input = keyboard.nextLine();
     repeat = input.charAt(0);
     System.out.println(repeat);
     while (repeat != 'Y' && repeat != 'y' && repeat != 'N' && repeat != 'n')
     {
      System.out.println("This is an invalid input.");
      System.out.print("Would you like to preform another operation? Y or N: ");
      input = keyboard.nextLine();
      repeat = input.charAt(0);  
     }
   
     }
    } 
    
    public static int CalculatorMenu ()
    {
     Scanner keyboard = new Scanner(System.in);
     int choice;
     System.out.println("1. Addition");
     System.out.println("2. Subtraction");
     System.out.println("3. Multiplication");
     System.out.println("4. Division");
     System.out.println("5. Raise a number to a power");
     System.out.println("6. Square root");
     System.out.println("7. Quadratic Formula");
     System.out.println("8. Sine of an angle");
     System.out.println("9. Cosine of an angle");
     System.out.println("10. Tangent of an angle");
     System.out.print("Enter the number of the operation you would like to do: ");
     choice = keyboard.nextInt();
     return (choice);
    }
    
    public static double Addition ()
    {
     Scanner keyboard = new Scanner(System.in);
     double num1;
     double num2;
     double answer;
     System.out.print("Please enter the first number you would like to add: ");
     num1 = keyboard.nextDouble();
     System.out.print("Please enter the second number you would like to add: ");
     num2 = keyboard.nextDouble();
     answer = num1 + num2;
     return (answer);
    }
    
    public static double Subtraction ()
    {
     Scanner keyboard = new Scanner(System.in);
     double num1;
     double num2;
     double answer;
     System.out.print("Please enter the number you would like to subtract from: ");
     num1 = keyboard.nextDouble();
     System.out.print("Please enter the number you would like to subtract: ");
     num2 = keyboard.nextDouble();
     answer = num1 - num2;
     return (answer);
    }
    
    public static double Multiplication ()
    {
     Scanner keyboard = new Scanner(System.in);
     double num1;
     double num2;
     double answer;
     System.out.print("Please enter the first number you would like to multiply: ");
     num1 = keyboard.nextDouble();
     System.out.print("Please enter the second number you would like to multiply: ");
     num2 = keyboard.nextDouble();
     answer = num1 * num2;
     return (answer);
    }
    
    public static double Division ()
    {
     Scanner keyboard = new Scanner(System.in);
     double num1;
     double num2;
     double answer;
     System.out.print("Please enter the number you would like to divide: ");
     num1 = keyboard.nextDouble();
     System.out.print("Please enter the number you would like to divide by: ");
     num2 = keyboard.nextDouble();
     answer = num1 / num2;
     return (answer);
    }
    
    public static double RaisePower()
    {
     Scanner keyboard = new Scanner(System.in);
     double num1;
     double num2;
     double answer;
     System.out.print("Please enter the base number: ");
     num1 = keyboard.nextDouble();
     System.out.print("Please enter the exponent: ");
     num2 = keyboard.nextDouble();
     answer = Math.pow(num1, num2);
     return (answer);
    }
    
    public static double SquareRoot()
    {
     Scanner keyboard = new Scanner(System.in);
     double num1;
     double answer;
     System.out.print("Please enter the number you want the square root of: ");
     num1 = keyboard.nextDouble();
     answer = Math.sqrt(num1);
     return(answer);
    }
    
    public static void QuadraticFormula()
    {
       double a;
       double b;
       double c;
       double posX;
       double negX;
       Scanner keyboard = new Scanner(System.in);
       
       System.out.print("Enter the value for 'a': ");
       a = keyboard.nextDouble();
       System.out.print("Enter the value for 'b': ");
       b = keyboard.nextDouble();
       System.out.print("Enter the value for 'c': ");
       c = keyboard.nextDouble();
       
       posX = ((-b)+ Math.sqrt((b * b)-(4 * a * c))) / (2 * a);
       negX = ((-b)- Math.sqrt((b * b)-(4 * a * c))) / (2 * a);
       
       System.out.println("The value for 'x' is " + posX + ", " + negX);
    }
    
    public static double Sine()
    {
     Scanner keyboard = new Scanner(System.in);
     double num1;
     double num2;
     double answer;
     System.out.print("Please enter the length of the side opposite the angle: ");
     num1 = keyboard.nextDouble();
     System.out.print("Please enter the length of the hypotonuse: ");
     num2 = keyboard.nextDouble();
     answer = num1 / num2;
     return (answer);
    }
    
    public static double Cosine()
    {
     Scanner keyboard = new Scanner(System.in);
     double num1;
     double num2;
     double answer;
     System.out.print("Please enter the length of the side adjacent the angle: ");
     num1 = keyboard.nextDouble();
     System.out.print("Please enter the length of the hypotonuse: ");
     num2 = keyboard.nextDouble();
     answer = num1 / num2;
     return (answer);
    }
    
    public static double Tangent()
    {
     Scanner keyboard = new Scanner(System.in);
     double num1;
     double num2;
     double answer;
     System.out.print("Please enter the length of the side opposite the angle: ");
     num1 = keyboard.nextDouble();
     System.out.print("Please enter the length of the side adjacent the angle: ");
     num2 = keyboard.nextDouble();
     answer = num1 / num2;
     return (answer);
    }
}
