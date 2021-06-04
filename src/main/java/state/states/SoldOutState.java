package state.states;

import state.GumballMachine;

public class SoldOutState implements State{

  GumballMachine gumballMachine;

  public SoldOutState(GumballMachine gumballMachine) {
    this.gumballMachine = gumballMachine;
  }

  @Override
  public void insertQuarter() {
    System.out.println("Can't insert. Machine is sold out");
  }

  @Override
  public void ejectQuarter() {
    System.out.println("You can’t eject, you haven’t inserted a quarter yet");
  }

  @Override
  public void turnCrank() {
    System.out.println("You turned, but there are no gumballs");
  }

  @Override
  public void dispense() {
    System.out.println("No gumball dispensed");
  }
}
