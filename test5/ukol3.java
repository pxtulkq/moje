package test5;

import java.util.ArrayList;
import java.util.Scanner;

public class ukol3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> hesla = new ArrayList<>();
        System.out.println("Zadavej hesla, zadavani ukoncis zadanim 'konec'");
        String heslo = String.valueOf(sc.nextInt());
            while (!heslo.equals("konec")){
                hesla.add(heslo);
            heslo = sc.nextLine();
            if (heslo.length() >= 8 && heslo.contains("*")){
                System.out.println(heslo);
            }
        }
    }
}