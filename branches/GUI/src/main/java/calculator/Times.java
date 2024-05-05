package calculator;

/** The times class.
 *
 * @author Hayden Amarr
 *
 */
public class Times {

  private float arg1;
  private float arg2;

  /** Times constructor. 
   *
   * @param arg1 The first operand 
   * 
   * @param arg2 The second operand
   */
  public Times(float arg1, float arg2) {
    this.arg1 = arg1;
    this.arg2 = arg2;
  }

  /**
   * Addition operation.
   *
   * @return The sum as a float
   */
  public float times() {
    return arg1 * arg2;
  }
}
