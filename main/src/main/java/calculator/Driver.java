package calculator;

/**
 * This will be the true driver class (not the one created for client-testing).
 *
 * @author Hayden Amarr
 *
 */
public class Driver {
  /**
   * The main class to run the entire program.
   *
   * @param args The Command Line Arguments from the terminal
   */
  public static void main(String[] args) {
    try {
      if (args.length == 0) { // If there are Command Line Arguments present then run the ASCII view
        CalcModel model = new CalcModel();
        AsciiView view = new AsciiView();
        new CalcController(model, view);
        view.driveMenu();
      }
    } catch (Exception e) { // If any exception un-handled occurs crash the program
      System.err.println("Program crashed");
      System.exit(1);
    }
  }
}
