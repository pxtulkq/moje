package src.retezce.test;

public class ukol7 {
    public static void main(String[] args) {
        String a = "Zdravím* tohle je můj* test*";
        int count = 0;
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) == '*'){
                count++;
            }
        }
        System.out.println(count);
    }
}
