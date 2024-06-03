package src.metody;

public class practice2 {

    static void timeConvert(int seconds){
        int hours = seconds / 3600;
        int minutes = (seconds - hours*3600) / 60;
        int remainingSeconds = (seconds - hours*3600 - minutes*60) % 60;
        System.out.println(hours + ":" + minutes + ":" + remainingSeconds);
    }

    public static void main(String[] args) {

        timeConvert(4057);

    }
}
