package week03_09_24_2022;

public class NumberIsPositiveOrNegative {
    /*
    Task 4: Create a class which is "NumberPositiveOrNegative"
    and create a variable if the variable is positive print
    "positive" if not "negative"
     */
    public static void main(String[] args) {
        //create a variable
        int a = 10;
        //compare variable with 0(zero)
        boolean aIsPositive = a>0;
        //if condition is true print the POSITIVE
        if (aIsPositive){
            System.out.println("POSITIVE");
        }else {
            //ELSE print NEGATIVE
            System.out.println("NEGATIVE");
        }

    }
}
