package Patterns.Command.Commands;

import Patterns.Command.Command;
import Patterns.Command.ElectronicDevice;

public class VolumeDown implements Command {


    private ElectronicDevice electronicDevice;

    public VolumeDown(ElectronicDevice electronicDevice){

        this.electronicDevice=electronicDevice;

    }


    @Override
    public void execute() {

        electronicDevice.volumeDown();
    }
}
