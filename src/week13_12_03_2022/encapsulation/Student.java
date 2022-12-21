package week13_12_03_2022.encapsulation;

public class Student {
    public String name;
    public int age;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        if (name.equals("XXXXX"))
            System.out.println("You can not use this name");
        this.name = name;
    }

    public void setAge(int age) {
        if(age<0)
            System.out.println("You can not use negative number as age");
        else
        this.age = age;
    }

    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
