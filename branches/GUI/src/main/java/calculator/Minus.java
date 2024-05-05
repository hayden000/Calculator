package calculator;

/** The minus class. 
 *
 * @author Hayden Amarr
 *
 */
public class Minus {
  
  private float arg1;
  private float arg2;
  
  /** Minus operation. 
   *
   * @param arg1 The first operand 
   *
   * @param arg2 The second operand 
   */
  public Minus(float arg1, float arg2) {
    this.arg2 = arg2;
    this.arg1 = arg1;
  }
  
  /** Performs the calculation. 
   *
   * @return Result of the calculation as float 
   */
  public float minus() {
    return arg1 - arg2;
  }
}
