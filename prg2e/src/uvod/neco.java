package prg2e.src.uvod;

public class neco {

    public static void main(String[] args) {
        System.out.println("Hello world");
        int number;
        number = 15;
        int anothernumber = 20;

        double decimal = 4.2;
        boolean eval;
        long bignumber = 1000000000000L;
        String test = "some text";
        char singlechar = 'a';
        System.out.println("hodnota cisla je: " + anothernumber);
        int result1 = 5/2;

        boolean evaulate = (number > anothernumber) && (decimal < number);


        //int result2 = (int)(anothernumber * decimal);
        //result = (int) Math.pow(2,5);
        //System.out.println(result);
        //result = (int) (Math.random()*5 + 1);


        double average = (number + anothernumber + decimal) /3;
        System.out.println(average);
    }

}