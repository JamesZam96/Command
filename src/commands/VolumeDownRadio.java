package commands;

import devices.ElectronicDevice;

public class VolumeDownRadio implements Command{
    private ElectronicDevice device;
    
    public VolumeDownRadio(ElectronicDevice device){
        this.device = device;
    }

    @Override
    public void execute() {
        device.volumeDown();
    }

    @Override
    public void undo() {
        device.volumeUp();
    }
}
