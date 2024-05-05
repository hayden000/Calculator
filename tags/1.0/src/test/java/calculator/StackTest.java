package calculator;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import java.util.EmptyStackException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class StackTest {
  private Stack testStack;

  @BeforeEach
  void setup() {
    Entry entryFloat = new Entry(" ");
    Stack testStack = new Stack();
  }

  // Test 1
  // Test to see if the size function works by creating blank stack and testing if
  // the length is 0
  @Test
  void testEmptySize() {
    testStack = new Stack();
    assertEquals(testStack.size(), 0, "Test if a stack is created");
  }

  // Test 2
  // Test if an item can be pushed onto the stack and test that the size has
  // increased
  @Test
  void testPush() {
    testStack = new Stack();
    Entry test1 = new Entry("test");
    testStack.push(test1);
    assertEquals(testStack.size(), 1, "Test the push function");
    assertEquals(testStack.top(), test1, "Test the required value is returned");
  }

  // Test 3
  // Test that the size method returns the expected value
  @Test
  void testSize() {
    testStack = new Stack();
    Entry test1 = new Entry("test");
    for (int i = 0; i < 1000; i++) {
      testStack.push(test1);
    }
    for (int i = 0; i < 500; i++) {
      testStack.pop();
    }
    assertEquals(testStack.size(), 500, "Test if a Size is correct");
  }

  // Test 4
  // Test to ensure that you can't pop from an empty stack
  @Test
  void testEmptyPop() {
    Stack testStack = new Stack();
    assertThrows(EmptyStackException.class, () -> testStack.pop(), "Do not pop from empty stack");
  }

  // Test 5
  // Test pop from a stack
  @Test
  void testPop() {
    Stack testStack = new Stack();
    Entry test1 = new Entry("test1");
    Entry test2 = new Entry("test2");
    testStack.push(test1);
    testStack.push(test2);
    testStack.pop();
    assertEquals(testStack.size(), 1, "Test the pop function");
  }

  // Test 6
  // Test the top method if the Stack is Empty
  @Test
  void testEmptyTop() throws EmptyStackException {
    Stack testStack = new Stack();
    assertThrows(EmptyStackException.class, () -> testStack.top(), "Test EmptyStackException with top method");
  }

  // Test 7
  // Test if the top function works - create a stack and add and item then test
  // that top returns
  @Test
  void testTop() throws BadTypeException {
    Stack testStack = new Stack();
    Entry test1 = new Entry("test1");
    testStack.push(test1);
    assertEquals(testStack.top().getString(), "test1", "Test the top function");
  }

  // Test 8
  // Test push then pop from same Stack
  @Test
  void pushPop() throws BadTypeException {
    Stack testStack = new Stack();
    Entry test1 = new Entry("test1");
    testStack.push(test1);
    testStack.push(test1);
    testStack.pop();
    assertEquals(testStack.size(), 1, "Test that you can push then pop");
  }
}
