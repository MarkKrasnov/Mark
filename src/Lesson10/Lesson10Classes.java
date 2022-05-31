package Lesson10;

public class Lesson10Classes {
    public static void main(String[] args) {
        Cat cat0 = new Cat(8, "Барсик");
        Cat cat = new Cat("Мурзик" , 3);
//        Cat catNemo = new Cat();
//        cat.name = "Барсик";
//        cat.age = 3;
        System.out.println(cat0);
        System.out.println(cat);
    }
}


class Cat {
    private String name;
    private int age;

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }


    public Cat (int age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name = '" + name + '\'' +
                ", age = " + age +
                '}';
    }
}








