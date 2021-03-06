package command.commands;

import command.entity.CeilingFan;
import command.entity.Stereo;

public class CeilingFanHighCommand implements Command{

  private CeilingFan ceilingFan;
  private int prevSpeed;

  public CeilingFanHighCommand(CeilingFan ceilingFan) {
    this.ceilingFan = ceilingFan;
  }

  @Override
  public void execute() {
    prevSpeed = ceilingFan.getSpeed();
    ceilingFan.high();

  }

  @Override
  public void undo() {
    System.out.println("undo:");
    if (prevSpeed == CeilingFan.HIGH) {
      ceilingFan.high();
    } else if (prevSpeed == CeilingFan.MEDIUM) {
      ceilingFan.medium();
    } else if (prevSpeed == CeilingFan.LOW) {
      ceilingFan.low();
    } else if (prevSpeed == CeilingFan.OFF) {
      ceilingFan.off();
    }
  }
}
