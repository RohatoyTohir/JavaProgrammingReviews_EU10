package week02_09_17_2022;

public class VariableIntro {
    public static void main(String[] args) {
        /*
        Variable types:
        1-Primitive
        -Numerical primitives:
        Double>float>long>int>short>byte
        - boolean
        - char define char in '' - single quote


        2-Non-Primitive (in future we will go on deep)
        String define String in "" -double quote

        how to define variables:
        * data type variables name = data;
        1. MUST be unique (inside the same block-method)
        2. Lower camelCase
        3. we CAN NOT start with numbers
        4. We CAN NOT use Java Reserved words
        5. For special characters we can use only _(underscore) and $(dollar sign)
        6. make it readable and understandable

         */
        //data type variable name = data;
        // we need to use byte
        int age = 37;
        //byte myByte = 129; we cannot use this value in a byte from -128 to 127

        short myShort = 12;
        long myLong = 1223223233232323L; //if you want to make integer to long
        // we need to put L or l) Default data type for compiler is int

        double myDouble=25.5;
        double myDouble1=25;

        float myFloat=12.5f; //default data type for compiler is double
        /*
        Explicit casting
        done by developer
        manual
         */
        long l = 20; //l=20
        int i=(int)l; //we have to say to compiler make l is int
        //double data type      long data type
        double d          =      l;//implicit casting done by compiler

        //implicit casting vs explicit casting

        //implicit casting is assigning small data type to bigger


        //explicit casting is assigning bigger data type to smaller one
        //int data type    long data type
                   //explicit casting

        //addition
        /*
        number + number=number
        int +int=int
        double + int=double
        int+short=int
        6+6=12
         */
        /*
        //Concatenation
        String+anything=>String
        123+Adam=> 123Adam
         */





    }
}
