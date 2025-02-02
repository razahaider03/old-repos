package EqMethods;

public class Coke extends Drink {
  private final int sugar;

  public Coke(final int size, final int sugar) {
    super(size);
    this.sugar = sugar;
  }

  @Override
  public boolean equals(final Object obj) {
    if (!(obj instanceof Coke)) return false;
    return equals((Coke) obj);
  }

  public boolean equals(final Coke other) {
    if (!super.equals(other)) return false;
    return sugar == other.sugar;
  }
}
