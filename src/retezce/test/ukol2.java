package src.retezce.test;

public class ukol2 {
    public static void main(String[] args) {
        String pass = "Hello05";
        int check = 0;
        for (int i = 0; i < pass.length(); i++) {
            if (pass == "*") {
                System.out.println("V hesle je *");
                if (pass.length() == 8){
                    System.out.println("Heslo je dlouhé 8 znaků");
                    if (pass == "H"){
                        System.out.println("Heslo začíná písmenem 'H'");
                    }
                }
            }
            System.out.println(pass);
        }
    }
}
