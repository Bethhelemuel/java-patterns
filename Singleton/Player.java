package Patterns.Singleton;

import java.util.Arrays;
import java.util.LinkedList;

public class Player {


    private Player(){};


    private static Player instance=null;

    // Testing Singleton with threads
    private static boolean firstThread=true;

    private String[] numbers={"1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20"};

    private LinkedList numberList=new LinkedList(Arrays.asList(numbers));
    public  static Player getInstance(){


        synchronized (Player.class) {


            if (instance == null) {

                //Make first thread sleep to test  synchronized instantiation
                if (firstThread) {

                    firstThread = false;
                    Thread.currentThread();
                    try {
                        Thread.sleep(1000);

                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }


                instance = new Player();

                return instance;
            } else {

                return instance;
            }

        }
    }


    public LinkedList getNumberList(){

        return instance.numberList;
    }


    public LinkedList getTiles(int amount){

        LinkedList linkedList= new LinkedList();

        for(int i=0;i<amount;i++){

            linkedList.add(this.getNumberList().remove(0));
        }

        return linkedList;
    }
}
