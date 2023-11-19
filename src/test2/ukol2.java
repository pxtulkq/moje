package test2;

import java.util.Random;

public class ukol2 {
    public static void main(String[] args) {


            for (int i = 0; i < 1000; i++) {
                int num = (int) Math.random();
                System.out.print(num + ", ");

                if (num >= 100) {
                    System.out.println(num);
                }
            }
        }
    }
