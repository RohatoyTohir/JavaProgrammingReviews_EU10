package week16_12_24_2022.exeptions;

public class CompileTimeExcepitonsExamples {

    public static void main(String[] args) {
        System.out.println("Adam");
        waitFor(3);
        System.out.println("Ersin");
        //    Thread.sleep(3000);

    }

    private static void waitFor(int seconds) {
        try {
            Thread.sleep(seconds*1000);
        } catch (InterruptedException e) {

        }
    }
}
