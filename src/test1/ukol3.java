package test1;

import java.util.Scanner;

public class ukol3 {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.println("Zadej kolik je hodin");
        int c = a.nextInt();

        if(c >= 6 && c <= 12){
            System.out.println("Dobre rano");
        }else if(c > 12 && c <= 18){
            System.out.println("Dobre odpoledne");
        }else if(c > 18 && c <= 24){
            System.out.println("Dobry vecer");
        }else{
            System.out.println("Dobrou");
        }
    }
}
