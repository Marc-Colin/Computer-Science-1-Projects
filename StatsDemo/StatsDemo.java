package statsdemo;
import java.util.Scanner;
import java.io.*;
// TASK #3 Add the file I/O import statement here

/**
   This class reads numbers from a file, calculates the
   mean and standard deviation, and writes the results
   to a file.
*/

public class StatsDemo
{
   // TASK #3 Add the throws clause
   public static void main(String[] args) throws IOException
   {
      double sum = 0;      // The sum of the numbers
      int count = 0;       // The number of numbers added
      double mean = 0;     // The average of the numbers
      double stdDev = 0;   // The standard deviation
      String line;         // To hold a line from the file
      double difference;   // The value and mean difference

      // Create an object of type Scanner
      Scanner keyboard = new Scanner (System.in);
      String filename;     // The user input file name

      // Prompt the user and read in the file name
      System.out.println("This program calculates " +
                         "statistics on a file " +
                         "containing a series of numbers");
      System.out.print("Enter the file name:  ");
      filename = keyboard.nextLine();

      File file = new File(filename);
      BufferedReader inputFile = new BufferedReader (new FileReader(filename));
      inputFile.mark(1000);
      line = inputFile.readLine();
      while (line != null)
      {
        sum += Double.parseDouble(line);
        count++;
        line = inputFile.readLine();
      }
      mean = sum / count;
      inputFile.reset();
      line = inputFile.readLine();
      while (line != null)
      {
        double input = Double.parseDouble(line);
        difference = (input - mean);
        sum += difference * difference;
        count++;
        line = inputFile.readLine();
      }
      inputFile.close();
      stdDev = sum / count;

      PrintWriter outputFile = new PrintWriter("Results.txt");
      outputFile.println("Mean = " + mean);
      outputFile.println("Standard Deviation = " + stdDev);
      outputFile.close();
   }
}