package src.retezce;

import java.util.Arrays;
import java.util.Scanner;

public class hodina3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //uzivatel zada nazev pisnicky, autora, rok vydani
        //vse ulozime do jednotlivych retezcu
        String input = "Dream on;Aerosmith;(1973)";
        String songName;
        String author;
        String yearOfRelease;
        //ukazka - split
        String[] splitSong = input.split(";");
        System.out.println(Arrays.toString(splitSong));
        songName = splitSong[0];
        author = splitSong[1];
        yearOfRelease = splitSong[2];
        System.out.println("Song " + songName + " composed by " + author + " in " + yearOfRelease);
        String greetings = "Hello beautiful world";
        String[] words = greetings.split(" ");
        System.out.println(Arrays.toString(words));

        //ukazka substringu
        String word = "Hello";
        String subWord = word.substring(0,4);
        //interval: vsechny znaky na indexu <0, 4)
        System.out.println(word + " -> " + subWord);
        String spanishStuffix = word.substring(1,3);
        System.out.println(spanishStuffix + " Camino");

        //Vezmi string ve kterem je cislo a pricti k nemu 42
        String number = "450";
        System.out.println(number + 42);
        int actualNumber = Integer.parseInt(number);
        System.out.println("number is: " + actualNumber);
        System.out.println("soucet je: " + (actualNumber + 42));
    }
}