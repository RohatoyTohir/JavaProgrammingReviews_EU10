package week13_12_03_2022.access_modifier.pac2;



import week13_12_03_2022.access_modifier.pac1.Person;

public class DefaultTest {

    public static void main(String[] args) {
        //we can not reach default access modifier outside the package
        //  System.out.println(new Person().lastName);
    }
}