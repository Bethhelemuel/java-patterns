package Patterns.Command.Commands;

import Patterns.Command.Command;
import Patterns.Command.ElectronicDevice;

public class Off implements Command {


    private ElectronicDevice electronicDevice;

    public Off(ElectronicDevice electronicDevice){

        this.electronicDevice=electronicDevice;

    }


    @Override
    public void execute() {

        electronicDevice.Off();
    }
}
