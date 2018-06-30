package Patterns.Factory;

public class Test {

    public static void main(String[] args){


        n1 first=(n1) getItem("n1");
        n2 second=(n2) getItem("n2");


        System.out.println(first.getName());
        System.out.println(second.getName());


    }


    public static Boss getItem(String s){

        Boss b=null;


        if(s.equals("n1")){

            b=new n1();
        }else{

            b= new n2();
        }

        return b;

    }
}
