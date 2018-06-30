package Patterns.Visitor;

public class Test {


    public static void main(String[] args){

        Black kunta= new Black(1);
        White john= new White(1);
        Indian rajesh= new Indian(1);


        Tax normalTax= new Tax();
        HolidayTax holidayTax= new HolidayTax();


        System.out.println("----------------------");

        System.out.println("John : "+ john.set(holidayTax));
        System.out.println("Rajesh : "+ rajesh.set(holidayTax));
        System.out.println("Kunta : "+ kunta.set(holidayTax));


        System.out.println("----------------------");

    }
}
