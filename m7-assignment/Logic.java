package src;

/**
 * This is where the logic of this App is centralized for this assignment.
 *
 * <p>The assignments are designed this way to simplify your early Android interactions. Designing
 * the assignments this way allows you to first learn key 'Java' features without having to
 * beforehand learn the complexities of Android.
 */
public class Logic implements LogicInterface {
  /** Used for logging. */
  public static final String TAG = Logic.class.getName();

  /** Reference to the output object. */

  /** Constructor initializes the field. */

  /** Perform the computation to print the houses and offices and the total neighborhood area. */
  @Override
  public void process() {
    // Get the list of all the buildings.
    final BuildingList list = new BuildingList();

    // Get the list of houses.
    final House[] house = list.getHouses();

    // Get the list of offices.
    final Office[] office = list.getOffices();
    // what is this

    Neighborhood.print(house, "Houses");
    System.out.println("");
    Neighborhood.print(office, "Offices");

    System.out.println("");
    System.out.println(
        "Total neighborhood area: "
            + (Neighborhood.calcArea(house) + Neighborhood.calcArea(office)));
  }
}
