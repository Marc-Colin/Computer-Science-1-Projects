package softwaresales;
import java.util.Scanner;
public class SoftwareSales 
{
    public static void main(String[] args) 
    {
     Scanner keyboard = new Scanner(System.in);
     int quantity;
     double price;
     double discount;
     
     System.out.print("Please enter the quantity of packages you are buying: ");
     quantity = keyboard.nextInt();
     if (quantity < 0)
     {
      System.out.print("Please enter a positive quantity of packages you are buying: ");
      quantity = keyboard.nextInt();   
     }
     if (quantity >= 0 && quantity < 10)
     {
      price = quantity * 99;
      System.out.println("Your total price is $" + price);
     }
     if (quantity >= 10 && quantity < 20)
     {
      price = quantity * 99;
      discount = price * 0.2;
      price = price - discount;
      System.out.println("Your total price is $" + price);
     }
     if (quantity >= 20 && quantity < 50)
     {
      price = quantity * 99;
      discount = price * 0.3;
      price = price - discount;
      System.out.println("Your total price is $" + price);
     }
     if (quantity >= 50 && quantity < 100)
     {
      price = quantity * 99;
      discount = price * 0.4;
      price = price - discount;
      System.out.println("Your total price is $" + price);
     }
     if (quantity >= 100)
     {
      price = quantity * 99;
      discount = price * 0.5;
      price = price - discount;
      System.out.println("Your total price is $" + price);
     }
    }   
}
