package Patterns.Command.Devices;

import Patterns.Command.ElectronicDevices;

public class Radio implements ElectronicDevices {

   private int volume=0;
    @Override
    public void On() {
        System.out.println("Radio is On ! ");
    }

    @Override
    public void Off() {
        System.out.println("Radio is Off !");
    }

    @Override
    public void VolumeUp() {

        volume++;
        System.out.println("Radio volume is at "+ volume);

    }



    @Override
    public void VolumeDown() {
        if(volume <=0){

        }

        else{
            volume--;
        }

        System.out.println("Radio volume is at "+ volume);
    }
}
