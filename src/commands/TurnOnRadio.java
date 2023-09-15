package commands;

import devices.ElectronicDevice;

public class TurnOnRadio implements Command{
    private ElectronicDevice device;

    public TurnOnRadio(ElectronicDevice device){
        this.device = device;
    }

    @Override
    public void execute() {
        device.on();
    }

    @Override
    public void undo() {
        device.off();
    }
}
