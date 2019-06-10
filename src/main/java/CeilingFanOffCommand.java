public class CeilingFanOffCommand implements Command {
    CeilingFan ceilingFan;

    CeilingFanOffCommand(CeilingFan ceilingFan){
        this.ceilingFan = ceilingFan;
    }
    @Override
    public void execute() {
        ceilingFan.off();
    }
}
