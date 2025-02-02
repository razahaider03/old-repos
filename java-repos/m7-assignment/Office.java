package src;
/** This is the office class file, it is a subclass of Building. */
public class Office extends Building {

  // TODO - Put your code here.
  private String mBusinessName;
  private int mParkingSpaces;
  private static int sTotalOffices = 0;

  public Office(int length, int width, int lotLength, int lotWidth) {
    super(length, width, lotLength, lotWidth);
    sTotalOffices++;
  }

  public Office(int length, int width, int lotLength, int lotWidth, String businessName) {
    super(length, width, lotLength, lotWidth);
    this.mBusinessName = businessName;
    sTotalOffices++;
  }

  public Office(
      int length, int width, int lotLength, int lotWidth, String businessName, int parkingSpaces) {
    super(length, width, lotLength, lotWidth);
    this.mBusinessName = businessName;
    this.mParkingSpaces = parkingSpaces;
    sTotalOffices++;
  }

  public String getBusinessName() {
    return mBusinessName;
  }

  public int getParkingSpaces() {
    return mParkingSpaces;
  }

  public void setBusinessName(String businessName) {
    this.mBusinessName = businessName;
  }

  public void setParkingSpaces(int parkingSpaces) {
    this.mParkingSpaces = parkingSpaces;
  }

  @Override
  public String toString() {
    return "Business: "
        + (mBusinessName != null ? getBusinessName() : "unoccupied; ")
        + (mParkingSpaces != 0 ? " has " : "")
        + (mParkingSpaces != 0 ? mParkingSpaces : "")
        + (mParkingSpaces != 0 ? " Parking Spaces" : "")
        + " (total offices:"
        + sTotalOffices
        + ")";
  }

  @Override
  public boolean equals(Object obj) {
    return super.equals(obj);
  }
}
