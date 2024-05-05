package calculator;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class StandardCalcTest {
  private StandardCalc infix;
  @BeforeEach
  void setUp() throws Exception {
    infix = new StandardCalc();
  }
  // Test the evaluate function 
  @Test
  void testEvaluate() throws InvalidExpressionException {
    assertEquals(63.0,infix.evaluate("( 5 * ( 6 + 7 ) ) -2"),"Testing the evaluate method");
  }

}
