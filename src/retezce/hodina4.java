package src.retezce;

public class hodina4 {
    public static void main(String[] args) {
        String[] morseCode = {
                ".-",   // A
                "-...", // B
                "-.-.", // C
                "-..",  // D
                ".",    // E
                ".._.", // F
                "--.",  // G
                "....", // H
                "..",   // I
                ".---", // J
                "-.-",  // K
                ".-..", // L
                "--",   // M
                "-.",   // N
                "---",  // O
                ".--.", // P
                "--.-", // Q
                ".-.",  // R
                "...",  // S
                "-",    // T
                "..-",  // U
                "...-", // V
                ".--",  // W
                "-..-", // X
                "-.--", // Y
                "--.."  // Z
        };
        char[] alphabet = "abcdeufghijklmnopqrstuvwxyz".toCharArray();
                            //ve vysledku vytvori ('a', 'b'...)

        String text = "Hello";
        String alllower = text.toLowerCase();
        String morseEncoded = "";

        for (int i = 0; i < text.length(); i++) {
            char currentChar = alllower.charAt(i);

            for (int j = 0; j < alphabet.length; j++) {
                if (currentChar == alphabet[j]){
//                    morseEncoded = morseEncoded + morseCode[j];
                    morseEncoded += morseCode[j] + "|";
//                    break;
                }
//                else if (currentChar == ' '){
//                    morseEncoded += "//|";
//                    break;
//                }
            }
        }
        System.out.println(text + ": " + morseEncoded);
    }
}