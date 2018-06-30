package Patterns.Singleton;

import java.util.Arrays;
import java.util.LinkedList;

public class Singleton {

    private Singleton(){}

    public static Singleton instance=null;

    private static String[] numbers={"1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20"};

    private static LinkedList<String> numberList=new LinkedList<>(Arrays.asList(numbers));


    private static boolean firstThread=true;

    public static Singleton getInstance(){

        if(instance != null){

            return instance;
        }else{

            if(firstThread){

                firstThread=false;

                Thread.currentThread();
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

            synchronized (Singleton.class){

                instance=new Singleton();
            }
        }

        return instance;

    }


    public  LinkedList<String> getNumberList(){

        return instance.numberList;
    }


    public LinkedList<String> getNumbers(int number){


        LinkedList<String> newList= new LinkedList<>();


        for(int i=0;i<number;i++){

            newList.add(instance.getNumberList().remove(0));


        }

        return newList;

    }
}
