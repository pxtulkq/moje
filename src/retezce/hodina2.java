package src.retezce;

import java.util.Scanner;

public class hodina2 {
    public static void main(String[] args) {
//        //nacti string od uzivatele
//        //strng je heslo
//        //nazev musi byt dlouhy aspom 8 znaku
        Scanner a = new Scanner(System.in);
//        System.out.println("Zadej heslo:");
//        String heslo = a.nextLine();
//        if (heslo.length() < 8){
//            System.out.println("neplatne");
//        }else{
//            System.out.println(heslo + " je ok");
//        }

//        //heslo musi odpovidat 'secret'
//        //vypiste zda uzivatel uhadl
//        System.out.println("uhadni heslo:");
//        String spravneHeslo = "secret";
//        heslo = a.nextLine();
//        if (heslo.equals(spravneHeslo)){
//            System.out.println("spravne");
//        }else{
//            System.out.println("spatne");
//        }

//        //uzivatel zada rodne cislo
//        //zjisti, ze je spravne
//        //zjisti, zda se jedna o muze/zenu
//        System.out.println("zadej rodne cislo");
//        String rc = a.nextLine();
//        //je spravne = lomitko
//        //a zaroven 123456/7899
//        if (rc.charAt(6) == '/'){
//            System.out.println("rc ma na spravne pozici lomitko");
//            if (rc.length() == 11){
//                System.out.println("ma spravnou delku");
//                if (rc.charAt(2) == '0' || rc.charAt(2) == '1'){
//                    System.out.println("jedna se o muze");
//                } else if (rc.charAt(2) == '5' || rc.charAt(2) == '6') {
//                    System.out.println("jedna se o zenu");
//                }
//            }
//        }

//        //pole Stringu:
//        String[] hesla = {"ananas" , "vodka", "rohlik"};
//        System.out.println("zkus uhadnout heslo:");
//        String uhadni = a.nextLine();
//        for (int i = 0; i < hesla.length; i++) {
//            if (uhadni.equals(hesla[i])){
//                System.out.println("Uhadl");
//                break;
//            }
//        }

        //vypis z pole vsechny Honzy
        String[] names = {"Ctirad Novák" , "Oldřich Starý", "Jan Franta", "Jan Boháč", "František Král"};
        for (int i = 0; i < names.length; i++) {
            if (names[i].contains("Jan ")){
                System.out.println(names[i]);
            }
        }
    }
}