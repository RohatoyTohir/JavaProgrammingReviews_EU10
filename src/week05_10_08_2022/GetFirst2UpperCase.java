package week05_10_08_2022;

import java.util.Scanner;

public class GetFirst2UpperCase {
    public static void main(String[] args) {
        Scanner scanner  =new Scanner(System.in);
       // String word = "Hello";

        System.out.println("enter a word");
        String word = scanner.next();
        String result = ""+ word.charAt(0)+word.charAt(1);
        String result2 = word.charAt(0)+""+word.charAt(1);
        System.out.println(result.toUpperCase());
        System.out.println(result2.toUpperCase());
    }
}
/*
Task 1: Given a string, print the string made of its first two chars,
so the String "Hello" yields “HE".
 */