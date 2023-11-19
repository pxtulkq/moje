package pole;

public class pole3 {
    public static void main(String[] args) {
        //jak se vypise index v poli
        int[] pole = {45, 21, 65, 84, 58, 123, 21, 45};

        for (int i = 0; i < pole.length; i++) {
            if (pole[i] == 21){
                System.out.println("Found 21!");
                System.out.println("Index of 21: " + i);
            }
        }
    }
}
