package cykly;

import java.util.Scanner;

public class cviko {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        //uzivatel zadava cenu
        //zadanim -1 zadavani ukonci
        //na konci je vypsana suma
//        int sum = 0;
//        System.out.println("zadavej cenu, ukoncis pomoci -1");
//        int input = a.nextInt();
//        while (input != -1){
//            //sum = sum + input
//            sum += input;
//            input = a.nextInt();
//        }
//        System.out.println("celkova cena: " + sum);

        int dimension = a.nextInt();
        for (int i = 1; i < dimension*dimension; i++){
            System.out.println("\t" + 1);
            if (i % dimension == 0){
                System.out.println();
            }
        }
    }
}
