package Logic;

import Logic.Add;
import Logic.Divide;
import Logic.Multiply;
import Logic.Subtract;

/** Performs an operation selected by the user. */
public class Logic implements LogicInterface {
  /**
   * Reference to the Activity output. protected ActivityInterface mOut; Constructor initializes the
   * field.
   *
   * <p>public Logic(ActivityInterface out) mOut = out;
   */

  /** Perform the @a operation on @a argumentOne and @a argumentTwo. */
  public void process(int argumentOne, int argumentTwo, int operation) {
    // TODO -- start your code here
    if (operation == 1){
    int a = argumentOne;
    int b = argumentTwo;
    Add obj = new Add();
    obj.addition(a, b);
    }
  }
}
