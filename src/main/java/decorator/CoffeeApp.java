package decorator;

public class CoffeeApp {
  public static void main(String[] args) {
    Beverage beverage = new Expresso();
    System.out.println(beverage.getDescription() + " $ " + beverage.getCost());

    Beverage b2 = new HouseBlended();
    b2 = new Mocha(b2);
    b2 = new Soy(b2);

    System.out.println(b2.getDescription() + " $ " + b2.getCost());
  }
}
