package command;

import command.commands.Command;
import command.commands.NoCommand;

public class AdvanceRemoteControl {

  Command[] onCommands;
  Command[] offCommands;
  Command undoCommand;

  public AdvanceRemoteControl() {
    this.onCommands = new Command[7];
    this.offCommands = new Command[7];

    Command noCommand = new NoCommand();
    for (int i = 0; i < 7; i++){
      onCommands[i] = noCommand;
      offCommands[i] = noCommand;
    }
    undoCommand = noCommand;
  }

  public void setCommand(int slot, Command onCommand, Command offCommand){
    onCommands[slot] = onCommand;
    offCommands[slot] = offCommand;
  }

  public void onButtonPushed(int slot){
    onCommands[slot].execute();
    undoCommand = onCommands[slot];
  }

  public void offButtonPushed(int slot){
    offCommands[slot].execute();
    undoCommand = offCommands[slot];
  }

  public void undoButtonPushed(){
    undoCommand.undo();
  }

  public String toString() {
    StringBuffer stringBuff = new StringBuffer();
    stringBuff.append("\n------ Remote Control -------\n");
    for (int i = 0; i < onCommands.length; i++) {
      stringBuff.append("[slot " + i + "] " + onCommands[i].getClass().getName()
          + " " + offCommands[i].getClass().getName() + "\n");
    }
    return stringBuff.toString();
  }
}
