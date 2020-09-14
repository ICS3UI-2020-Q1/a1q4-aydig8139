import java.util.Scanner;

/**
 * Calculates the slope when given two coordinates
 * @author Rose
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // creates a Scanner used for input
    Scanner input = new Scanner(System.in);

    // Ask user for first point
    System.out.println("Please enter in the x coordinate of the first point");

    // Declare and initialize a variable for the user to put in a number
    int x1 = input.nextInt();

    // Ask user for second point
    System.out.println("Please enter in the y coordinate of the first point");

    // Declare and initialize a variable for the user to put in a number
    int y1 = input.nextInt();

    // Ask user for third point
    System.out.println("Please enter in the x coordinate of the second point");

    // Declare and initialize a variable for the user to put in a number
    int x2 = input.nextInt();

    // Ask user for third point
    System.out.println("Please enter in the y coordinate of the second point");

    // Declare and initialize a variable for the user to put in a number
    int y2 = input.nextInt();

    // calculate slope
    double slope = (y2 - y1) / (x2 - x1);

    // Tell user the slope

    System.out.println("The slope of your line would be " + slope);
    
  }
}
