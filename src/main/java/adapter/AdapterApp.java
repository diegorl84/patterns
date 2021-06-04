package adapter;

import adapter.ducks.Duck;
import adapter.ducks.MallardDuck;
import adapter.turkeys.WildTurkey;

public class AdapterApp {
  public static void main(String[] args) {
    MallardDuck mallardDuck = new MallardDuck();

    WildTurkey wildTurkey = new WildTurkey();

    Duck turkeyAdapter = new TurkeyAdapter(wildTurkey);
    System.out.println("The turkey says...");
    wildTurkey.gobble();
    wildTurkey.fly();

    System.out.println("Duck says...");
    mallardDuck.quack();
    mallardDuck.fly();

    System.out.println("Turkey adapter...");
    turkeyAdapter.quack();
    turkeyAdapter.fly();
  }
}
