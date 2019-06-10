//invoker
public class SimpleRemoteControl {

    private Command slot1;

    SimpleRemoteControl(){}

    public void setCommand(Command command){
        this.slot1 = command;
    }

    public void buttonWasPressed(){
        slot1.execute();
    }
}
