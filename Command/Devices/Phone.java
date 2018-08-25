package Patterns.Command.Devices;

import Patterns.Command.ElectronicDevice;

public class Phone implements ElectronicDevice {

    private int volume;

    @Override
    public void On() {


        System.out.println("Phone is on !");

    }

    @Override
    public void Off() {
        System.out.println("Phone is off !");
    }

    @Override
    public void volumeUp() {
        volume++;
        System.out.println("Phone volume at "+ volume );
    }

    @Override
    public void volumeDown() {
        volume--;
        System.out.println("Phone volume at "+ volume );
    }
}
