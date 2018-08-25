package Patterns.Command.Devices;

import Patterns.Command.Commands.Off;
import Patterns.Command.Commands.On;
import Patterns.Command.Commands.VolumeDown;
import Patterns.Command.Commands.VolumeUp;
import Patterns.Command.Remote;

public class Test {


        public static void main(String[] args){


            Television tv= new Television();

            On tvOn= new On(tv);
            Off tvOff= new Off(tv);
            VolumeDown tvVolumeDown= new VolumeDown(tv);
            VolumeUp tvVolumeUp= new VolumeUp(tv);


            Remote tvRemote= new Remote(tvOn,tvOff,tvVolumeUp,tvVolumeDown);


            tvRemote.on();
            tvRemote.volumeUp();
            tvRemote.volumeUp();
            tvRemote.volumeUp();
            tvRemote.volumeUp();
            tvRemote.volumeUp();
            tvRemote.volumeUp();
            tvRemote.volumeUp();
            tvRemote.volumeUp();
            tvRemote.volumeUp();
            tvRemote.volumeUp();
            tvRemote.volumeUp();


            tvRemote.off();
        }
}
