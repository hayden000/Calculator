package calculator;

/**
 * Class to encapsulate infix and postfix classes.
 *
 * @author Hayden Amarr
 *
 */
public class Model {
  private final Calculator standard;
  private final Calculator revPolish;
  private float mem;
  private String answer;

  /**
   * This will be the class that covers the infix calculator and postfix
   * calculator. This is the constructor to instantiate both calculators for use.
   * This also is used for the memory of the calculator.
   */
  public Model() {
    this.revPolish = new RevPolishCalc();
    this.standard = new StandardCalc();
    this.mem = 0;
  }

  /**
   * Get the last answer the calculator has returned.
   *
   * @return mem The last result as a float
   */
  public float getMemory() {
    return this.mem;
  }

  /**
   * String of the value stored in the calculator.
   *
   * @return string representation of memory
   */
  public String toString(float mem) {
    return String.valueOf(mem);
  }

  /**
   * The top method which calls the relevant evaluate method.
   *
   * @param expr  The String to be evaluated
   *
   * @param infix Is this an infix expression as Boolean
   *
   * @return the result of the calculation as a float
   *
   * @throws InvalidExpressionException If the calculation is invalid throw this
   *                                    exception and the error message
   */
  public final float evaluate(String expr, boolean infix) throws InvalidExpressionException {
    float result = 0;
    if (!infix) {
      result = this.revPolish.evaluate(expr);
      mem = result;
      return result;
    }
    result = this.standard.evaluate(expr);
    mem = result;
    return result;
  }

  /**
   * Returns if the calculation is in Polish.
   *
   * @param input The String representation of the calculation
   * 
   * @return False if Polish, true when Infix
   */
  public Boolean isPolish(String input) {
    if (input == null || input == "") {
      return false;
    }
    return !(Character.isDigit(input.charAt(input.length() - 1)) 
        || input.charAt(input.length() - 1) == ')');
  }

  /**
   * Returns the type of calculation as an enum takes the input String.
   *
   * @param input The calculation as a string.
   *
   * @return Enum as the type of calculation
   */
  public OpType calcType(String input) {
    if (isPolish(input)) {
      return OpType.REVERSE_POLISH;
    }
    return OpType.INFIX;
  }

  /**
   * Getter for the answer of the calculation.
   *
   * @return answer The result of the calculation as a String
   */
  public String getValue() {
    return answer;
  }
}
