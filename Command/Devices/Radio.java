package Patterns.Command.Devices;

import Patterns.Command.ElectronicDevice;

public class Radio implements ElectronicDevice {

    private int volume;

    @Override
    public void On() {


        System.out.println("Radio is on !");

    }

    @Override
    public void Off() {
        System.out.println("Radio is off !");
    }

    @Override
    public void volumeUp() {
        volume++;
        System.out.println("Radio volume at "+ volume );
    }

    @Override
    public void volumeDown() {
        volume--;
        System.out.println("Radio volume at "+ volume );
    }
}
