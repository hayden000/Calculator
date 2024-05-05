package calculator;

/**
 * The GUI for the calculator.
 *
 * @author Hayden Amarr
 *
 */
public class GuiView {
  String expression;
  String answer;

  /** The constructor for the GUI view class. 
   *
   * @param expression The calculation to be evaluated as a String. 
   *
   * @param answer The result of the calculation as a String. 
   */
  public GuiView(String expression, String answer) {
    this.expression = expression;
    this.answer = answer;
  }
}
