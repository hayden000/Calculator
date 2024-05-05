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
  NUMBER("NUMBER"),
  /**
   * {(,),*,+,-,/} .
   */
  SYMBOL("SYMBOL"),
  /**
   * Regular Expression: (.*?) .
   */
  STRING("STRING"),
  /**
   * ?.
   */
  INVALID("INVALID");

  private Type(final String name) {
    
  }
}
