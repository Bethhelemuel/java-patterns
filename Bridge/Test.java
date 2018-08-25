package Patterns.Bridge;

public class Test  {

    public static void main(String[] args){

        RemoteButton theTv= new TVRemoteMute(new TVDevice(5,10));
        RemoteButton theTv2= new TVRemotePause(new TVDevice(1,100));
        RemoteButton dvd=new TVRemoteMute(new DVDDevice(1,100));

     //  RemoteButton theDVD= new DVDRemote(new TVDevice(1,200));


        System.out.println("Test TV with Mute");



            theTv.buttonSixPressed();
            theTv.buttonSixPressed();
            theTv.buttonSixPressed();
            theTv.buttonSixPressed();

            theTv.buttonNinePressed();
            theTv.deviceFeedback();

            System.out.println("\nTest TV with Pause \n");


            theTv2.buttonFivePressed();
            theTv2.buttonSixPressed();
            theTv2.buttonSixPressed();
            theTv2.buttonSixPressed();
            theTv2.buttonSixPressed();
            theTv2.buttonNinePressed();

            theTv2.deviceFeedback();


    }
}
