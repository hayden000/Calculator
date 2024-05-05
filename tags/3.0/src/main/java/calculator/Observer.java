package calculator;

/** An interface for the observer to update when there is a change. 
 *
 * @author Hayden Amarr
 *
 */
@FunctionalInterface
public interface Observer {
  /** Tells the observer a change of state has occurred. 
   * 
   */
  public void update();
}
