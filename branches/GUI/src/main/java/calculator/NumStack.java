package calculator;

import java.util.EmptyStackException;

/**
 * A facade to hide details of the Stack implementation for floats. 
 *
 * @author Hayden Amarr 
 * 
 */
public class NumStack {

  /**
   * Create a new stack which will be the numStack. 
   */
  public final Stack numStack;

  /**
   * Constructor for the NumStack class which declares a new empty Stack.
   */
  public NumStack() {
    this.numStack = new Stack();
  }

  /**
   * Removes and returns the top item of the Stack. 
   *
   * @return float
   * 
   * @throws EmptyStackException Can not pop from an empty Stack. 
   */
  public final float pop() throws EmptyStackException {
    try {
      return this.numStack.pop().getValue();
    } catch (BadTypeException e) {
      return -1;
    }
  }

  /**
   * Returns true if the Stack is empty. 
   *
   * @return boolean True when there is an empty Stack. 
   */
  public final boolean isEmpty() {
    return 0 == this.numStack.size(); //Evaluates if stack is empty and returns boolean result 
  }

  /**
   * Takes a float as an argument and pushes it to the Stack wrapped as an Entry.
   *
   * @param item A float
   */
  public final void push(final float item) {
    this.numStack.push(new Entry(item));
  }

}
