package Patterns.Command.Commands;

import Patterns.Command.Command;
import Patterns.Command.ElectronicDevices;

public class VolumeUp implements Command {

    ElectronicDevices device;

    public VolumeUp(ElectronicDevices device){

        this.device=device;
    }

    @Override
    public void execute() {

        device.VolumeUp();
    }
}
