package Scanner_HW;

import java.util.Scanner;

public class Scanner2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number_1 = scanner.nextInt();
        int number_2 = scanner.nextInt();
        int number_3 = scanner.nextInt();
        int number_4 = scanner.nextInt();
        int number_5 = scanner.nextInt();
        int minNumber = number_1;
        if (minNumber > number_2) {
            minNumber =  number_2;
        if (minNumber > number_3) {
            minNumber = number_3;
        if (minNumber > number_4) {
            minNumber = number_4;
        if (minNumber > number_5) {
            minNumber = number_5;
        System.out.println("Наименьшее число - " + minNumber);
                    }
                }
            }
        }
    }
}

