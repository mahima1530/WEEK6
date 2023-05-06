package WEEK6HW;
/* 18. Write a Java Program using below steps.
18.1 Declare your council name as static variables.
18.2 Declare your house number as instance variables.
18.3 Declare one instance method name borough() and call Static variable
18.4 Declare static method name address() and call instance variable
18.5 Call both user defined methods into main method.*/

public class Question_18 {//Declare globally
    int house_n = 17;//instance variable

    static String c_name = "harrow council" ;//static variable

    public static void main(String[] args) {
        Question_18 s = new Question_18();
        s.borough();

        address();
    }

    public void borough()//instance method
    {
        System.out.println(c_name);//calling static variable

    }
    public static void address()//static method
    {
        Question_18 g = new Question_18();//calling instance variable
        System.out.println(g.house_n);
    }
}
