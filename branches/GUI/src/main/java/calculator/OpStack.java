package calculator;

import java.util.EmptyStackException;

/**
 * A facade to hide details of the Stack implementation for Symbol Enum.
 *
 * @author Hayden Amarr
 * 
 */
public class OpStack {

  private final Stack stack;

  /**
   * Constructor for the OpStack class which declares a new empty Stack.
   */
  public OpStack() {
    this.stack = new Stack();
  }

  /**
   * Returns true if the Stack is empty.
   *
   * @return boolean True when there is an empty Stack.
   */
  public final boolean isEmpty() {
    return 0 == this.stack.size();
  }

  /**
   * Removes and returns the top item of the Stack.
   *
   * @return Symbol Enum
   *
   * @throws EmptyStackException Can not pop from an empty Stack.
   */
  public final Symbol pop() throws EmptyStackException {
    try {
      return this.stack.pop().getSymbol();
    } catch (BadTypeException e) {
      return Symbol.INVALID;
    }
  }

  /**
   * Takes an operation which is a Symbol Enum as an argument and pushes it to the
   * Stack wrapped as an Entry.
   *
   * @param symbol Enum
   */
  public final void push(final Symbol symbol) {
    this.stack.push(new Entry(symbol));
  }
}
