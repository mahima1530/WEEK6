package WEEK6HW;/* 4. Write a Java programme using the following steps.
4.1 Declare two instance and two static variables.
4.2 Declare one instance method.
4.3 Declare one static method.
4.4 Call all four instance and static variables into both instance and static methods inside the
print statement.
4.5 Declare the Main method.
4.6 Call both instance and static methods into the Main method and run the programme.*/

public class Question_4 {  //Declare globally
    int a = 10;//instance variable
    int b =11;//instance variable
    static String num1 = "kesha";//static variable
    static String num2 = "shah";//static variable

    public static void main(String[] args)//Declare main method
    {
        Question_4 s = new Question_4();//instance method
        s.std_1();

        std_2();//static method

    }


    public void std_1()//Declare instance method
    {
        System.out.println(a);//instance variable
        System.out.println(b);//instance variable
    }

    public static void std_2()//Declare static method
    {
        System.out.println(num1);//static variable
        System.out.println(num2);//static variable
    }
}
