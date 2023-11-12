package src.pole.pole_cvika;

public class cviceni2 {
    public static void main(String[] args) {
        //Vypočtěte součet všech sudých čísel a všech lichých v poli celých čísel. Výsledek vypište do konzole.
        // (myšleno součet sudých, resp. lichých čísel, ne čísel, které jsou na sudých, resp.lichých pozicích)
        int [] pole = {4, 9, 85, 63, 11, 98, 7};
        int sum = 0;
        int sum1 = 0;
        for (int i = 0; i < pole.length; i++) {
            if (pole[i] % 2 == 0){
                sum += pole[i];
            }else if (pole[i] % 3 == 0 || pole[i] % 1 == 0){
                sum1 += pole[i];

            }
        }
        System.out.println("Soucet sudych cisel: " + sum);
        System.out.println("Soucet lichych cisel: " + sum1);
    }
}
