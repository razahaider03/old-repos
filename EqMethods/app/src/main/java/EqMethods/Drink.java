package EqMethods;

public class Drink {
  private final int size;

  public Drink(final int size) {
    this.size = size;
  }

  @Override
  public boolean equals(final Object obj) {
    if (!(obj instanceof Drink)) return false;
    return equals((Drink) obj);
  }

  public boolean equals(final Drink other) {
    return this.size == other.size;
  }
}
