package pizzaorder;
import java.util.Scanner;  

public class PizzaOrder
{
   public static void main (String[] args)
   {
      Scanner keyboard = new Scanner (System.in);

      String firstName;             
      boolean discount = false;     
      int inches;                   
      char crustType;               
      String crust = "Hand-tossed"; 
      double cost = 12.99;          
      final double TAX_RATE = .08;  
      double tax; 
      double finalPrice;
      char choice;                  
      String input;                 
      String toppings = "Cheese ";  
      int numberOfToppings = 0;    
      System.out.println("Welcome to Mike and " +
                         "Diane's Pizza");
      System.out.print("Enter your first name: ");
      firstName = keyboard.nextLine();
      if(firstName.equalsIgnoreCase("Mike") || firstName.equalsIgnoreCase("Diane"))
      {
       discount = true;   
      }
      System.out.println("Pizza Size (inches)   Cost");
      System.out.println("        10            $10.99");
      System.out.println("        12            $12.99");
      System.out.println("        14            $14.99");
      System.out.println("        16            $16.99");
      System.out.println("What size pizza " +
                         "would you like?");
      System.out.print("10, 12, 14, or 16 " +
                       "(enter the number only): ");
      inches = keyboard.nextInt();
      if(inches == 10)
      {
        cost = 10.99;  
      }
      else if(inches == 12)
      {
        cost = 12.99;  
      }
      else if(inches == 14)
      {
        cost = 14.99;  
      }
      else if(inches == 16)
      {
        cost = 16.99;  
      }
      else if(inches != 10|| inches != 12|| inches != 14|| inches != 16)
      {
        System.out.println("This is not a valid choice. Your pizza will be 12 inches.");
        cost = 12.99; 
      }
      keyboard.nextLine();
      System.out.println("What type of crust " +
                         "do you want? ");
      System.out.print("(H)Hand-tossed, " +
                       "(T) Thin-crust, or " +
                       "(D) Deep-dish " +
                       "(enter H, T, or D): ");
      input = keyboard.nextLine();
      crustType = input.charAt(0);
      switch(crustType)
      {
          case 'h':
          case 'H':
              crust = "Hand-tossed";
              break;
          case 't':
          case 'T':
              crust = "Thin-crust";
              break;
          case 'd':
          case 'D':
              crust = "Deep-dish";
              break;
          default:
              System.out.println("This is not a valid choice. Your pizza will be Hand-tossed.");
      }
      System.out.println("All pizzas come with cheese.");
      System.out.println("Additional toppings are " +
                         "$1.25 each, choose from:");
      System.out.println("Pepperoni, Sausage, " +
                         "Onion, Mushroom");

      System.out.print("Do you want Pepperoni? (Y/N): ");
      input = keyboard.nextLine();
      choice = input.charAt(0);
      if (choice == 'Y' || choice == 'y')
      {
         numberOfToppings += 1;
         toppings = toppings + "Pepperoni ";
      }
      System.out.print("Do you want Sausage? (Y/N): ");
      input = keyboard.nextLine();
      choice = input.charAt(0);
      if (choice == 'Y' || choice == 'y')
      {
         numberOfToppings += 1;
         toppings = toppings + "Sausage ";
      }
      System.out.print("Do you want Onion? (Y/N): ");
      input = keyboard.nextLine();
      choice = input.charAt(0);
      if (choice == 'Y' || choice == 'y')
      {
         numberOfToppings += 1;
         toppings = toppings + "Onion ";
      }
      System.out.print("Do you want Mushroom? (Y/N): ");
      input = keyboard.nextLine();
      choice = input.charAt(0);
      if (choice == 'Y' || choice == 'y')
      {
         numberOfToppings += 1;
         toppings = toppings + "Mushroom ";
      }

      cost = cost + (1.25 * numberOfToppings);

      System.out.println();
      System.out.println("Your order is as follows: ");
      System.out.println(inches + " inch pizza");
      System.out.println(crust + " crust");
      System.out.println(toppings);

      
      if (discount == true)
      {
         cost = cost - 2; 
      }

      cost = Math.round(cost * 100.0)/100.0;
      System.out.println("The cost of your order is: $" + cost);
      tax = cost * TAX_RATE;
      tax = Math.round(tax * 100.0)/100.0;
      finalPrice = (tax + cost);
      finalPrice = Math.round(finalPrice * 100.0)/100.0;
      System.out.println("The tax is: $" + tax);
      System.out.println("The total due is: $" + finalPrice);

      System.out.println("Your order will be ready for pickup in 30 minutes.");
   }
}