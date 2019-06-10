// INVOKER

//  1. we are going to put on and off commands for 7 slots in an array.
//  2. The setCommand() method takes a slot position and an On and Off command to be stored in that slot.
//  It puts these commands in the on and off arrays for later use.
// 3. When an On or Off button is pressed, the hardware takes care of calling the corresponding methods onButtonWasPushed() or
//    offButtonWasPushed().
public class RemoteControl {

    // declare arrays to hold on and off commands for 7 slots
    private Command[] onCommands;
    private Command[] offCommands;

    RemoteControl() {
        // initialize arrays to size 7
        onCommands = new Command[7];
        offCommands = new Command[7];

        // instantiate the arrays
        Command noCommand = new NoCommand();
        for (int i = 0; i < 7; i++) {
            onCommands[i] = noCommand;
            offCommands[i] = noCommand;
        }

    }

    //  2. The setCommand() method takes a slot position and an On and Off command to be stored in that slot.
//  It puts these commands in the on and off arrays for later use.
    public void setCommand(int slot, Command onCommand, Command offCommand) {
        onCommands[slot] = onCommand;
        offCommands[slot] = offCommand;
    }

    public void onButtonWasPushed(int slot) {
        onCommands[slot].execute();
    }

    public void offButtonWasPushed(int slot) {
        offCommands[slot].execute();
    }

    //We’ve overwritten toString() to print out each slot and its
    //corresponding command. You’ll see us use this when we test the
    //remote control.
   public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("\n ...............Remote Control...............\n");

        for(int i = 0 ; i < 7 ; i++){
            sb.append(" Slot " + i + " has commands = "+ onCommands[i].getClass().getName())
                    .append(" and  "+ offCommands[i].getClass().getName() + "\n");
        }
        return sb.toString();
    }
}
