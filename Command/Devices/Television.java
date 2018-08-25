package Patterns.Command.Devices;

import Patterns.Command.ElectronicDevice;

public class Television implements ElectronicDevice {

    private int volume;

    @Override
    public void On() {


        System.out.println("TV is on !");

    }

    @Override
    public void Off() {
        System.out.println("TV is off !");
    }

    @Override
    public void volumeUp() {
        volume++;
        System.out.println("TV volume at "+ volume );
    }

    @Override
    public void volumeDown() {
        volume--;
        System.out.println("TV volume at "+ volume );
    }
}
