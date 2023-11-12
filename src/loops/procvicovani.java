package src.loops;

import java.util.Scanner;

public class procvicovani {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.println("Vypis cisla");
        int input;
        int sum;

        do {
            input = a.nextInt();
            sum = input;
        }while (input != -1);

        System.out.println("soucet vypsanych cisel: " + sum);
    }
}
