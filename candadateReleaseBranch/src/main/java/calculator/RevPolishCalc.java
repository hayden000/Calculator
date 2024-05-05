package calculator;

import java.util.EmptyStackException;
import java.util.Scanner;

/**
 * The reverse Polish notation performs calculations using postfix notation.
 *
 * @author Hayden Amarr
 *
 */
public class RevPolishCalc implements Calculator {

  private NumStack values;

  /**
   * Create a new number Stack.
   */
  public RevPolishCalc() {
    this.values = new NumStack();

  }

  /**
   * Evaluate reads the passed String and performs the calculations using reverse
   * Polish notation to evaluate the String.
   *
   * @param what The String to be evaluated.
   *
   * @return float output The result of the calculation.
   *
   * @throws InvalidExpressionException An expression has a mistake so it cannot
   *                                    be calculated.
   */
  @Override
  public float evaluate(String what) throws InvalidExpressionException {
    float output = 0;
    if (what == null || what.equals("")) {
      throw new InvalidExpressionException("Wrong expression");
    }
    Scanner scan = new Scanner(what);
    Symbol opp = Symbol.INVALID;
    try {
      if (scan.hasNext()) {
        do {
          if (scan.hasNextFloat()) {
            values.push(scan.nextFloat());
          } else {
            final String token = scan.next();
            Symbol[] opperationStack = Symbol.values();
            int length = opperationStack.length;
            for (int i = 0; i < length; i++) {
              final Symbol opperation = opperationStack[i];
              if (opperation.toString().equals(token)) {
                opp = opperation;
                break;
              }
            }
            if (opp == Symbol.DIVIDE) {
              Divide divide = new Divide(values.pop(), values.pop());
              this.values.push(divide.divide());
            } else if (opp == Symbol.TIMES) {
              Times times = new Times(values.pop(), values.pop());
              this.values.push(times.times());
            } else if (opp == Symbol.MINUS) {
              float temp = values.pop();
              Minus minus = new Minus(values.pop(), temp);
              this.values.push(minus.minus());
            } else if (opp == Symbol.PLUS) {
              Plus plus = new Plus(values.pop(), values.pop());
              this.values.push(plus.plus());
            } else {
              throw new InvalidExpressionException("Wrong operation token");
            }
          }

        } while (scan.hasNext());
      }
      scan.close();
      output = this.values.pop();
      if (!values.isEmpty()) {
        throw new InvalidExpressionException("Expression is unbalanced");
      }
    } catch (EmptyStackException e) {
      throw new InvalidExpressionException("Wrong Expression" + what + "error");
    }
    if (output > Float.MAX_VALUE || -output > Float.MAX_VALUE) {
      throw new InvalidExpressionException(
          "Wrong Expression out of bounds too large / small" + what + "error");
    } else {
      return output;
    }
  }
}
