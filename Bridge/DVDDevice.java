package Patterns.Bridge;

public class DVDDevice extends EntertainmentDevice {

    public DVDDevice(int newDeviceState, int newMaxSetting){

        deviceState= newDeviceState;
        maxSetting=newMaxSetting;
    }
    @Override
    public void buttonFivePressed() {

        System.out.println("Previous Chapter");
        deviceState--;
    }

    @Override
    public void buttonSixPressed() {
        System.out.println("Next Chapter");
        deviceState++;
    }
}
