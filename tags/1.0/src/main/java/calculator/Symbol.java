package calculator;

/**
 * An Enumeration use to hold the different Symbols used in the calculator.
 *
 * @author Hayden Amarr
 */

public enum Symbol { // List of all valid Symbols in a calculator
  /**
   * The left Bracket operand.
   */
  LEFT_BRACKET("("),
  /**
   * The right Bracket operand.
   */
  RIGHT_BRACKET(")"),
  /**
   * The times operator.
   */
  TIMES("*"),
  /**
   * The divide operator.
   */
  DIVIDE("/"),
  /**
   * The plus operator.
   */
  PLUS("+"),
  /**
   * The minus operator.
   */
  MINUS("-"),
  /**
   * The negative number operator.
   */
  SMALLMINUS("~"),
  /**
   * The fraction operator.
   */
  SMALLDIVIDE("`"),
  /**
   * Not an accepted operation.
   */
  INVALID("?");

  String str;

  /**
   * Constructor for Symbol Enum and sets string field.
   *
   * @param string The actual Symbol itself.
   */
  private Symbol(String string) {
    this.str = string;
  }

  /**
   * Converts the Symbol to a string and returns it.
   */
  public String toString() {
    return str;
  }
}
