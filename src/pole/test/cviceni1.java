package src.pole.test;

public class cviceni1 {
    public static void main(String[] args) {
        int[] pole1 = new int[10];
        int[] pole2 = new int[10];
        int min = -100;
        int max = 100;
        int sum = 0;
        int sum2 = 0;

        for (int i = 0; i < pole1.length; i++) {
            pole1[i] = (int)Math.random()*min+1;
            sum += pole1[i];
        }
        for (int i = 0; i < pole2.length; i++) {
            pole2[i] = (int)Math.random()*min+1;
            sum2 += pole2[i];
        }
        System.out.println(sum + sum2);
    }
}