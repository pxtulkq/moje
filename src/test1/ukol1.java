package test1;

import java.util.Scanner;

public class ukol1 {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.println("Zadej vek:");
        int v = a.nextInt();

        if (v >= 18 && v < 65){
            System.out.println("uzivatel muze darovat krev");
        }else{
            System.out.println("uzivatel nemuze darovat krev");
        }
    }
}
