package src.oop;

import src.oop.song;

public class songPractice {
    public static void main(String[] args) {
        song dreamOn = new song();
        dreamOn.name = "Dream On";
        dreamOn.author = "Aerosmith";
        dreamOn.yearOfRelease = 1973;
        dreamOn.rating = 9.8;
        dreamOn.printInfo();
    }
}
