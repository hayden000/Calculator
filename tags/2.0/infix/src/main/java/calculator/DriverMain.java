
package calculator;

import java.util.Scanner;

/**
 * A driver class for allowing the client to test the reverse Polish calculator.
 *
 * @author Hayden Amarr
 *
 */
public class DriverMain {
  private static RevPolishCalc polish = new RevPolishCalc();
  private static StandardCalc calc = new StandardCalc();

  /**
   * Constructor.
   * 
   */
  public DriverMain() {

  }

  /**
   * Gets the calculation from the user input and returns it. Uses a scanner.
   *
   * @return String (wrapper class) calculation
   */
  public static String read(Scanner scan) {
    System.out.println("Enter expression Calculation:");
    //Scanner scan = new Scanner(System.in);
    String calculation = scan.nextLine(); // Needs to read including spaces
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
    System.out.println("Test for reverse polish notation");
    Scanner scan = new Scanner(System.in);
    output(polish.evaluate(read(scan)));
    System.out.println("Test for infix notation");
    output(calc.evaluate(read(scan)));
    scan.close();
  }

}
