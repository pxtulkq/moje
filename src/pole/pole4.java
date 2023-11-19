package pole;

import java.util.Arrays;
import java.util.Scanner;

public class pole4 {
    public static void main(String[] args) {
        //sibenice
        int pokusy = 6;
        int cisla = 5;
        int min = 5;
        int max = 20;

        int[] pole = new int[cisla];
        for (int i = 0; i < pole.length; i++) {
            pole[i] = (int)(Math.random()*(max-min+1)+min);
        }
//        System.out.println(Arrays.toString(pole));

        int score = 0;
        Scanner a = new Scanner(System.in);
        int input = 0;
        for (int i = 0; i < pokusy; i++) {
            System.out.println("Tipni cislo");
            input = a.nextInt();
            for (int j = 0; j < pole.length; j++) {
                if (pole[j] == input){
                    score += 20;
                    System.out.println("Cislo nalezeno. +20 bodu");
                    pole[j] = -1;
//                    System.out.println(Arrays.toString(pole));
                }
            }
            if (score == 100){
                System.out.println("Tipl jsi vse!");
                break;
            }
        }
        System.out.println("Hra ukoncena!");
        System.out.println("Ziskal jsi " + score + " bodu!");
        System.out.println(Arrays.toString(pole));
    }
}