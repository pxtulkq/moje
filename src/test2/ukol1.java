package test2;

import java.util.Scanner;

public class ukol1 {
    public static void main(String[] args) {

         Scanner a = new Scanner(System.in);
        System.out.println("Zadavej cisla, zadavani ukoncis zadanim -1");
        int input = a.nextInt();
        while (input != -1){
                System.out.println(input);
            }
            input = a.nextInt();

        }
}
