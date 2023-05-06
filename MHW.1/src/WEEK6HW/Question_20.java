package WEEK6HW; /*20. Write a Java Program using below steps.
        20.1 Declare your Spain as static variable.
        20.2 Declare your United Kingdom as instance variable.
        20.3 Declare instance method name homeCountry()and call static variable.
        20.4 Declare static method name holidays() and call instance variable
        20.5 Call both methods in main method.*/

public class Question_20 {//declare globally

    String country_1 = "united kingdom";//instance variable

    static String country_2 = "spain";//static variable

    public static void main(String[] args) {
        Question_20 B = new Question_20();
        B.homeCountry();
        holidays();
    }
    public void homeCountry()//instance method
    {
        System.out.println(country_2);//static variable
    }

    public static void holidays()//static method
    {
        Question_20 m = new Question_20();
        System.out.println(m.country_1);//instance variable
    }
}
