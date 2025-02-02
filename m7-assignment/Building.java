package src;

/** This is the Building class file. */
public class Building {

  // TODO - Put your code here.
  private int mLength;
  private int mWidth;
  private int mLotLength;
  private int mLotWidth;

  public Building(int length, int width, int lotLength, int lotWidth) {
    this.mLength = length;
    this.mWidth = width;
    this.mLotLength = lotLength;
    this.mLotWidth = lotWidth;
  }

  public int getLength() {
    return this.mLength;
  }

  public int getWidth() {
    return this.mWidth;
  }

  public int getLotLength() {
    return this.mLotLength;
  }

  public int getLotWidth() {
    return this.mLotWidth;
  }

  public void setLength(int length) {
    mLength = length;
  }

  public void setWidth(int width) {
    mWidth = width;
  }

  public void setLotLength(int lotLength) {
    mLotLength = lotLength;
  }

  public void setLotWidth(int lotWidth) {
    mLotWidth = lotWidth;
  }

  public int calcBuildingArea() {
    return mLength * mWidth;
  }

  public int calcLotArea() {
    return mLotLength * mLotWidth;
  }

  public String toString() {
    return "Owner: " + "n/a";
  }
}
