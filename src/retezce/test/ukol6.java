package src.retezce.test;

public class ukol6 {
    public static void main(String[] args) {
        String[] spanishPhrases = {"El Camino La bomba"};
        for (int i = 0; i < spanishPhrases.length; i++) {
            if (spanishPhrases[i].contains(" el ") || spanishPhrases[i].contains(" a ") || spanishPhrases[i].contains(" la ")){
                System.out.println(spanishPhrases[i]);
            }
        }
    }
}
