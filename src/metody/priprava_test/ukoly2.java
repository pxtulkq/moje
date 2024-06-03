package src.metody.priprava_test;

public class ukoly2 {

//    static int getMax(int[] array){
//        int max = 0;
//        for (int i = 0; i < array.length; i++) {
//            if (max < array[i]){
//                max = array[i];
//            }
//        }
//    return max;
//    }

//    static int dayCount(int day, int month){
//      int[] daysInMonths = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
//      int totalDays = 0;
//      for (int i = 0; i < month-1; i++){
//          totalDays += daysInMonths[i];
//      }
//      totalDays += day;
//      return totalDays;
//    }

//    public static int isLeapYear(int day, int month, int year){
//        boolean ok = isLeapYear2(year);
//      int[] daysInMonths = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
//      int[] daysInMonthsLeap = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
//      int totalDays = 0;
//      if (ok){
//          for (int i = 0; i < month-1; i++){
//              totalDays += daysInMonths[i];
//          }
//      }
//      totalDays += day;
//      return totalDays;
//    }

//     public static boolean isLeapYear2(int year){
//    boolean ok = year % 4 == 0;
//    int totalDays = 0;
//    return totalDays;
//     }

//    static void textAnalysis(String text){
//        String[] split = text.split(" ");
//        int slova = split.length;
//        String[] split2 = text.split("[!?.]");
//        int vety = split2.length;
//        System.out.println("Text ma " + slova + " slov a " + vety + " vet");
//    }

//    static boolean isTriangle(int a, int b, int c){
//        if (a + b > c && a + c > b && b + c > a){
//            return true;
//        }else{
//            return false;
//        }
//    }
//    static double triangleArea(int a, int b, int c){
//        if (isTriangle(a, b, c)){
//            double s = (a + b + c) / 2.0;
//            return Math.sqrt(s * (s - a) * (s - b) * (s - c));
//        }else{
//            return -1;
//        }
//    }

//    static int digitsSum(String number){
//        int sum = 0;
//        int[] poleCisel = new int[number.length()];
//        for (int i = 0; i < number.length(); i++) {
//            poleCisel[i] = Character.getNumericValue(number.charAt(i));
//        }
//        for (int i = 0; i < poleCisel.length; i++) {
//            sum += poleCisel[i];
//        }
//        return sum;
//    }



    public static void main(String[] args) {
//       1) Napište metodu getMax(int[] array), která ze získaného pole vybere největší prvek a ten
//          následně vrátí (analogicky můžete vyzkoušet i nejmenší pro minimum).

//        int[] cisla = {12,13,12,10,15};
//        System.out.println(getMax(cisla));

        System.out.println("-----");

//       2) Napište metodu dayCount(int day, int month), která vráơ počet dní od začátku roku do
//          datumu. Nezapomeňte, že počet dní v jednotlivých měsících se liší, můžete si proto tedy
//          takové hodnotu pro každý měsíc uložit v poli

//        System.out.println(dayCount(5, 2));

        System.out.println("-----");

//       3) Úkol 2 rozšiřte tak, že vytvoříte přidáte do hlavičky metody i údaj o roce, takže hlavička
//          metody bude vypadat dayCount(int day, int month, int year). Dále si připravte další metodu
//          pro zjištění, zda se jedná o přestupný rok isLeapYear(int year). Tato metoda by měla pouze
//          vracet, zda se jedná o přestupný rok (zvolte vhodný datový typ). Tuto metodu následně
//          využijte v metodě dayCount(…) a počet dní zohledněte s přestupným rokem

//        System.out.println(isLeapYear(5, 2, 2024));

        System.out.println("-----");

//       4) Připravte metodu textAnalysis(String text), která spočítá a do konzole vypíše informace o
//          předaném textu: počet slov a počet vět.

//        textAnalysis("Jana má o víkendu narozeniny. Půjdu na její oslavu");

        System.out.println("-----");

//        5) Napište dvě metody pro počítání s trojúhelníkem: isTriangle(int a, int b, int c), která vrátí
//           údaj, zda takové strany mohou vůbec tvořit trojúhelník. Dále napište metodu pro výpočet
//           obsahu triangleArea(int a, int b, int c), která předchozí metodu využije. Pokud metoda
//           isTrinalge(…) vrátí hodnotu false, tak vraťte obsah s hodnotou -1. V případě, že se doopravdy
//           jedná o trojúhelník, metody vrátí obsah.

//        if (isTriangle(4,3,5)){
//            System.out.println(triangleArea(4,3,6));
//        }else{
//            System.out.println("neni to trojuhelnik");
//        }

        System.out.println("-----");

//         6) Napište metodu, která vrátí sumu všech cifer v čísle. Metoda může vypadat například takto:
//            digitsSum(int number), kde uživatel například zadá číslo 456 a výsledek je 15 (4+5+6).

//        System.out.println(digitsSum(String.valueOf(456)));


    }

}
