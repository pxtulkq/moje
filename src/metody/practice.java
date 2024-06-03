package src.metody;

import java.util.Arrays;

public class practice {

    static void greetings(String name){
        System.out.println("Ahoj " + name);
    }

    static int rectangleArea(int width, int height){
        return width * height;
    }
    static int random(int min, int max){
        return (int) (Math.random() * (max-min +1)+ min);
    }

    //vygeneruj pole nahodnych cisel od min po max
    //delka pole je argument funkce
    static int[] randomArray(int lenght, int min, int max){
        int[] array = new int[lenght];
        for (int i = 0; i < array.length; i++) {
            array[i] = random(min, max);
        }
        return array;
    }


    //metoda ma jako vstup pocet sekund
    //do konzole vypiste ve formatu mm:ss
    static void timeConvert(int seconds){
        int minutes = seconds / 60;
        int remainingSeconds = seconds - minutes * 60;
//        int remainingSeconds = seconds % 60;
        System.out.println(minutes + ":" + remainingSeconds);
    }



    public static void main(String[] args) {
        greetings("Karel");

        System.out.println("------------");

        int rectangleArea = rectangleArea(5, 4);
        System.out.println("Area is : " + rectangleArea);

        System.out.println("------------");

        int randomNum = random(-10, 10);

        System.out.println("------------");

        System.out.println(randomNum);
        int anotherRandomNum = random(20, 100);
        System.out.println(anotherRandomNum);

        System.out.println("------------");

        System.out.println(Arrays.toString(randomArray(10, -100, 100)));

        System.out.println("------------");

        timeConvert(90);
        timeConvert(160);
    }
}