package week16_12_24_2022.final_keyword.final_with_variable;

public class Person {


    private String name;
    final public String birthDay;

    public String getBirthDay() {
        return birthDay;
    }

    public Person(String birthDay) {
        this.birthDay = birthDay;
        setName(name);
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", birthDay='" + birthDay + '\'' +
                '}';
    }
}
