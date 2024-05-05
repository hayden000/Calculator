package calculator;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ModelTest {
//  Model model;
  CalcModel model = new CalcModel();

  @BeforeEach
  void setUp() throws Exception {
    CalcModel model = new CalcModel();
  }

  // Test Infix calculator correct
  @Test
  void testCorrectInfix() throws InvalidExpressionException {
    assertEquals(20, model.evaluate("5 * 4", true), "Infix notation correct");
  }

  // Test Polish calculator correct
  @Test
  void testCorrectPolish() throws InvalidExpressionException {
    assertEquals(20, model.evaluate("5 4 *", false), "Polish notation correct");
  }

  // Test Infix calculator incorrect
  @Test
  void testWrongInfix() throws InvalidExpressionException {
    assertThrows(InvalidExpressionException.class, () -> model.evaluate("5 4 *", true), "Infix notation incorrect");
  }

  // Test Polish calculator correct
  @Test
  void testWrongPolish() throws InvalidExpressionException {
    assertThrows(InvalidExpressionException.class, () -> model.evaluate("5 * 4", false), "Polish notation incorrect");
  }

  // Test Memory
  @Test
  void testMemory() throws InvalidExpressionException {
    float ans = model.evaluate("5 4 +", false);
    assertEquals(ans, model.getMemory(), "Test Polish calculator memory");
    assertEquals("9.0", model.toString(ans), "Test string output for Polish");
    assertEquals(ans, 9, "Test Polish returns correct value");
    ans = model.evaluate("5 - 4", true);
    assertEquals(ans, model.getMemory(), "Test Infix calculator memory");
    assertEquals("1.0", model.toString(ans), "Test string output for Infix");
    assertEquals(ans, 1, "Test Infix returns correct value");
  }
}
