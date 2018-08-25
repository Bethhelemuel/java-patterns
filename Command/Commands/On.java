package Patterns.Command.Commands;

import Patterns.Command.Command;
import Patterns.Command.ElectronicDevice;

public class On implements Command {


    private ElectronicDevice electronicDevice;

    public On(ElectronicDevice electronicDevice){

        this.electronicDevice=electronicDevice;

    }


    @Override
    public void execute() {

        electronicDevice.On();
    }
}
