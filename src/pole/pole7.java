package src.pole;

import java.util.Arrays;

public class pole7 {
    public static void main(String[] args) {
        int[] pole = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        for (int i = 0; i < pole.length; i++) {
            pole[i] *= 3;
            pole[i] = -pole[i];
        }
        System.out.println(Arrays.toString(pole));
    }
}