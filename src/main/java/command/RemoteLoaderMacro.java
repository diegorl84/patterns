package command;

import command.commands.CeilingFanHighCommand;
import command.commands.CeilingFanLowCommand;
import command.commands.CeilingFanMediumCommand;
import command.commands.CeilingFanOffCommand;
import command.commands.Command;
import command.commands.LightOffCommand;
import command.commands.LightOnCommand;
import command.commands.MacroCommand;
import command.commands.StereoOffCommand;
import command.commands.StereoOnWithCDCommand;
import command.entity.CeilingFan;
import command.entity.Light;
import command.entity.Stereo;

public class RemoteLoaderMacro {
  public static void main(String[] args) {
    AdvanceRemoteControl remoteControl = new AdvanceRemoteControl();
    Light light = new Light("Living Room");
    CeilingFan ceilingFan = new CeilingFan("Living Room");
    Stereo stereo = new Stereo("Living Room");

    LightOnCommand lightOn = new LightOnCommand(light);
    StereoOnWithCDCommand stereoOn = new StereoOnWithCDCommand(stereo);
    CeilingFanLowCommand ceilingFanLowCommand = new CeilingFanLowCommand(ceilingFan);

    LightOffCommand lightOff = new LightOffCommand(light);
    StereoOffCommand stereoOff = new StereoOffCommand(stereo);
    CeilingFanOffCommand ceilingFanOff = new CeilingFanOffCommand(ceilingFan);

    Command[] partyOn = {lightOn, stereoOn, ceilingFanLowCommand};
    Command[] partyOff = {lightOff, stereoOff, ceilingFanOff};

    MacroCommand partyOnMacro = new MacroCommand(partyOn);
    MacroCommand partyOffMacro = new MacroCommand(partyOff);

    remoteControl.setCommand(0, partyOnMacro, partyOffMacro);

    remoteControl.onButtonPushed(0);
    remoteControl.offButtonPushed(0);




  }
}
