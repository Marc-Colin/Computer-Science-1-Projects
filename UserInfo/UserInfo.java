package userinfo;
import java.util.Scanner;
public class UserInfo 
{
   public static void main(String[] args)
   {
    String u_name;
    int u_age;
    double u_annualIncome;
    Scanner keyboard = new Scanner(System.in);
    
    System.out.print("Enter your name: ");
    u_name = keyboard.nextLine();
    System.out.print("Enter your age: ");
    u_age = keyboard.nextInt();
    System.out.print("Enter your annual income: ");
    u_annualIncome = keyboard.nextDouble();
    
    System.out.println("Hi, my name is " + u_name + ", my age is " + u_age + " and my income");
    System.out.println("is $" + u_annualIncome + "0 per year");
    System.out.println("Thank you.");
   }
    
}