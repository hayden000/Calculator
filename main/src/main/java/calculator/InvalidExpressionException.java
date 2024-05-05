package calculator;

/**
 * Throw this exception an invalid equation is entered.
 *
 * @author Hayden Amarr
 */

@SuppressWarnings("serial")
public class InvalidExpressionException extends Exception {
  /**
   * Inherits from the superclass.
   *
   * @param str Error message to be displayed.
   */
  public InvalidExpressionException(String str) {
    super(str);
  }
}