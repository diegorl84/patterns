package decorator;

public abstract class Beverage {
  String description = "Unkown";

  public String getDescription() {
    return description;
  }

  public abstract double getCost();
}
