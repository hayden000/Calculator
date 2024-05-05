package calculator;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class StandardCalcTest {
  private StandardCalc standardCalculator;

  @BeforeEach
  void setUp() throws Exception {
    standardCalculator = new StandardCalc();
  }

  // Test a simple expression
  @Test
  void testRead() throws InvalidExpressionException {
    assertEquals(0, standardCalculator.evaluate("0"), "Testing that an item can be read");
  }

  // Test a simple expression
  @Test
  void testCalculation() throws InvalidExpressionException {
    assertEquals(12, standardCalculator.evaluate("2 * 6"), "Testing the evaluate method");
  }

  // Testing an expression without brackets
  @Test
  void testLongExpression() throws InvalidExpressionException {
    assertEquals(676.0, standardCalculator.evaluate("52 * 6 + 7"), "Testing the complex evaluate method");
  }

  // Test the evaluate function
  @Test
  void testEvaluate() throws InvalidExpressionException {
    assertEquals(130.0, standardCalculator.evaluate("( 10 * ( 6 + 7 ) )"), "Testing the evaluate method");
  }
}
