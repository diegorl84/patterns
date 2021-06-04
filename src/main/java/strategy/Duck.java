package strategy;

import strategy.behavior.fly.FlyBehavior;
import strategy.behavior.quack.QuackBehavior;

public abstract class Duck {
  QuackBehavior quackBehavior;
  FlyBehavior flyBehavior;

  public Duck() {
  }

  public void setFlyBehavior(FlyBehavior flyBehavior){
    this.flyBehavior = flyBehavior;
  }

  public void setQuackBehavior(QuackBehavior quackBehavior){
    this.quackBehavior = quackBehavior;
  }

  public void performQuack(){
    quackBehavior.quack();
  }
  public void performFly(){
    flyBehavior.fly();
  }

  public abstract void display();

  public void swim(){
    System.out.println("All float");
  }

}
