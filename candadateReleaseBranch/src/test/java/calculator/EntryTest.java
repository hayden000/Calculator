package calculator;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class EntryTest {
  private Stack testStack;
  private Entry entryFloat;
  private Entry entrySymbol;

  @BeforeEach
  public void setup() {
    entryFloat = new Entry(" ");
  }

  // Test 1
  // Test that hash code returns a value
  @Test
  void hashCodeTest() {
    int hash1 = new Entry("test1").hashCode();
    int hash2 = new Entry("test2").hashCode();
    int hash3 = hash1;
    assertNotEquals(hash1, hash2, "Test diffrent hash items");
    assertEquals(hash1, hash3, "Test equal hash items");
    assertNotNull(hash1, "Test hash code is generated");
  }

  // Test 2
  // Test string getter
  @Test
  void testGetString() throws BadTypeException {
    Entry test = new Entry("test");
    assertEquals(test.getString(), "test", "Test getString");
  }

  // Test 3
  // Test getValue function
  @Test
  void testGetValue() throws BadTypeException {
    Entry test1 = new Entry(5);
    assertEquals(test1.getValue(), 5, "Test getValue");
  }

  // Test 4
  // Test getSymbol
  @Test
  void testGetSymbol() throws BadTypeException {
    Entry test1 = new Entry(Symbol.PLUS);
    assertEquals(test1.getSymbol(), Symbol.PLUS, "Test get symbol works");
  }

  // Test 5
  // Test toString method returns the correct data in the expected format
  @Test
  void testToString() {
    Entry test1 = new Entry("test1");
    assertEquals(test1.toString(), "Entry{str='test1', number=0.0, other=null, type=STRING}",
        "Test toString retuns expected output format");
  }

  // Test 6
  // Test that the equals method can appropriately handle null fields
  @Test
  void testNullEquals() {
    Entry test1 = new Entry("test1");
    assertFalse(test1.equals(null), "Test the equals function using null");
  }

  // Test 7
  // Test the equals function with a true return
  @Test
  void equalsTest() {
    Entry test1 = new Entry("test");
    Entry test2 = new Entry("test");
    assertTrue(test1.equals(test1), "An object must be equal to itself");
    assertTrue(test1.equals(test2), "Test two equal items");
  }

  // Test 8
  // Test the equals function with a false return
  @Test
  void notEqualsTest() {
    Entry test1 = new Entry("test");
    Entry test2 = new Entry(0);
    assertFalse(test1.equals(test2), "Test the equals function");
  }

  // Test 9
  // Test the toString method in the Entry enum
  @Test
  void testSymbolToString() throws BadTypeException {
    Symbol test = Symbol.PLUS;
    Entry test2 = new Entry(Symbol.DIVIDE);
    assertEquals(test.toString(), "+", "Tests that Symbol toString prints appropriate Symbol");
    assertEquals(test2.getSymbol().toString(), "/", "Tests toString for Symbol in Entry");
  }
}
