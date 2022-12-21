package week03_09_24_2022;

public class IntroPreIncrementDecrement {
    /*
    Task 2:  Create a class which is "IntroPreIncrementDecrement" define a variable,

          int a=5;
          print a;
          print the ++a;
          print the --a;
     */


    public static void main(String[] args) {
        int a=5;
        System.out.println("a = " + a);
        System.out.println(++a);//a will be 6, print it
        System.out.println(a++);//a will be 6 but the next line a will be 7
        System.out.println(a);
        
        System.out.println("======================================");
        
        int x =10;
        int number = x++ + 100;// number 110
        System.out.println("number = " + number);//x=11
        //int x=11;
        int number2 = ++x + 100;
        System.out.println("number2 = " + number2);
        //you can search debug


    }
}
