package Lesson6;

public class Lesson6_2 {
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.name = "Emil";
        person1.surname = "Kurbanov";
        person1.age = 12;
        System.out.println("Меня Зовут:" + person1.name + " " +  person1.surname + " " + "Мне " + person1.age);

        Person person2 = new Person();
        person2.name = "Alexandra";
        person2.surname = "Markova";
        person2.age = 10;
        System.out.println("Меня Зовут:" + person2.name + " " +  person2.surname + " " + "Мне " + person2.age);

        Person person3 = new Person();
        person3.name = "Mark";
        person3.surname = "Krasnov";
        person3.age = 11;
        System.out.println("Меня Зовут:" + person3.name + " " +  person3.surname + " " + "Мне " + person3.age);

        Car car1 = new Car();
        car1.brand = "Tesla";
        car1.colour = "grey";
        car1.engineType = "Electric";
        car1.maxSpeed = 290;
        car1.type = "car";

        Object object = new Object();
    }
}

class Person {
    String name;
    String surname;
    int age;
}
class Car {
    String brand;
    String colour;
    String engineType;
    String type;
    int maxSpeed;

}