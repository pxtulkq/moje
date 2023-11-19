package pole.pole.pole_cvika;

import java.util.Scanner;

public class cviceni1 {
    public static void main(String[] args) {
        //Vygeneruj n náhodných čísel do pole. Délku tohoto pole získejte od uživatele.
        Scanner a = new Scanner(System.in);
        System.out.println("Zadej delku pole: ");
        int dp = a.nextInt();
        int[] pole = new int[dp];

        for (int i = 0; i < pole.length; i++) {
            int ran = (int)Math.random()*100+1;
            pole[i] = ran;
            System.out.print(pole[i] + ", ");
        }
    }
}

