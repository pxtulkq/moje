package src.oop;

import src.oop.rectangle;

public class rectanglePractice {
    public static void main(String[] args) {
        rectangle abc = new rectangle();
        abc.width = 4;
        abc.height = 6;
        System.out.println("Obdelnik : W = " + abc.width + " H = " + abc.height);
        System.out.println("Obsah: " + abc.getArea());
        System.out.println("Je to čtverec? " + abc.isSquare());
        rectangle fgh = new rectangle();
        fgh.width = 6;
        fgh.height = 6;
        System.out.println("Obdelnik: W " + fgh.width + " H = " + fgh.height);
        System.out.println("Je to čtverec? " + fgh.isSquare());
    }
}