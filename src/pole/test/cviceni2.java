package src.pole.test;

public class cviceni2 {
    public static void main(String[] args) {
    int[] pole = {4, 6, 12, 16, 9, 7, 21, 11, 10, 5};

        for (int i = 0; i < pole.length; i++) {
            if (pole[i] >= 10 && pole[i] <=20){
                System.out.print(pole[i] + ", ");
            }
        }
    }
}
