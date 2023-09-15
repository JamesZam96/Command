package commands;

import devices.ElectronicDevice;

public class TurnOffRadio implements Command{
    private ElectronicDevice device;

    public TurnOffRadio(ElectronicDevice device){
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
