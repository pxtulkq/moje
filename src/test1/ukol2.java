package test1;

import java.util.Random;

public class ukol2 {
    public static void main(String[] args) {
        Random a = new Random();

        int c1 = a.nextInt(6)+1;
        int c2 = a.nextInt(6)+1;
        int c3 = a.nextInt(6)+1;

        if (c1 == c2 || c1 == c3 || c2 == c3){
            System.out.println("uzivatel vyhral s cisly " + c1 + ", " + c2 + ", " + c3);
        }else{
            System.out.println("uzivatel nevyhral s cisly " + c1 + ", " + c2 + ", " + c3);
        }
    }
}
