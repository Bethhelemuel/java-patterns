package Patterns.Command.Commands;

import Patterns.Command.Command;
import Patterns.Command.ElectronicDevice;

public class VolumeUp implements Command {


    private ElectronicDevice electronicDevice;

    public VolumeUp(ElectronicDevice electronicDevice){

        this.electronicDevice=electronicDevice;

    }


    @Override
    public void execute() {

        electronicDevice.volumeUp();
    }
}
