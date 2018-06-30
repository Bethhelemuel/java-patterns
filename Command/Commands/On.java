package Patterns.Command.Commands;

import Patterns.Command.Command;
import Patterns.Command.ElectronicDevices;

public class On implements Command {

    ElectronicDevices device;

    public On(ElectronicDevices device){

        this.device=device;
    }

    @Override
    public void execute() {

        device.On();
    }
}
