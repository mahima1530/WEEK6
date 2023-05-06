package WEEK6HW;
/*19. Write a Java Program using below steps.
        19.1 Declare one of your group member names as instance variable.
        19.2 Declare one of your group member names as static variable.
        19.3 Declare one instance method name with group name (e.g. selenium())and call both global
        variables.
        19.4 Declare static method name agile() and call both variable
        19.5 Call both user defined methods into main method.
        Note: Declare 1 local variables in all user defined method and main method and print in to statement*/
public class Question_19 {//globally declare
    String num1 = "Punam";//instance variable
    static String num2 = "Falguni";//static variable

    public static void main(String[] args) {
        Question_19 e = new Question_19();
        e.postman();

        selenium();
    }

    public void postman()//instance method
    {
        System.out.println(num1);//instance variable
        System.out.println(num2);//static variable
    }

    public static void selenium()//static method
    {    Question_19 f = new Question_19();
        System.out.println(num2);//static variable
        System.out.println(f.num1);//instance variable
    }


}
