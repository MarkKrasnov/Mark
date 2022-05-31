import java.lang.reflect.Array;
import java.util.Arrays;

public class Lesson5 {
    public static void main(String[] args) {
        int[] array1 = new int[5];
        array1[0] = 1;
        array1[1] = 56;
        array1[2] = 89;
        array1[3] = -3;
        array1[4] = 5;

//        System.out.println(Arrays.toString(array1));

        int[] array2 = {1, 56, 89, -3, 5};
//        System.out.println(Arrays.toString(array2));


        int[][] array2D = new int[3][3];

        array2D[0][0] = 2;
        array2D[0][1] = 3;
        array2D[0][2] = 3;

        array2D[1][0] = 4;
        array2D[1][1] = 5;
        array2D[1][2] = 7;

        array2D[2][0] = 6;
        array2D[2][1] = 7;
        array2D[2][2] = 9;


        int[][][] array3D = new int[3][3][3];

        int[][][][] array4D = new int[3][3][3][3];


        int[][][] array3DFird = new int[2][4][1];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                for (int k = 0; k < 3; k++) {
                    array3DFird[i][j][k] = 5;

                }
            }

        }
        System.out.println(Arrays.deepToString(array3DFird));

        int[][][][] array4DSECOND = new int[3][3][3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                for (int k = 0; k < 3; k++) {
                    for (int l = 0; l < 3; l++) {
                        array4DSECOND[i][j][k][l] =  5;
                  

                    }
                }


            }
        }

    }
}


