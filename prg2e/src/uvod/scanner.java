package prg2e.src.uvod;

import java.net.Inet4Address;
import java.util.Scanner;

public class scanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Zadej cislo");
        int number = sc.nextInt();
        System.out.println("Zadal jsi cislo " + number);

        if (number % 5 == 0) {
            System.out.println("Cislo je delitelne 5");
        } else {
            System.out.println("Cislo neni delitelne 5");
        }
        System.out.println("Zadej rok");
        int year = sc.nextInt();
        if (year % 4 == 0){
            System.out.println("rok " + year + " je prestupny");
        }

        System.out.println("Zadej cislo");
        int IntervalCheck = sc.nextInt();
        if(IntervalCheck >= 5 && IntervalCheck <= 15){
            System.out.println("Cislo " + IntervalCheck + " lezi v intervalu");
        } else {
            System.out.println("Cislo " + IntervalCheck + " nelezi v intervalu");
        }

        System.out.println("Zadej pocet bodu");
        int points = sc.nextInt();
        if (points >= 90 ){
            System.out.println("Znamka je 1");
        } else if (points >= 90){
            System.out.println("znamka je 2");
        }else if (points >= 70){
            System.out.println("Znamka je 3");
        }else if (points >= 60){
            System.out.println("Znamka je 4");
        }else{
            System.out.println(":(");
        }
    }
}
