package Patterns.Command;

public class Remote {


    private Command on,off,volumeUp,volumeDown;


    public Remote(Command on,Command off, Command volumeUp,Command volumeDown){

        this.off=off;
        this.on=on;
        this.volumeDown=volumeDown;
        this.volumeUp=volumeUp;
    }


    public void on(){

        on.execute();
    }

    public void off(){

        off.execute();
    }

    public void volumeUp(){

        volumeUp.execute();
    }

    public void volumeDown(){

        volumeDown.execute();
    }
}
