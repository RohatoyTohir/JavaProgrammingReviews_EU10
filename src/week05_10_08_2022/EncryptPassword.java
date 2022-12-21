package week05_10_08_2022;

import java.util.Scanner;

/*
Task 9: Given a string password.
Encrypt with "x" a given password and print.

    Hint: do with for loop

     * password: cydeo
     * encrypt with char :x
     * output:cxyxdxexox
 */
public class EncryptPassword {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String password = "Cydeo";
        char encryptWith = 'X';
        String encryptedPassword = "";

        for (int i = 0; i <= password.length() - 1; i++) {
            //encrtyptedPass
            encryptedPassword += "" + password.charAt(i) + encryptWith;
        }
            System.out.println(encryptWith);

            System.out.println("-------------------------------");
        System.out.println("Enter a word: ");
        String word = new Scanner(System.in).next();
        for (int i = 0; i < word.length(); i++) {
            System.out.print(word.charAt(i) + "x");
        }



        }

    }
