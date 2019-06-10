// this is our client in command pattern speak
public class RemoteControlTest {

    public static void main(String[] args) {

        // The remote is our Invoker; it will be passed a command object that can be used to make requests.
        SimpleRemoteControl remote = new SimpleRemoteControl();

        // Now we create a Light object, Garage object, these will be the Receiver of the request.
        Light light = new Light("General");
        Garage garage = new Garage();

        // Create a command and pass the receiver to it.
        LightOnCommand lightOnCommand = new LightOnCommand(light);
        GarageDoorUpCommand garageOpen = new GarageDoorUpCommand(garage);

        remote.setCommand(lightOnCommand); // pass the command to the invoker
        remote.buttonWasPressed(); // then we simulate the button being pressed

        remote.setCommand(garageOpen);  // pass the command to the invoker
        remote.buttonWasPressed(); // then we simulate the button being pressed to open garage
    }
}
