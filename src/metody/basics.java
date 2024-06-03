package src.metody;

public class basics {

    //public static..= muzu pouzit v jakemkoliv package
    //private static..= nemuzu pouzit v jine class ani package

    static void printHello(){
        System.out.println("Hello world");
        System.out.println("Called from a method!");
    }

    static void printGreeting(String name){
        System.out.println("Ahoj " + name);
    }

    static void sum(int a, int b){
        System.out.println(a + " + " + b + " = ");
        System.out.println(a+b);
    }

    static int multiplication(int a, int b){
        int result = a * b;
        return result;
    }

    public static void main(String[] args) {
        printHello();

        System.out.println("------------");

        printGreeting("Karel");
        printGreeting("Honza");

        System.out.println("------------");

        sum(2, 5);
        sum(-5, 20);

        System.out.println("------------");

        multiplication(5, 3); //spocita, ale nic neudela
        int multiplicationResult = multiplication(5, 3);
        System.out.println(multiplicationResult);
    }
}