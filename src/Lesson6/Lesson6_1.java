package Lesson6;

import java.util.Scanner;

public class Lesson6_1 {
    public static void main(String[] args) {
        System.out.println("Здравствуйте, определяет по вашему возрасту где вы учитесь");
        System.out.println("Введите ваш возраст: ноль, два, семь, восемьнадцать");
        Scanner scanner = new Scanner(System.in);
        String age = scanner.nextLine();

        switch (age) {
            case "ноль":
                System.out.println("Ты родился");
                break;
            case "два":
                System.out.println("Ты пошёл в сад");
                break;
            case "семь":
                System.out.println("Ты пошёл в школу");
                break;
            case "восемьнадцать":
                System.out.println("Ты окончил школу");
                break;
            default:
                System.out.println("Ввод данных не верный");
        }
    }
}
