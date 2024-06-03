package src.oop;

import javax.swing.*;

public class song {

    String name;
    String author;
    int yearOfRelease;
    double rating;
    int duration;

//    public song(String name, String author, int yearOfRelease, double rating, int duration) {
//        this.name = name;
//        this.author = author;
//        this.yearOfRelease = yearOfRelease;
//        this.rating = rating;
//        this.duration = duration;
//    }
//    levej alt + insert + constructor

    public void printInfo(){
        System.out.println("Song: " + name);
        System.out.println("Written by: " + author);
        System.out.println("Released in: " + yearOfRelease);
        System.out.println("Rated " + rating + "/10");
    }
}