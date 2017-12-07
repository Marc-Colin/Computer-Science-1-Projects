package timecalculator;
import java.util.Scanner;
public class TimeCalculator 
{
    public static void main(String[] args) 
    {
     Scanner keyboard = new Scanner(System.in);
     int input;
     int seconds;
     int minutes;
     int hours;
     int days;
    
     System.out.print("Please enter the number of seconds: ");
     input = keyboard.nextInt();
     
     if (input < 0)
     {
      System.out.print("Please enter a positive number of seconds: ");
      input = keyboard.nextInt();   
     }
     if (input < 60)
     {
      System.out.println(input + " seconds");
     }
     if (input < 3600 && input >= 60)
     {
      minutes = (input / 60);
      seconds = (input % 60);
      System.out.println(minutes + " minutes, " + seconds + " seconds");
     }
     if (input < 86400 && input >= 3600)
     {
      hours = (input / 3600);
      input = (input % 3600);
      minutes = (input / 60);
      seconds = (input % 60);
      System.out.println(hours + " hours, " + minutes + " minutes, " + seconds + " seconds");
     }
     if (input >= 86400)
     {
      days = (input / 86400);
      input = (input % 86400);
      hours = (input / 3600);
      input = (input % 3600);
      minutes = (input / 60);
      seconds = (input % 60);
      System.out.println(days + " days, " + hours + " hours, " + minutes + " minutes, " + seconds + " seconds");
     }
    }   
}
