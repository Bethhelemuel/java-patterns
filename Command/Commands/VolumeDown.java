package Patterns.Command.Commands;

import Patterns.Command.Command;
import Patterns.Command.ElectronicDevices;

public class VolumeDown implements Command {

    ElectronicDevices device;

    public VolumeDown(ElectronicDevices device){

        this.device=device;
    }

    @Override
    public void execute() {

        device.VolumeDown();
    }
}
