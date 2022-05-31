package Scanner_HW;

import java.util.Scanner;


public class Scanner_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number_one = scanner.nextInt();
        int number_two = scanner.nextInt();
        int number_three = scanner.nextInt();
        int number_four = scanner.nextInt();
        int number_five = scanner.nextInt();

        System.out.println("Произведение этих чисел - " + number_one*number_two*number_three*number_four*number_five);
        System.out.println();
        System.out.println(number_one+number_two+number_three+number_four+number_five + " - сумма этих чисел");


    }
}
