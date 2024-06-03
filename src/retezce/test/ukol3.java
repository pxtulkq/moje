package src.retezce.test;

public class ukol3 {
    public static void main(String[] args) {
        String words = "Obloha je modrá! Nejsou mraky.";

        String[] split = words.split("!");
        System.out.println("Souveti obsahuje " + split.length + " vet");
    }
}
