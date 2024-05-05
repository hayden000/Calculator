package calculator;

/**
 * An interface to abstract / encapsulate the evaluate functions.
 *
 * @author Hayden Amarr
 *
 */
@FunctionalInterface
public interface Calculator {

  /**
   * Define the interface.
   *
   * @param str The calculation as a string
   * @return Interface
   * @throws InvalidExpressionException When the calculation is not logically
   *                                    correct.
   */
  public float evaluate(String str) throws InvalidExpressionException;

}
