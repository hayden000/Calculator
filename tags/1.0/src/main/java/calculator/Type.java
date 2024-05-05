package calculator;

/**
 * An Enumeration to store the Types of values which can be held in Entry.
 *
 * @author Hayden Amarr
 */

public enum Type { // The different valid types
  /**
   * Regular Expression: /^\d+$/ .
   */
  NUMBER,
  /**
   * {(,),*,+,-,/} .
   */
  SYMBOL,
  /**
   * Regular Expression: (.*?) .
   */
  STRING,
  /**
   * ?.
   */
  INVALID;

  private Type() {
  }
}
