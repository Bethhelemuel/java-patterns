package Patterns.Facade;

public class Pin {


    private boolean checkPinNumber(int pin) {

        if (pin == 1234) {

            return true;
        } else {
            return false;
        }
    }

    public void checkPin(int pin){
        if(this.checkPinNumber(pin)){

            System.out.println("Account number correct");
        }
    }

}
