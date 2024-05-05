package calculator;

import java.util.Scanner;

/**
 * A driver class for allowing the client to test the reverse Polish calculator.
 *
 * @author Hayden Amarr
 *
 */
public class DriverMainReversePolish {
  private static RevPolishCalc polish = new RevPolishCalc();

  /**
   * Constructor.
   * 
   */
  public DriverMainReversePolish() {

  }

  /**
   * Gets the calculation from the user input and returns it. Uses a scanner.
   *
   * @return String (wrapper class) calculation
   */
  public static String read() {
    System.out.println("Enter reverse Polish Calculation:");
    Scanner scan = new Scanner(System.in);
    String calculation = "";
    calculation += scan.nextLine(); // Needs to read including spaces
    scan.close();
    return calculation;
  }

  /**
   * Returns the result of the calculation.
   *
   * @param f The answer
   */
  public static void output(float f) {
    System.out.println("The result of the calculation is: " + f);
  }

  /**The main class to run the program to test the reverse Polish calculator. 
   *
   * @param args Command Line arguments
   *
   * @throws InvalidExpressionException Invalid calculation
   */
  public static void main(String[] args) throws InvalidExpressionException {
    output(polish.evaluate(read()));
  }

}
