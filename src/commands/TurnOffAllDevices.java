package commands;

import java.util.List;

import devices.ElectronicDevice;

public class TurnOffAllDevices implements Command{

    List<ElectronicDevice> allDevices;

    public TurnOffAllDevices(List<ElectronicDevice> newDevices){
        allDevices = newDevices;
    }

    @Override
    public void execute() {
        for(ElectronicDevice device: allDevices){
            device.off();
        }
        
    }

    @Override
    public void undo() {
        for(ElectronicDevice device: allDevices){
            device.on();
        }
        
    }
    
}
