package EqMethods;

public class Coffee extends Drink {
  private final int coffeine;

  public Coffee(final int size, final int coffeine) {
    super(size);
    this.coffeine = coffeine;
  }

  @Override
  public boolean equals(final Object obj) {
    if (!(obj instanceof Coffee)) return false;
    return equals((Coffee) obj);
  }

  public boolean equals(final Coffee other) {
    if (!super.equals(other)) return false;
    return coffeine == other.coffeine;
  }
}
