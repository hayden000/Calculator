package calculator;

/**
 * An enumerated type to store the type of calculation.
 *
 * @author Hayden Amarr
 *
 */
public enum OpType {
  /**
   * A calculation infix notation.
   */
  REVERSE_POLISH("Reverse Polish"),
  /**
   * A standard calculation.
   */
  INFIX("Standard Calculation");

  private OpType(final String type) {

  }
}
