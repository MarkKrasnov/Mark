package ArraysHW;

import java.util.Arrays;

public class MassivsHomeWork2Mark {
    public static void main(String[] args) {
        int[][][] array3D = new int[5][5][10];
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                for (int k = 0; k < 10; k++) {
                    array3D[i][j][k] = 5;
                }
            }
        }
        System.out.println(Arrays.deepToString(array3D));
    }
}