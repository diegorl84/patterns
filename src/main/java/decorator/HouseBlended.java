package decorator;

public class HouseBlended extends Beverage {

  public HouseBlended() {
    description = "House Blended coffee";
  }

  @Override
  public double getCost() {
    return 1.00;
  }
}
