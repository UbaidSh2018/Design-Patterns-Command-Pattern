public class StereoOffCommand implements Command {

    Stereo stereo;

    StereoOffCommand(Stereo stereo){
        this.stereo = stereo;
    }

    @Override
    public void execute() {
       stereo.off();
    }
}
