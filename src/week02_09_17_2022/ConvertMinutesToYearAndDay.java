package week02_09_17_2022;
/*
Create class named ConvertMinutesToYearAndDay,
write a Java program to convert minutes into a number of years and days.

     Input the number of minutes: 3456789
     Expected Output :
     3456789 minutes is approximately 6 years and 210 days
 */

public class ConvertMinutesToYearAndDay {
    public static void main(String[] args) {
        //how many minutes we have in an hour?===> 60 min
        //how many hours in a day?            ===> 24 hours
        //how many days in a year?            ===> 365 days (it means 24*365)
         //                                                 (or 24*60*365 min)
        int givenMinutes=3456789;
        int howManyMinutesInAYear=(24*365*60);
        int year=givenMinutes/howManyMinutesInAYear;
        int remainderMinutes = givenMinutes%howManyMinutesInAYear;

        System.out.println("year = " + year);
        System.out.println("remainderMinutes = " + remainderMinutes);
        int days = remainderMinutes/ (24*60);
        System.out.println("days = " + days);

        /*
        120 second
        second/60 we can find the minutes
        24*60 minutes
        1 minute=60 second;
        1hour=60 minutes;
        1 day = 24 hours; (24*60*60 seconds)
         */





    }
}
