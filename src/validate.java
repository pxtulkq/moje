package src;

import javax.swing.*;
import java.util.Scanner;

public class validate {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);

        String input = JOptionPane.showInputDialog("Zadej IP");
        System.out.println("Zadal jsi: " + input);
        boolean ok = true;

        //spocitej tecky:
        String[] parts = input.split("\\.");
        if (parts.length == 4){
            System.out.println("Delka ok");
        }else {
            System.out.println("Neni format (0-255).(0-255).(0-255).(0-255)");
            ok = false;

            //System.exit(1);
        }

        //kontroluj, zda tam jsou vubec cisla
        for (int i = 0; i < parts.length && ok == true; i++) {
            for (int j = 0; j < parts[i].length() && ok; j++) {
                char current = parts[i].charAt(j);
                if (!Character.isDigit(current)){
                    System.out.println(current + " je cislo");
                    ok = false;
                    break;
                }
            }
        }

        //overi, ze jsou cisla ok
        for (int i = 0; i < parts.length; i++) {
            int number = Integer.parseInt(parts[i]);
            if (number >= 0 && number <= 255){
                System.out.println((i+i) + "/" + parts.length + "ok");
            }else{
                System.out.println("Cisla nejsou v intervalu IP adresy");
                ok = false;
                break;
            }
        }
        if (ok){
            System.out.println("zadal jsi IP adresu");
        }else{
            System.out.println("nebyla zadana IP adresa");
        }
    }
}