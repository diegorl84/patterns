package singlefactory;

import singlefactory.pizza.Pizza;

public class Store {
  SimplePizzaFactory factory;

  public Store(SimplePizzaFactory factory) {
    this.factory = factory;
  }

  public Pizza orderPizza(String type) {
    /**
     * The NEW operator is replaced with a create method on the factory object. No
     * more concrete
     */
    Pizza pizza = factory.createPizza(type);
    pizza.prepare();
    pizza.bake();
    pizza.cut();
    pizza.box();
    return pizza;
  }
}
