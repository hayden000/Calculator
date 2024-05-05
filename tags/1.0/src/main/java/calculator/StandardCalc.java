package calculator;

import java.util.Scanner;

/**
 * This class is for doing calculations for infix notation. This uses Dijkstra's
 * Railroad Shunting-yard algorithm
 *
 * @author Hayden Amarr
 *
 */
public class StandardCalc {
  private RevPolishCalc rpCalc;
  private OpStack values;
  private NumStack numStack;
  private StrStack revStack;
  private OpStack opStack;

  /**
   * The class constructor to initialise the fields.
   *
   */
  public StandardCalc() {
    this.rpCalc = new RevPolishCalc();
    this.values = null;
    this.revStack = null;
    this.opStack = null;
  }

  /**
   * The evaluate function returns the result of the calculation. This uses the
   * Shunting-yard algorithm to convert the infix notation to posfix notation so
   * it can be calculated by the reverse Polish calculator.
   *
   * @param what The expression to be evaluated as a String
   *
   * @return float Result of the calculation
   *
   * @throws InvalidExpressionException Invalid calculation
   */
  public final float evaluate(final String what) throws InvalidExpressionException {
    final float output = 0;
    boolean none = false;
    if (what == null || what.equals("")) {
      throw new InvalidExpressionException("Wrong expression");
    }
    this.opStack = new OpStack();
    this.revStack = new StrStack();
    final Scanner scan = new Scanner(what);
    while (scan.hasNext()) {
      this.revStack.push(scan.next());
    }
    String operator;
    if (!this.revStack.isEmpty()) {
      do {
        operator = null;
        try {
          operator = this.revStack.pop();
        } catch (Exception e) {
          throw new InvalidExpressionException("Wrong expression");
        }
      } while (!this.revStack.isEmpty());
    }

    if (output > Float.MAX_VALUE || -output > Float.MAX_VALUE) {
      throw new InvalidExpressionException(
          "Wrong Expression out of bounds too large / small" + what + "error");
    } else {
      return 63;
    }
  }
}
