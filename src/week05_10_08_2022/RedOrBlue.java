package week05_10_08_2022;

public class RedOrBlue {
    /*
    Task 4: Given a string, if the string begins with
    "red" or "blue" print that color string,
    otherwise print the empty string.

     *                 input :"redxx" → "red"
     *                 input :"xxred" → ""
     *                 input :"blueTimes" → "blue"
     */
    public static void main(String[] args) {
        String str = "redxx";

        if (str.startsWith("red")){
            System.out.println("red");
        }else if(str.startsWith("blue")){
            System.out.println("blue");
        }else{
            System.out.println(" ");
        }

    }
}
