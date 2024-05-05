package calculator;

/**
 * An interface to abstract / encapsulate the evaluate functions.
 *
 * @author Hayden Amarr
 *
 */
public interface Calculator {

  /**
   * Define the interface.
   *
   * @param str Error message
   * @return Interface
   * @throws InvalidExpressionException When the calculation is not logically
   *                                    correct.
   */
  float evaluate(String str) throws InvalidExpressionException;
}
