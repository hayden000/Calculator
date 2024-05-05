package calculator;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

class BadTypeExceptionTest {

  // Test 1
  // Test invalid type
  @Test
  void InvalidType() throws BadTypeException {
    Entry invalidType = new Entry(Symbol.INVALID);
    assertEquals(invalidType.getType(), Type.INVALID, "Test an invalid type");
  }

  // Test 2
  // Test the BadTypeException works
  @Test
  void testBadTypeException() throws BadTypeException {
    Entry test1 = new Entry("test");
    assertThrows(BadTypeException.class, () -> test1.getValue(), "Test BadTypeException");
  }

  // Test 3
  // Test getter throws the exception
  @Test
  void testGetBadString() throws BadTypeException {
    Entry test2 = new Entry(5);
    assertThrows(BadTypeException.class, () -> test2.getString(), "Test BadTypeException");
  }


  // Test 4
  // Test BadTypeException for String
  @Test
  void BadTypeExceptionString() throws BadTypeException {
    Entry test1 = new Entry(Symbol.INVALID);
    assertThrows(BadTypeException.class, () -> test1.getString(), "Test BadTypeException");
  }

  // Test 5
  // Test try and get a valid type.
  @Test
  void testGetType() throws BadTypeException {
    Entry validType = new Entry(Symbol.DIVIDE);
    assertEquals(validType.getType(), Type.SYMBOL, "Test a valid type");
  }

  // Test 6
  // Test BadTypeException for Symbol
  @Test
  void BadTypeExceptionSymbol() throws BadTypeException {
    Entry test1 = new Entry("test");
    assertThrows(BadTypeException.class, () -> test1.getSymbol(), "Test BadTypeException");
  }
}
