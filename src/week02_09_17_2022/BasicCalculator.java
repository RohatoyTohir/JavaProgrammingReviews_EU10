package week02_09_17_2022;
/*
Create a class named BasicCalculator.
write a Java program to print the sum (addition),
multiply, subtract, divide and remainder of two numbers.
 */
public class BasicCalculator {
    public static void main(String[] args) {
        //int num1 = 25;
       // int secondNumber = 5; or

        int num1, num2;
        num1=20;
        num2=5;
        int sum = num1+num2;
        int subtract = num1-num2;
        int multiply = num1*num2;
        int divide = num1/num2;
        int reminder = num1%num2;

        System.out.println("sum = " + sum);
        System.out.println("subtract = " + subtract);
        System.out.println("multiply = " + multiply);
        System.out.println("divide = " + divide);
        System.out.println("reminder = " + reminder);






    }
}
