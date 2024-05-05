package calculator;

import java.util.ArrayList;
import java.util.EmptyStackException;

/**
 * Class for handling the Stack of Entry values. Allows a new Stack to be created and the Entries on
 * it to be manipulated.
 *
 * @author Hayden Amarr
 * 
 */

public class Stack {
  private ArrayList<Entry> entries = new ArrayList<Entry>();
  private int size = 0; // This variable is adjusted by the pop and push methods

  /**
   * Stack is an implementation of Stack (Entry) objects.
   *
   */
  public Stack() {
    super();
  }
  
  /**
   * Adds an new entry to the stack and increments the value containing the size of the list
   * (Stack).
   *
   * @param entry The Entry that is to be pushed onto the top of the Stack.
   * 
   */

  public void push(Entry entry) {
    entries.add(entry);
    size++; // Add one to size of the Stack now new item has been added
  }

  /**
   * Returns the entry at the top of the Stack and does not remove it. If the Stack is empty then
   * return an EmptyStackException.
   *
   * @return The entry at the top of the Stack
   */

  public Entry top() {
    if (size() == 0) {
      throw new EmptyStackException();
    } else {
      return entries.get(size() - 1); // Access the last item in the Stack
    }
  }

  /**
   * Getter for the size field. This is the number of Entries stored in the Stack.
   *
   * @return size The number of items in the Stack.
   */

  public int size() {
    return this.size;
  }

  /**
   * Remove and return the Entry at the top of the Stack. But throw an EmptyStackException if the
   * Stack is Empty.
   *
   * @return Entry Record at the top of the Stack
   */

  public Entry pop() {
    if (size == 0) {
      throw new EmptyStackException();
    } else {
      size--; // Update the size of the Stack
      Entry item = entries.get(size);
      entries.remove(size);
      return item;
    }
  }
}
