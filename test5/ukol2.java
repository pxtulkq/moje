package test5;

import javax.swing.*;
import java.util.Scanner;

public class ukol2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[][] pole = new int[4][4];
//        int max = Integer.max();
        for (int i = 0; i < pole.length; i++) {
            for (int j = 0; j < pole[i].length; j++) {
            pole[i][j] = (int)(Math.random()*10+1);
            }
        }
        String input = JOptionPane.showInputDialog("Zadej cislo radku");
        int row = Integer.parseInt(input);
        for (int i = 0; i < pole[row].length; i++) {
            System.out.print(pole[row][i] + " ");
        }
//        System.out.println(max.[row]);

//        System.out.println("Zadej cislo radku");
//        int radek = sc.nextInt();
//        int max = 0;
//        for (int i = 0; i < pole.length; i++) {
//            max += pole[i][radek];

        }
    }