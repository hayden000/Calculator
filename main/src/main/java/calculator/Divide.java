package calculator;

/**
 * The divide class.
 * 
 *
 * @author Hayden Amarr
 *
 */
public class Divide {

  private float arg1;
  private float arg2;

  /**
   * Constructor for divide.
   *
   * @param arg1 First Operand
   *
   * @param arg2 Second Operand
   */
  public Divide(float arg1, float arg2) {
    this.arg1 = arg1;
    this.arg2 = arg2;
  }

  /**
   * Division operation.
   *
   * @return The result of the division calculation
   */
  public float divide() throws InvalidExpressionException {
    if (arg1 == 0) {
      throw new InvalidExpressionException("Zero Division"); // Do not divide by zero 
    }
    return arg2 / arg1;
  }
}
