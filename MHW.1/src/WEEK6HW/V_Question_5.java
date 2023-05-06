package WEEK6HW; /*5. Write a program for a calculator with addition, subtraction, multiplication, and division
        methods all with parameters and use string concatenation methods. (Note: Two static
and Two instance methods.)*/

 public class V_Question_5 {

  public static void main(String[] args){
   addition(20,5);
   subtraction(20,5);
   V_Question_5 N = new V_Question_5();
   N.multiplication(20,10);
   N.division(40,2);
  }


   public static void addition(int a, int b){//static method
    System.out.println(a+b);
  }

  public static void subtraction(int a, int b){//static method
   System.out.println(a-b);}

  public void multiplication(int a, int b){//instance method
   System.out.println(a*b);}


  public void division(int a, int b){//instance method
   System.out.println(a/b);}


 }



