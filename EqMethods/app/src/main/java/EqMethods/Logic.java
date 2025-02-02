package EqMethods;

public class Logic {
  public static void main(String[] args) {
    final Drink drink = new Drink(15);
    final Drink secondDrink = new Drink(15);

    System.out.println("drink.equals(secondDrink): " + drink.equals(secondDrink));
    System.out.println("secondDrink.equals(drink): " + secondDrink.equals(drink));

    final Coffee coffee = new Coffee(15, 3);
    final Coke coke = new Coke(15, 42);

    System.out.println("coffee.equals(drink): " + coffee.equals(drink));
    System.out.println("drink.equals(coffee): " + drink.equals(coffee));
    System.out.println("coke.equals(coffee): " + coke.equals(coffee));
  }
}
