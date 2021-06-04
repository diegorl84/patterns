package command;

import command.commands.CeilingFanHighCommand;
import command.commands.CeilingFanLowCommand;
import command.commands.CeilingFanMediumCommand;
import command.commands.CeilingFanOffCommand;
import command.commands.LightOffCommand;
import command.commands.LightOnCommand;
import command.entity.CeilingFan;
import command.entity.Light;

public class RemoteLoaderUndo {
  public static void main(String[] args) {
    AdvanceRemoteControl remoteControl = new AdvanceRemoteControl();
    Light livingLight = new Light("Living");
    CeilingFan ceilingFan = new CeilingFan("Living");

    LightOnCommand livingOn = new LightOnCommand(livingLight);
    LightOffCommand livingOff = new LightOffCommand(livingLight);
    CeilingFanOffCommand ceilingFanOffCommand = new CeilingFanOffCommand(ceilingFan);
    CeilingFanLowCommand ceilingFanLowCommand = new CeilingFanLowCommand(ceilingFan);
    CeilingFanMediumCommand ceilingFanMediumCommand = new CeilingFanMediumCommand(ceilingFan);
    CeilingFanHighCommand ceilingFanHighCommand = new CeilingFanHighCommand(ceilingFan);


    remoteControl.setCommand(0, livingOn, livingOff);

    remoteControl.setCommand(1, ceilingFanLowCommand, ceilingFanOffCommand);
    remoteControl.setCommand(2, ceilingFanMediumCommand, ceilingFanOffCommand);
    remoteControl.setCommand(3, ceilingFanHighCommand, ceilingFanOffCommand);

    remoteControl.onButtonPushed(0);
    remoteControl.offButtonPushed(0);
    remoteControl.undoButtonPushed();

    remoteControl.onButtonPushed(1);
    remoteControl.offButtonPushed(1);
    remoteControl.undoButtonPushed();

    remoteControl.onButtonPushed(2);
    remoteControl.undoButtonPushed();




  }
}
