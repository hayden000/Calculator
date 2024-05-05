package calculator;

import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class InvalidExpressionExceptionTest {

  private RevPolishCalc polish;

  @BeforeEach
  void setUp() throws Exception {
    polish = new RevPolishCalc();
  }

  // Test 1
  // Test a null and an empty expression
  @Test
  void InvalidNullExpressionTest() {
    assertThrows(InvalidExpressionException.class, () -> polish.evaluate(""), "An empty String");
    assertThrows(InvalidExpressionException.class, () -> polish.evaluate(null), "A null value");
  }

  // Test 2
  // Test an incorrect formatted calculation
  @Test
  void InvalidCalculationTest() {
    assertThrows(InvalidExpressionException.class, () -> polish.evaluate("+"), "Just a symbol");
    assertThrows(InvalidExpressionException.class, () -> polish.evaluate("2 +"), "Not a calculation");
    assertThrows(InvalidExpressionException.class, () -> polish.evaluate("25+"), "Incompleate expression");
  }

  // Test 3
  // Try a symbol which is invalid
  @Test
  void InvalidSymbol() {
    assertThrows(InvalidExpressionException.class, () -> polish.evaluate("9 % 6"), "Not a valid symbol");
  }

  // Test 4
  // Test an unbalanced expression the wrong number of operands or operators
  @Test
  void UnbalancedExpressionException() {
    assertThrows(InvalidExpressionException.class, () -> polish.evaluate("8 5 + 6"), "Unbalanced expression");
  }

  // Test 5
  // Test an expression which can not be calculated
  @Test
  void DivideZeroError() {
    assertThrows(InvalidExpressionException.class, () -> polish.evaluate("0 0 /"), "Intractable calculation");
  }

  // Test 6
  // Out of bounds exception
  @Test
  void OutOfBounds() throws InvalidExpressionException {
    assertThrows(InvalidExpressionException.class, () -> polish.evaluate("10000000000000000000000000000 1000000000000000000000000 *"), "Number out of bounds");
   
  }

}
