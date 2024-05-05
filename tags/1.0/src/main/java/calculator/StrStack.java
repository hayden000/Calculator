
package calculator;


import java.util.EmptyStackException;
/** 
 * A facade to hide details of the Stack implementation for strings. 
 *
 * @author Hayden Amarr
 *
 */

public class StrStack {


  private final Stack strStack;

  /** 
   * Constructor for the StrStack class which declares a new empty Stack.
   */
  public StrStack() {
    this.strStack = new Stack();

  }

  /** 
   * Returns true if the Stack is empty. 
   *
   * @return boolean true when Stack is empty 
   */
  public final boolean isEmpty() {
    return 0 == this.strStack.size();
  }

  /** 
   * Pushes a string wrapped in an Entry onto the Stack. 
   *
   * @param str String a wrapper class for a string
   */
  public final void push(final String str) {
    this.strStack.push(new Entry(str));
  }

  /**
   * Removes and returns the item at top of Stack. 
   *
   * @return
   * 
   * @throws EmptyStackException Can not pop from an empty Stack 
   */
  public final String pop() throws EmptyStackException {
    try {
      return this.strStack.pop().getString();
    } catch (BadTypeException e) { //this can never happen
      return "-1";
    }
  }

}
