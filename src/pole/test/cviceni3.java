package src.pole.test;

public class cviceni3 {
    public static void main(String[] args) {
    int[] pole = {1, 2, 3, 4, 5, 6, 7, 8};
    double sum = 0;

        for (int i = 0; i < pole.length; i++) {
            sum += pole[i];
        }
        System.out.println(sum/pole.length);
    }
}
