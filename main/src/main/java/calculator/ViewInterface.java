package calculator;

import java.util.function.Consumer;

/**
 * An interface for the view controller.
 *
 * @author Hayden Amarr
 *
 */
public interface ViewInterface {
  /**
   * Setter for the answer.
   *
   * @param str The answer to the calculation as a String
   *
   */
  public void setAnswer(String str);

  /** Generic interface. 
   *
   * @param l Waits for a change of state.
   */
  public void addTypeObserver(Consumer<OpType> l);

  /**
   * The calculator observer.
   *
   * @param frunnable The observer
   */

  public void addCalcObserver(Observer frunnable);

  /**
   * Getter for the sum.
   *
   * @return A string representation of the question
   */
  public String getExpression();

}
