package Patterns.Command.Devices;

import Patterns.Command.ElectronicDevices;

public class Phone implements ElectronicDevices {

   private int volume=0;
    @Override
    public void On() {
        System.out.println("Phone is on");
    }

    @Override
    public void Off() {
        System.out.println("Phone is on");
    }

    @Override
    public void VolumeUp() {

        volume++;
        System.out.println("Phone is at "+ volume);

    }



    @Override
    public void VolumeDown() {
        if(volume <=0){

        }

        else{
            volume--;
        }

        System.out.println("Phone is at "+ volume);
    }
}
