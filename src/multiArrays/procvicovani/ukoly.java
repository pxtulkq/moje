package src.multiArrays.procvicovani;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class ukoly {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //1.Mějte připravený ArrayList celých čísel. Vypište jej do konzole pozpátku (tj. od posledního
        //přidaného prvku).
//        ArrayList<Integer> list = new ArrayList<>();
//        for (int i = 0; i < 10; i++) {
//            list.add(i+1);
//        }
//        for (int i = list.size()-1; 0 <= i; i--) {
//            System.out.println(list.get(i));
//        }

        //2.Mějte dvourozměrné pole celých čísel o velikosƟ 5x5. Zeptejte se uživatele na číslo sloupce.
        //Do konzole vypište součet čísel ve sloupci. (Předpokládejte uživatele, který vždy zadá číslo)
//        int[][] cisla = new int[5][5];
//        for (int i = 0; i < cisla.length; i++) {
//            for (int j = 0; j < cisla[i].length; j++) {
//                cisla[i][j] = (int)(Math.random()*10+1);
//            }
//        }
//        System.out.println("Zadej cislo sloupce");
//        int sloupec = sc.nextInt();
//        int sum = 0;
//        for (int i = 0; i < cisla.length; i++) {
//            sum += cisla[i][sloupec];
//        }
//        System.out.println(sum);

        //3.Napište program, kde je připravený ArrayList pro řetězce španělských podstatných jmen.
        //Uživatel bude zadávat řetězce, zadávání ukončí frází fin. Následně jsou do konzole vypsány
        //všechny řetězce se španělským členem (tj. vše, co začíná na (el/la/un_*slovo*).
//        ArrayList<String> espanyol = new ArrayList<>();
//        System.out.println("Zadavej slova, zadavani ukoncis 'fin'");
//        String input = sc.nextLine();
//        while (!input.equals("fin")){
//            espanyol.add(input);
//            input = sc.nextLine();
//        }
//        String currentWord = "";
//        for (int i = 0; i < espanyol.size(); i++) {
//            currentWord = espanyol.get(i);
//            if (currentWord.startsWith("el") || currentWord.startsWith("la") || currentWord.startsWith("un ")){
//                System.out.println(currentWord);
//            }
//        }

        //4.Napište program, který vygeneruje 100x náhodná čísla 0 – 100 do ArrayListu. Po
        //vygenerování z pole odstraňte všechny čísla menší než 50. Dále vypište to konzole, kolik čísel
        //bylo odstraněno a obsah Listu po odstranění. Zamyslete se, jak by taková úloha vypadala,
        //kdybyste místo ArrayListu použili obyčejné pole.
//        int removed = 0;
//        int currentNum = 0;
//        ArrayList <Integer> randomNumbers = new ArrayList<>();
//        for (int i = 0; i <= 100; i++) {
//            randomNumbers.add((int)(Math.random()*100));
//        }
//        for (int i = 0; i <= randomNumbers.size()-1; i++) {
//            currentNum =  randomNumbers.get(i);
//            if (currentNum<50){
//                randomNumbers.remove(i);
//                removed++;
//                i--;
//            }
//        }
//        System.out.println(removed);
//        System.out.println(randomNumbers);

        //5.Mějte 2D pole reprezentující recenze k filmům. Každé 1 pole reprezentuje 1 film, uvnitř
        //tohoto pole je několik celých čísel reprezentující recenzi k filmu (1-10):
        //Vypište, kolik filmů má průměrné skóre > 7.5.
        //AlternaƟvně: vypište, kolik filmů má pouze kladné recenze (kladná je > 7)
//        double average = 0;
//        int count = 0;
//        int[][] review = {{1,5,3,2,6}, {4,5,2,5,6},{9,9,7,8,9},{3,3,1,1,2}};
//        for (int i = 0; i < review.length; i++) {
//            average = 0;
//            for (int j = 0; j < review[i].length; j++) {
//                average += review[i][j];
//            }
//            average = average/review[i].length;
//            if (average>7.5){
//                count++;
//            }
//        }
//        System.out.println(count);
    }
}
