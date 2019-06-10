public class GarageDoorUpCommand implements Command {

    Garage garage;

    GarageDoorUpCommand(Garage garage){
        this.garage= garage;
    }

    @Override
    public void execute() {
        garage.up();
    }
}
