package command.commands;

import command.entity.Stereo;

public class StereoOnWithCDCommand implements Command{

  Stereo stereo;

  public StereoOnWithCDCommand(Stereo stereo) {
    this.stereo = stereo;
  }

  @Override
  public void execute() {
    stereo.on();
    stereo.setCD();
    stereo.setVolumen(11);

  }

  @Override
  public void undo() {

  }
}
