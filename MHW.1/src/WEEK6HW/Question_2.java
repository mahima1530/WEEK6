package WEEK6HW;/* 2. Write a Java programme using the following steps.
        2.1 Declare two static variables.
        2.2 Declare one static method.
        2.3 Call both static variables into the static method inside the print statement.
        2.4 Declare the Main method.
        2.5 Call the static method into the Main method and run the programme.*/


public class Question_2 {

        static String a = "shiv";// declare globally
        static int b = 22;// static variables


        public static void main(String[] args)//Declare main method
        {
            que_2();

        }
        public static void que_2()//static method
        {
            System.out.println(a);//static variable
            System.out.println(b);//static variable

        }
    }


