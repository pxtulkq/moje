package pole.pole.pole_cvika;

import java.util.Arrays;
import java.util.Scanner;

public class cviceni5 {
    public static void main(String[] args) {
        //Mějte prázdné pole celých čísel (délka např. 10). Napište program, který uživatele vyzve, aby
        //zadával čísla, která do pole budou vložena.
//        int[] pole = new int[10];
//        Scanner a = new Scanner(System.in);
//        for (int i = 0; i < pole.length; i++) {
//            System.out.println("Zadej cislo do pole:");
//            pole[i] = a.nextInt();
//        }
//        System.out.println(Arrays.toString(pole));

        int[] pole = new int[10];
        Scanner a = new Scanner(System.in);
        System.out.println("Zadej cislo do pole:");
        int b = a.nextInt();

        for (int i = 0; i < pole.length; i++) {
            if (10 < b && b < 100) {
                System.out.println("spravne zadana hodnota");
            } else {
                System.out.println("spatne zadana hodnota, zadej spravnou");
                pole[i] = a.nextInt();
            }
            System.out.println(Arrays.toString(pole));
        }
    }
}
