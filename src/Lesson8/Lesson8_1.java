package Lesson8;

import java.util.Scanner;

public class Lesson8_1 {
    public static void main(String[] args) {
//        System.out.println(8 % 6);

        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();

        if (x % 2 == 0) {
            System.out.println("Число " + x + " чётное");
        }else System.out.println("Число " + x + " не чётное");

    }
}
