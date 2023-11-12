package src.pole.pole_cvika;

import java.util.Scanner;

public class cviceni1 {
    public static void main(String[] args) {
        //Vygeneruj n náhodných čísel do pole. Délku tohoto pole získejte od uživatele.
        Scanner a = new Scanner(System.in);
        System.out.println("Zadej delku pole: ");
        int dp = a.nextInt();
        int[] pole = {};

        for (int i = 0; i < pole.length; i++) {
            pole[i] = (int) Math.random();
        }

        System.out.print("Vypis pole: ");
        for (int i = 0; i < pole.length; i++) {
            System.out.print(pole[dp] + " ");
        }
    }
}

