package src.multiArrays;

import java.util.ArrayList;
import java.util.Scanner;

public class listInput {
    public static void main(String[] args) {
        //uzivatel zadava prvky do pole
        //zadavani ukonci zadanim -1
        //vypiste vse, co uzivatel zadal

        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();
        System.out.println("Zadavej cisla, zadavani ukoncis zadanim -1");
        int input = sc.nextInt();
        while (input != -1){
            numbers.add(input);
            input = sc.nextInt();
        }
        System.out.println("Zadano:");
        System.out.println(numbers);
    }
}
