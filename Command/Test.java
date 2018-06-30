package Patterns.Command;

import Patterns.Command.Commands.Off;
import Patterns.Command.Commands.On;
import Patterns.Command.Commands.VolumeDown;
import Patterns.Command.Commands.VolumeUp;
import Patterns.Command.Devices.Phone;
import Patterns.Command.Devices.Radio;
import Patterns.Command.Devices.Television;

public class Test {

    public static void main(String[] args){

        Television smartTv= new Television();
        Phone iPhone= new Phone();
        Radio iRadio= new Radio();


        Remote tvRemote= getRemote(smartTv);
        Remote iPhoneRemote = getRemote(iPhone);
        Remote iRadioRemote= getRemote(iRadio);



        tvRemote.On();
        tvRemote.VolumeUp();
        tvRemote.VolumeUp();
        tvRemote.VolumeUp();

    iRadio.On();
    iRadio.VolumeUp();
    iRadio.VolumeUp();
    iRadio.VolumeDown();
    iRadio.VolumeDown();

    tvRemote.Off();
    iRadioRemote.Off();

    }



    public static Remote getRemote(ElectronicDevices e){

        On on= new On(e);
        Off off= new Off(e);
        VolumeDown volumeDown= new VolumeDown(e);
        VolumeUp volumeUp= new VolumeUp(e);



        Remote remote= new Remote(on,off,volumeUp,volumeDown);

return remote;



    }
}
