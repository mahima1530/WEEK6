package WEEK6HW; /* 3. Write a Java programme using the following steps.
3.1 Declare one instance and one static variable.
3.2 Declare one instance method.
3.3 Declare one static method.
3.4 Call both instance and static variables into both instance and static methods inside the
print statement.
3.5 Declare the Main method.
3.6 Call both instance and static methods into the Main method and run the programme.*/

public class Question_3 { //Declare globally
    int a = 30;//Declare instance variable
    static String b = "Mihir";//Declare static variable


    public static void main(String[] args)//Declare main method
    {
        Question_3 m = new Question_3();//instance method
        m.int_1();

        int_2();//static method

    }
    public void int_1()//declare instance method
    {
        System.out.println(a);//instance variable

    }
    public static void int_2()//Declare static method
    {
        System.out.println(b);//static variable
    }

}
