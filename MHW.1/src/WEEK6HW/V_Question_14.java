package WEEK6HW; /* 14. Write a Java program to print the sum (addition), multiply, subtract, divide and
remainder of two numbers.
Test Data:
Input first number: 125
Input second number: 24
Expected Output:
125 + 24 = 149
125 - 24 = 101
125 x 24 = 3000
125 / 24 = 5
125 mod 24 = 5*/

public class V_Question_14 {
    public static void main(String[] args){
        int a = 125;
        int b = 24;

        System.out.println(a + "+" + b + "=" + (a+b));//addition method
        System.out.println(a + "-" + b + "=" + (a-b));//subtract method
        System.out.println(a + "*" + b + "=" + (a*b));//multiple method
        System.out.println(a + "/" + b + "=" + (a/b));//divided method
        System.out.println(a + "mod" + b + "="+ (a%b) );//reminder method
    }
}
