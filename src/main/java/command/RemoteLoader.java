package command;

import command.commands.LightOffCommand;
import command.commands.LightOnCommand;
import command.commands.StereoOffCommand;
import command.commands.StereoOnWithCDCommand;
import command.entity.CeilingFan;
import command.entity.Light;
import command.entity.Stereo;

public class RemoteLoader {
  public static void main(String[] args) {
    AdvanceRemoteControl remoteControl = new AdvanceRemoteControl();
    Light livingLight = new Light("Living");
    Light kitchenLight = new Light("Kitchen");
    CeilingFan cealingFan = new CeilingFan("Living fan");
    Stereo stereo = new Stereo("Living");

    LightOnCommand livingOn = new LightOnCommand(livingLight);
    LightOffCommand livingOff = new LightOffCommand(livingLight);

    LightOnCommand kitchenOn = new LightOnCommand(kitchenLight);
    LightOffCommand kitchenOff = new LightOffCommand(kitchenLight);

    StereoOnWithCDCommand stereoOnWithCDCommand = new StereoOnWithCDCommand(stereo);
    StereoOffCommand stereoOffCommand = new StereoOffCommand(stereo);

    remoteControl.setCommand(0, livingOn, livingOff);
    remoteControl.setCommand(1, kitchenOn, kitchenOff);
    remoteControl.setCommand(2, stereoOnWithCDCommand, stereoOffCommand);

    System.out.println(remoteControl);

    remoteControl.onButtonPushed(0);
    remoteControl.offButtonPushed(0);

    remoteControl.onButtonPushed(1);
    remoteControl.offButtonPushed(1);

    remoteControl.onButtonPushed(2);
    remoteControl.offButtonPushed(2);
  }
}
