package week19_01_14_2023.animal;

public class Bird extends Animal{
    @Override
    public void move() {
        System.out.println("Birds are flying");
    }
    public void hunt(){
        System.out.println("Birds are eating insects");
    }
}
