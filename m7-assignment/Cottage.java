package src;
/** This is the cottage class file. It is a subclass of House. */
public class Cottage extends House {

  // TODO - Put your code here.
  private boolean mSecondFloor;

  public Cottage(int dimension, int lotLength, int lotWidth) {
    super(dimension, dimension, lotLength, lotWidth);
  }

  public Cottage(int dimension, int lotLength, int lotWidth, String owner, boolean secondFloor) {
    super(dimension, dimension, lotLength, lotWidth, owner, secondFloor);
  }

  @Override
  public String toString() {
    return super.toString();
  }
}
