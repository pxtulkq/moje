package pole.pole.pole_cvika;

import java.sql.SQLOutput;
import java.util.Scanner;

import static java.lang.Math.sqrt;

public class cviceni3 {
    public static void main(String[] args) {
        //Mějte pole celých čísel, to bude obsahovat. Takové pole můžete vytvořit staticky, nebo jej poté nějak naplnit.
        // Vytvořte pak další pole, které bude na stejných pozicích obsahovat odmocniny těchto čísel.
        int[] pole = {4, 9, 36, 100, 400};

        for (int i = 0; i < pole.length; i++) {
            int b = pole[i];
            System.out.print((int)Math.sqrt(b) + ", ");
        }
    }
}