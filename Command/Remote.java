package Patterns.Command;

public class Remote implements ElectronicDevices {

    Command on;
    Command off;
    Command volumeUp;
    Command volumeDown;

    public Remote(Command on,Command off,Command volumeUp, Command volumeDown){

        this.on=on;
        this.off=off;
        this.volumeUp=volumeUp;
        this.volumeDown=volumeDown;
    }


    @Override
    public void On() {
        this.on.execute();
    }

    @Override
    public void Off() {
        this.off.execute();
    }

    @Override
    public void VolumeUp() {
this.volumeUp.execute();
    }

    @Override
    public void VolumeDown() {
this.volumeDown.execute();
    }
}
