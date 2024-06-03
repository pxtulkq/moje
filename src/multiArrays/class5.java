package src.multiArrays;

import java.util.ArrayList;
import java.util.Scanner;

public class class5 {
    public static void main(String[] args) {
        //procviceni: uzivatel zadava uzivatelska jmena
        //zadavani ukonci zadanim 'konec'
        //kazde jmeno musi byt unikatni, pokud zada jiz vyskytujici se, nebude ulozeno do pole
        Scanner sc = new Scanner(System.in);
        ArrayList<String> usernames = new ArrayList<>();
        System.out.println("Zadavej usernames, zadavani ukoncis zadanim 'konec'");

        //dokud input neni 'konec'
        String input = sc.nextLine();
        while (!input.equals("konec")){
            if (!usernames.contains(input)){
                usernames.add(input);
                System.out.println(input + " pridano");
            } else {
                System.out.println("Jmeno uz v listu je");
            }
            input = sc.nextLine();
        }
        System.out.println(usernames);


        //10 nahodnych cisel (0-15)
        //musi byt nikatni
        //vyzkouset variantu s obycejnym polem a s listem
//        int[] array = new int[10];
//        for (int i = 0; i < array.length; i++) {
//            array[i] = (int)(Math.random() * 16);
//            for (int j = 0; j < i; j++) {
//                while (...)
//            }
//        }
        ArrayList<Integer> uniqueNumbers = new ArrayList<>();
        int number;
        int counter = 0;
        while (uniqueNumbers.size() != 10){
            counter++;
            number = (int)(Math.random() * 16);
            if (!uniqueNumbers.contains(number)){
                uniqueNumbers.add(number);
            }
        }
        System.out.println("Vygenerovano cisel: " + counter);
        System.out.println(uniqueNumbers);

        //pridavej prvky do arrayListu coin flipem:
        //prvky budou 100-200
        //vypis pocet prvku a sumu
        ArrayList<Integer> numbers = new ArrayList<>();
        double chance = Math.random();
        int score;
        while (chance > 0.49){
            score = (int)(Math.random() * 101 + 100);
            numbers.add(score);
            chance = Math.random();
        }
        System.out.println(numbers);
        System.out.println(numbers.size());
    }
}