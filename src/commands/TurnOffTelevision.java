package commands;

import devices.ElectronicDevice;

public class TurnOffTelevision implements Command{
    private ElectronicDevice device;

    public TurnOffTelevision(ElectronicDevice device){
        this.device = device;
    }

    @Override
    public void execute() {
        device.off();
    }

    @Override
    public void undo() {
        device.on();
    }  
}
