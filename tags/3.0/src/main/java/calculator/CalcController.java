package calculator;

/**
 * The calculator controller.
 *
 * @author Hayden Amarr
 *
 */
public class CalcController {
  private Model myModel;
  private ViewInterface myView;

  /**
   * Runner for the evaluate function.
   */
  private void handleEvaluate() {
    String userInput = myView.getExpression();
    String answer = null;
    try {
      answer = myModel.evaluate(userInput, !myModel.isPolish(userInput)) + "";
    } catch (InvalidExpressionException e) {
      answer = "ERROR";
    }
    myView.setAnswer(answer);
  }

  /*
   * private void handleReset() { MyModel.reset();
   * MyView.setTotal(MyModel.getValue()); }
   */

  CalcController(Model model, ViewInterface view) {
    myModel = model;
    myView = view;
    view.addCalcObserver(this::handleEvaluate);
    // view.addResetObserver(this::handleReset);
  }
}
