package src.oop.test;

public class SlotMachine {

    public SlotMachine(int debt) {
        this.debt = debt;
    }

    static int balance;
    int debt;

    public static void bet() {
        int cislo1 = (int) (Math.random() * 7 + 1);
        int cislo2 = (int) (Math.random() * 7 + 1);
        int cislo3 = (int) (Math.random() * 7 + 1);
        if (cislo1 == cislo2 && cislo1 == cislo3 && cislo2 == cislo3) {
            balance += 1500;
        } else if(balance >= 150){
            System.out.println("Nemuzete si vsadit");
        }
    }

    public void getBalance(){
        System.out.println("Prave mam: " + balance);
        System.out.println("Dluzim: " + debt);
    }

    public void loan(){

        this.balance += balance*0.5 + debt;
    }
}