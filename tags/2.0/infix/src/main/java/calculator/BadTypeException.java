package calculator;

/**
 * An exception created to prevent the wrong method type from being called on the wrong Entry type.
 *
 * @author Hayden Amarr
 *
 */

@SuppressWarnings("serial")
public class BadTypeException extends Exception {
  /**
   * This exception is thrown when the wrong method is called on the wrong Entry type.
   *
   * @param str Error message to be displayed.
   */
  public BadTypeException(String str) {
    super(str);
  }
}
