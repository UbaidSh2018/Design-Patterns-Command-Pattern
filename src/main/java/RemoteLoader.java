// This is our Client
public class RemoteLoader {

    public static void main(String[] args) {

        // invoker object
        RemoteControl remote = new RemoteControl();

        // Creating all Receiver objects
        CeilingFan ceilingFan = new CeilingFan();
        Garage garage = new Garage();
        Light livingRoomLight = new Light("Living Room");
        Light kitchenLight = new Light("KitchenRoom");
        Stereo stereo = new Stereo();


        // Ceiling Fan Commands
        CeilingFanOnCommand fanOn = new CeilingFanOnCommand(ceilingFan);
        CeilingFanOffCommand fanOff = new CeilingFanOffCommand(ceilingFan);

        // Garage Commands
        GarageDoorUpCommand garageUp = new GarageDoorUpCommand(garage);
        GarageDoorDownCommand garageDown = new GarageDoorDownCommand(garage);

        // Living Room Light Commands
        LightOnCommand livingLightOn = new LightOnCommand(livingRoomLight);
        LightOffCommand livingLightOff = new LightOffCommand(livingRoomLight);

        // Kitchen Light Commands
        LightOnCommand kitchenLightOn= new LightOnCommand(kitchenLight);
        LightOffCommand kitchenLightOff = new LightOffCommand(kitchenLight);

        // Stereo Commands
        StereoOnWithCDCommand stereoOn = new StereoOnWithCDCommand(stereo);
        StereoOffCommand stereoOff = new StereoOffCommand(stereo);


        //loading commands into remote slots
        remote.setCommand(0, fanOn, fanOff);
        remote.setCommand(1, garageUp , garageDown);
        remote.setCommand(2, livingLightOn , livingLightOff);
        remote.setCommand(3, kitchenLightOn, kitchenLightOff);
        remote.setCommand(4, stereoOn, stereoOff);

        // printing each remote slot and command associated with it
        System.out.println(remote);

        // press on and off button for each slot
        remote.onButtonWasPushed(0);
        remote.offButtonWasPushed(0);
        remote.onButtonWasPushed(1);
        remote.offButtonWasPushed(1);
        remote.onButtonWasPushed(2);
        remote.offButtonWasPushed(2);
        remote.onButtonWasPushed(3);
        remote.offButtonWasPushed(3);
        remote.onButtonWasPushed(4);
        remote.offButtonWasPushed(4);
    }

}
