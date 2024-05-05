package calculator;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class RevPolishCalcTest {

  private RevPolishCalc polish;

  @BeforeEach
  void setUp() {
    polish = new RevPolishCalc();
  }

  // Test 1
  // Test that items can be read from the Stack.
  @Test
  void stackAddTest() throws InvalidExpressionException {
    for (float i = 0; i < 100; i++) {
      assertEquals(i, polish.evaluate(Float.toString(i)), "Test that items can be added to the stack");
    }
  }

  // Test 2
  // Test that the calculator returns the expected result for different
  // calculations and in different formats.
  @Test
  void testEvaluate() throws BadTypeException, InvalidExpressionException {
    assertEquals(-25906.0f, polish.evaluate("34 73 835 - * 2 +"), "Test a calculation");
    assertEquals(-17.24315f, polish.evaluate("0.757 1 34 195 * / 62 8 - 3 / + -"), "Test a calculation using symbols");
  }
}
