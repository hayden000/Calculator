package calculator;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * This class is for doing calculations for infix notation. This uses Dijkstra's
 * Railroad Shunting-yard algorithm
 *
 * @author Hayden Amarr
 *
 */
public class StandardCalc implements Calculator {
  private RevPolishCalc rpCalc;
  private OpStack values;
  private StrStack strStack;

  /**
   * Constructor to create fields and stacks.
   * 
   */
  public StandardCalc() {
    this.rpCalc = new RevPolishCalc();
    this.strStack = new StrStack();
    this.values = new OpStack();
  }

  private String what;
  private Symbol temp;
  String output = "";
  String reverse = "";

  private int pemdas(Symbol symb) {
    if (symb.equals(Symbol.MINUS) || symb.equals(Symbol.PLUS)) {
      return 1;
    }
    if (symb.equals(Symbol.DIVIDE) || symb.equals(Symbol.TIMES)) {
      return 2;
    }
    return 3;
  }

  /**
   * The method uses the reverse shunting algorithm to convert infix notation to
   * reverse Polish notation to then be evaluated.
   *
   * @param what The string expression to be evaluated.
   *
   * @return The result of the calculation
   *
   * @throws InvalidExpressionException Not a valid calculation.
   */
  public float evaluate(String what) throws InvalidExpressionException {
    if (what == null || what.equals("")) {
      throw new InvalidExpressionException("Wrong expression");
    }
    this.what = what;
    Boolean flag = false;
    Scanner scanner = new Scanner(what);
    while (scanner.hasNext()) {
      if (scanner.hasNextFloat()) {
        if (flag) {
          throw new InvalidExpressionException("Not valid");
        }
        flag = true;
        this.strStack.push(scanner.next());

      } else {
        flag = false;
        Symbol opp = Symbol.INVALID;
        final String token = scanner.next();
        Symbol[] opperationStack = Symbol.values();
        int length = opperationStack.length;
        for (int i = 0; i < length; i++) {
          final Symbol opperation = opperationStack[i];
          if (opperation.toString().equals(token)) {
            opp = opperation;
            break;
          }
        }
        if (opp.equals(Symbol.LEFT_BRACKET)) {
          this.values.push(opp);
        } else if (opp.equals(Symbol.RIGHT_BRACKET)) {
          if (!this.values.isEmpty()) {
            this.temp = values.pop();
            values.push(this.temp);
          }
          for (Symbol op = this.values.pop(); op != Symbol.LEFT_BRACKET; op = this.values.pop()) {
            strStack.push(op.toString());
          }
        } else {
          if (!values.isEmpty()) {
            this.temp = values.pop();
            this.values.push(this.temp);
          }
          if (!this.values.isEmpty() && pemdas(opp) == pemdas(this.temp)) {
            strStack.push(this.values.pop().toString());
          }
          this.values.push(opp);
        }
      }
    }
    while (!this.values.isEmpty()) {
      this.temp = this.values.pop();
      this.values.push(this.temp);
      if (temp.equals(Symbol.LEFT_BRACKET)) {
        throw new InvalidExpressionException("Not valid");
      }
      strStack.push(this.values.pop().toString());
    } // Reverse the expression as it is now in pre-fix (polish) notation
    ArrayList<String> rev = new ArrayList<String>();
    while (!(this.strStack.isEmpty())) {
      this.reverse = this.reverse + this.strStack.pop() + " ";
    }
    Scanner scan = new Scanner(this.reverse);
    while (scan.hasNext()) {
      rev.add(scan.next());
    }
    for (int i = rev.size() - 1; i >= 0; i--) {
      output = output + rev.get(i).toString() + " ";
    }
    return this.rpCalc.evaluate(this.output);
  }
}
