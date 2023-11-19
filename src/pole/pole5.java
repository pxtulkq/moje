package pole;

public class pole5 {
    public static void main(String[] args) {

        int[] switches = {5, 6, 9};
        int temp = switches[0];
        switches[0] = switches[2];
        switches[2] = temp;

        for (int i = 0; i < switches.length; i++) {
            if (switches[i] > switches[i+1]){
                System.out.println("neni sezareno");
                break;
            }
        }
    }
}