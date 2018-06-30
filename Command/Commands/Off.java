package Patterns.Command.Commands;

import Patterns.Command.Command;
import Patterns.Command.ElectronicDevices;

public class Off implements Command {

    ElectronicDevices device;

    public Off(ElectronicDevices device){

        this.device=device;
    }

    @Override
    public void execute() {

        device.Off();
    }
}
