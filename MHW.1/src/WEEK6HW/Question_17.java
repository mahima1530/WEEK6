package WEEK6HW;
/* 17. Write a Java Program using below steps.
17.1 Declare your city as instance variables.
17.2 Declare your country as static variables.
17.3 Declare one instance method and call static variable in print statement
17.4 Declare static method and call instance variable in print Statement.
17.5 Call both user defined methods into main method.*/

public class Question_17//Describe globally
{       String city = "London";//instance variable

    static String country = "United Kingdom";

    public static void main(String[] args)
    {  Question_17 L = new Question_17();
        L.harrow();

        wembley();

    }

    public void harrow()//instance method
    {
        System.out.println(country);//calling static variable
    }

    public static void wembley()//static method
    {      Question_17 s = new Question_17();
        System.out.println(s.city);//calling instance variable
    }


}
