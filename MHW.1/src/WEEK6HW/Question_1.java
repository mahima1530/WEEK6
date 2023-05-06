package WEEK6HW;
/* 1. Write a Java programme using the following steps.
1.1 Declare two instance variables.
1.2 Declare one instance method.
1.3 Call both instance variables into the instance method inside the print statement.
1.4 Declare the Main method.
1.5 Call the above instance method into the Main method and run the programme.*/

public class Question_1 {
 int a = 15;//Declare globally
 int b = 30;//instance variable

       public static void main(String[] args)//Declare main method

       { Question_1  v = new Question_1();//declare object
           v.int_1();

       }
    public void int_1()//declare instance method
    {
        System.out.println(a);//instance variable
        System.out.println(b);//instance variable

    }
}
