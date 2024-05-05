package calculator;

import java.util.Scanner;
import java.util.function.Consumer;

/**
 * A menu based view.
 *
 * @author Hayden Amarr
 *
 */
public class AsciiView implements ViewInterface {
  Observer model = null;

  private String expression;
  private String answer;
  Observer calculator = null;
  Consumer<OpType> calcType = null;

  /**
   * The constructor for the terminal menu view.
   * 
   */
  public AsciiView() {
    super();
  }

  /**
   * A function to drive the menu from the command-line ASCII view.
   * 
   */
  public void driveMenu() {
    System.out.println("*********************************");
    System.out.println("*********Calculator**************");
    System.out.println("*********************************");
    boolean end = false;
    while (!end) {
      System.out.println("Enter expression or press the enter key to terminate the program:");
      Scanner data = new Scanner(System.in);
      expression = data.nextLine().trim();
      if (expression == null || expression == "") {
        end = true;
        break;
      }
      calculator.update();
      System.out.println("Solution: " + answer);
    }
  }

  @Override
  public void setAnswer(String str) {
    this.answer = str;

  }

  @Override
  public void addTypeObserver(Consumer<OpType> l) {
    calcType = l;

  }

  @Override
  public void addCalcObserver(Observer frunnable) {
    this.calculator = frunnable;

  }

  @Override
  public String getExpression() {
    return expression;
  }
}
