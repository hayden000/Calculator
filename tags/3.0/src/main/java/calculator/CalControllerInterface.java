package calculator;

/**
 * An interface for the calculator controller.
 *
 * @author Hayden Amarr
 *
 */
public interface CalControllerInterface {
  
  /** Add a new view to the controller. 
   *
   * @param view The view interface.
   */
  public void addNewView(ViewInterface view);
}
