package src.multiArrays;

import java.util.Arrays;

public class class1 {
    public static void main(String[] args) {
        int[] numbers = {1,2,3};
        int[] simpleArray = new int[5];

        int[][] twoArrays = {
                {5,6,8},
                {5,2,1},
                {3,3,6}
        };
        System.out.println(twoArrays[2][1]);
        int[][] arrays = new int[3][5];

        int[][] uglyTwoArrays = {{5,6,8},{5,2,1},{3,3,6}};
        int[][][] godForsakenAbomination = {
                {{3,1}, {9,5}},
                {{5,1},{2,5}}
        };

        //vygenerovani pole
        int[][] sequence = new int[10][10];
        int counter = 1;
        for (int i = 0; i < sequence.length; i++) {
            for (int j = 0; j < sequence[i].length; j++) {
                sequence[i][j] = counter;
                counter++;
            }
        }
        //vypsani pole
        for (int i = 0; i < sequence.length; i++) {
            for (int j = 0; j < sequence[i].length; j++) {
                System.out.print(sequence[i][j] + "\t ");
            }
            System.out.println();//odradkovani
        }

        //vypisani pole pozpatku
        for (int i = sequence.length - 1; i >= 0 ; i--) {
            for (int j = sequence[i].length - 1; j >= 0 ; j--) {
                System.out.print(sequence[i][j] + "\t");
            }
            System.out.println();//odradkovani
        }
    }
}