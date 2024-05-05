package calculator;

/**
 * The plus class.
 *
 * @author Hayden Amarr
 *
 */
public class Plus {

  private float arg1;
  private float arg2;

  /** The constructor for the plus operand. 
   *
   * @param arg1 The first operand. 
   *
   * @param arg2 The second operand. 
   */
  public Plus(float arg1, float arg2) {
    this.arg1 = arg1;
    this.arg2 = arg2;
  }

  /**
   * Addition operation.
   *
   * @return The sum as a float
   */
  public float plus() {
    return arg1 + arg2;
  }
}
