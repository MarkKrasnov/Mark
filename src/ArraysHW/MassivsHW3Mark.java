package ArraysHW;

import java.util.Scanner;

public class MassivsHW3Mark {
        public static void main(String[] args) throws InterruptedException {
        int[][] array2D = new int[3][3];
        Scanner scanner = new Scanner(System.in);
        //int l = 0;
        //int p = 0;
        int i = 0;
        while (i < 3) {
            int j = 0;
            while (j < 3) {
                array2D[i][j] = scanner.nextInt();
                if (array2D[i][j] > 0) {
                    if (array2D[i][j] > 100) {
                        System.out.println("Это число больше ста!");
                        break;
                    }
                } else System.out.println("Это отрицательное число!");
                //p++;
                j++;
            }
            //l++;
            i++;
        }
        System.out.println("Минутку, обрабатываю массив...");
        Thread.sleep(3000);
        int k = 0;
        while (k < array2D.length) {
            int m = 0;
            while (m < array2D[0].length) {
                System.out.print(array2D[k][m] + " ");
                m++;
            }
            System.out.println();
            k++;
        }
    }
}


