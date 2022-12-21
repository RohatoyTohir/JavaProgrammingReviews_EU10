package week05_10_08_2022;

public class StringMethods {
    public static void main(String[] args) {
        //if we want to get specific char charAt();
        //0123456789

        String str = "Adam";
        System.out.println(str.charAt(0));//first char
        System.out.println(str.charAt(3));//forth char

        //if we want to get the length of String =>length();
        System.out.println(str.length());

        //get the last character
        int lenghtOfTheString = str.length();


         //if you want to get index of char or Srting we need to
        // use indexOf() methods
        //indexes0123456
        String number = "0123456";
        //get the index of 3
        System.out.println(number.indexOf('3'));//index of 3 is 3
        //get the index of 56
        System.out.println(number.indexOf("56"));
        //get the index of 14
        System.out.println(number.indexOf("14"));//it will return -1
        //means that there is no 14in that String

        String sentence = "Java is programming language";
        System.out.println(sentence.indexOf("programming"));
                        //0123456789101112
        String sentence1 = "Java is Java";
        System.out.println(sentence1.indexOf("Java"));//returns 0
        System.out.println(sentence1.lastIndexOf("Java"));//return 8

        //if we want to replace some part of the String we need to use
        //replace() or replaceFirst()

        String sentence3 = "Java is a hard programming language";
        System.out.println(sentence3.replace("hard","easy"));
        System.out.println(sentence3.replace("hard","fun"));

        String sentence4 = "java is not same with java";
        System.out.println(sentence4.replaceFirst("java", "C#"));

        //if we want to get some part of the String we need to use substring() methods
                        //012345
        String subs = "Cydeo";
        //get the yde from the subs variable
        System.out.println(subs.substring(1,4));
        //get the "Cy" from the subs
        System.out.println(subs.substring(0,2));
        //get "deo" from subs variable
        System.out.println(subs.substring(2));
        //get the "ydeo" from subs variable
        System.out.println(subs.substring(1));

        System.out.println("--------------------------------");
        //if we want to multiply(repeat) one word we need to use repeat()
        String str4="Adam";
        System.out.println(str4.repeat(4));

        //if we want to check String is empty or not we need to use isEmpty() method
        String emptyWord = " ";//isEmpty method is checking length
        System.out.println(emptyWord.isEmpty());
        //if we want to check String is blank or not we need to use isBlank() method
        String blankWord = "  "; //it is checking spaces
        System.out.println(blankWord.isBlank());
        //if we want to compare two String values with exact matching we can
        // use equals()


        //if we want to compare two string values without exact matching
        //(lower case or upper case)we can use equalIgnorCase()

        String str6="Word";
        String str7="Word";
        System.out.println(str6.equals(str7));//false
        System.out.println(str6.equalsIgnoreCase(str7));//true

        //startsWith with methods is using for checking the string is
        //starting with char sequence or not
        //endingWith() methods is using for checking the string is ending
        // with given char sequence or not

        String sentence5= "Java is a good language";
        System.out.println(sentence5.endsWith("language"));

        //contains() method is using for checking the given
        // char sequence is in String or not

        String sentence6 = "Java is Java";













    }
}
