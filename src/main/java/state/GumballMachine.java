package state;

import state.states.HasQuarterState;
import state.states.NoQuarterState;
import state.states.SoldOutState;
import state.states.SoldState;
import state.states.State;
import state.states.WinnerState;

public class GumballMachine {

  State soldOutState;
  State noQuarterState;
  State hasQuarterState;
  State soldState;
  State winnerState;

  State state = soldOutState;
  int count = 0;

  public GumballMachine(int count) {
    soldOutState = new SoldOutState(this);
    noQuarterState = new NoQuarterState(this);
    hasQuarterState = new HasQuarterState(this);
    soldState = new SoldState(this);
    winnerState = new WinnerState(this);

    this.count = count;
    if (count > 0) {
      this.state = noQuarterState;
    }
  }

  public void insertQuarter() {
    state.insertQuarter();
  }

  public void ejectQuarter() {
    state.ejectQuarter();
  }

  public void turnCrank() {
    state.turnCrank();
    state.dispense();
  }

  public void releaseBall() {
    System.out.println("A gumball comes rolling out the slot...");
    if (count != 0) {
      count = count - 1;
    }
  }

  @Override
  public String toString() {
    String a =
        "Mighty Gumball, Inc.\n"
            + "Java-enabled Standing Gumball Model #2004\n"
            + "Inventory: "
            + count
            + " gumballs\n";
    if (count == 0) {
      a += "Machine is sold out";
    } else {
      a += "Machine is waiting for quarter";
    }

    return a;
  }

  public void setState(State state) {
    this.state = state;
  }

  public State getSoldOutState() {
    return soldOutState;
  }

  public State getNoQuarterState() {
    return noQuarterState;
  }

  public State getHasQuarterState() {
    return hasQuarterState;
  }

  public State getSoldState() {
    return soldState;
  }

  public State getWinnerState() {
    return winnerState;
  }

  public void setCount(int count) {
    this.count = count;
  }

  public int getCount() {
    return count;
  }
}
