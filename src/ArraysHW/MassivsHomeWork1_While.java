package ArraysHW;

import java.util.Arrays;

public class MassivsHomeWork1_While {
    public static void main(String[] args) {
        int[][] array2D = new int[4][5];
        int i = 0;
        while (i < array2D.length) {
            int j = 0;
            while (j < array2D[0].length) {
                array2D[i][j] = 77;
                j++;
            }
            i++;
        }
        System.out.println(Arrays.deepToString(array2D));
        System.out.println();

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















