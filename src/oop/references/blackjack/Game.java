package src.oop.references.blackjack;

import java.util.Scanner;

public class Game {

    Player player;
    int dealerValue;
    int bet;

    public Game(Player player) {
        this.player = player;
        this.dealerValue = (int)(Math.random() * 11 + 10);
    }

    boolean takeTurn(){
        System.out.println("Liznout si dalsi kartu?");
        Scanner sc = new Scanner(System.in);
        if (sc.nextLine().equals("ano")){
            return true;
        }else{
            return false;
        }
    }

    void start(){
        if (wantToPlay()){
            bet  = 2 * betAmount();
            System.out.println("Hra zacala a vsazena castka je " + bet);
            System.out.println("CHEAT: dealer ma " + dealerValue);
            player.pickCard();
        }else{
            System.out.println("Hra ukoncena");
        }
    }

    int betAmount(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Kolik se vsazi?");
        int amount = sc.nextInt();
        while (!(amount > 0 && amount <= player.money)){
            System.out.println("Neplatna hodnota, zadej znova");
            amount = sc.nextInt();
        }
        player.money -= amount;
        return amount;
    }

    boolean wantToPlay(){
        System.out.println("Chcete hrat?");
        Scanner sc = new Scanner(System.in);
        String answer = sc.nextLine();
        if (answer.equals("ano")){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Player james = new Player("James", 1000);
        Game blackjack = new Game(james);

        blackjack.start();

    }

}
