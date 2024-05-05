package calculator;

import static org.junit.jupiter.api.Assertions.*;
import java.util.EmptyStackException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class StrStackTest {
  private StrStack testStack;
  private Entry testEntry;

  @BeforeEach
  void setUp() throws Exception {
    testStack = new StrStack();
  }

  // Test 1
  // Test that a new and empty Stack can be created
  @Test
  void testIsEmptyStack() {
    assertTrue(testStack.isEmpty(), "Test Empty stack is created");
  }

  // Test 2
  // Test that items can be pushed to the Stack
  @Test
  void testIsNotEmpty() {
    assertTrue(testStack.isEmpty(), "Test items have been added to stack and now is not empty");
    for (int i = 0; i <= 100; i++) {
      testStack.push("test");
    }
    assertFalse(testStack.isEmpty(), "Test items have been added to stack and now is not empty");
  }

  @Test
  // Test 3
  // Test that the pop function removes items and returns them
  void testNumStackPop() {
    assertTrue(testStack.isEmpty(), "Stack will now be empty");
    for (int i = 0; i <= 10; i++) {
      testStack.push("Test");

    }
    assertFalse(testStack.isEmpty(), "Stack will not be empty");
    for (int i = 0; i <= 10; i++) {
      testStack.pop();
    }
    assertTrue(testStack.isEmpty(), "Stack will now be empty again");
  }

  // Test 4
  // Test for an empty stack
  @Test
  void testEmptyNumStack() throws EmptyStackException {
    assertThrows(EmptyStackException.class, () -> testStack.pop(), "Test EmptyStackException with top method");
  }

}
