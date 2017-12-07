package quadratic.formula;
import java.util.Scanner;
import java.lang.*;
public class QuadraticFormula
{
    public static void main(String[] args) 
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
    
}
