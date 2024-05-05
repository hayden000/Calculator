package calculator;

import java.util.Objects;

/**
 * A class which acts as a blueprint for creating the Entries (that will be put onto the Stack).
 *
 * @author Hayden Amarr
 */

public class Entry {

  // Create fields.

  private String str;
  private float number;
  private Symbol other;
  private Type type; // Type is null not invalid at start

  /**
   * The constructor to create a new Entry record for a string variable.
   *
   * @param str The string that will be put into the Entry record.
   */

  public Entry(String str) {
    this.str = str;
    type = Type.STRING;
  }

  /**
   * The constructor to create a new Entry record for a float variable.
   *
   * @param number The The integer that will be put into the Entry record.
   */

  public Entry(float number) {
    this.number = number;
    type = Type.NUMBER;
  }

  /**
   * The constructor to create a new Entry record containing a Symbol which is an enumerated type.
   * This method also ensures that if an invalid entry is entered then its Type is then set to
   * invalid.
   *
   * @param other The Symbol that will be stored in the entry record which is an enumerated type.
   */

  public Entry(Symbol other) {
    this.other = other;
    if (this.other == Symbol.INVALID) { // Case for an invalid Type Entry
      type = Type.INVALID;
    } else {
      type = Type.SYMBOL;
    }
  }

  /**
   * Getter for the String field.
   *
   * @return str The string which is stored in the Entry field.
   * 
   * 
   * @throws BadTypeException Thrown when the method is called on the wrong field.
   */

  public String getString() throws BadTypeException {
    if (type == Type.STRING) {
      return this.str;
    } else {
      throw new BadTypeException("Wrong type");
    }
  }

  /**
   * Getter for the field which holds a float.
   * 
   *
   * @return number An integer which stored in the Entry field.
   * 
   * 
   * @throws BadTypeException Thrown when the method is called on the wrong field.
   */

  public float getValue() throws BadTypeException {
    if (type == Type.NUMBER) {
      return this.number;
    } else {
      throw new BadTypeException("Wrong type");
    }
  }

  /**
   * Getter for the enum Symbol field in the Entry class.
   *
   * @return other Gets the enum stored in the Entry field.
   * 
   * 
   * @throws BadTypeException Thrown when the method is called on the wrong field.
   */

  public Symbol getSymbol() throws BadTypeException {
    if (type == Type.SYMBOL) {
      return this.other;
    } else {
      throw new BadTypeException("Wrong type");
    }
  }

  /**
   * Entries can be different types and this returns the Type of the Entry.
   *
   * @return type Return the type of Entry which is an enum.
   */

  public Type getType() {
    return this.type;
  }

  /**
   * Return the record Entry in a String format with dividers.
   * 
   */

  @java.lang.Override
  public java.lang.String toString() {
    return "Entry{" + "str='" + str + '\'' + ", number=" + number + ", other=" + other + ", type="
        + type + '}';
  }

  /**
   * Overrides the Equals method to check if the two supplied objects are equal.
   *
   */
  @Override
  public boolean equals(Object object) { // Check if objects are the same object
    if (this == object) {
      return true;
    }
    // Ensures that objects are in the same class (to be equal) and are not null
    if (object == null || getClass() != object.getClass()) {
      return false;
    }
    Entry entry = (Entry) object;
    return java.lang.Float.compare(entry.number, number) == 0
        && java.util.Objects.equals(str, entry.str) && java.util.Objects.equals(other, entry.other)
        && java.util.Objects.equals(type, entry.type);
  }

  /**
   * Overrides hashCode to work with the Entry class. Two entries will have the same hash code IFF.
   * they share the same value / string value and are of the same Type.
   */

  @Override
  public int hashCode() {
    return Objects.hash(super.hashCode(), str, number, other, type);
  }

}
