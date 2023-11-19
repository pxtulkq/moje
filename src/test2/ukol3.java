package test2;

public class ukol3 {
    public static void main(String[] args) {

        int hod1 = (int)(Math.random()*20+1);
        int hod2 = (int)(Math.random()*20+1);
        int hod3 = (int)(Math.random()*20+1);
        int counter = 1;

        while(hod1 == 20 && hod2 == 20 || hod2 == 20 && hod3 == 20 || hod1 == 20 && hod3 == 20){
            System.out.println("padlo: " + hod1 + ", " + hod2 + ", " + hod3);
            counter++;
        }
        System.out.println("Trvalo to " + counter + " pokusu");
    }
}
