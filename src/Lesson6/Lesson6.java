package Lesson6;

import java.util.Arrays;

public class Lesson6 {
    public static void main(String[] args) {
        String[] stringArray = new String[3];
        stringArray[0] = "Emil";
        stringArray[1] = "Alexandra";
        stringArray[2] = "Mark";

        System.out.println(Arrays.toString(stringArray));
        System.out.println();

        for (int i = 0; i < stringArray.length; i++) {
            System.out.print(" " + stringArray[i]);

        }
        System.out.println();

       //for each
        for (String str: stringArray) {
            System.out.println(str + " Super");

        }
    }
}
