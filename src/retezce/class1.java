package src.retezce;

import java.util.Scanner;

public class class1 {
    public static void main(String[] args) {
//        char input = 'A';
//        input = '9';
//        System.out.println(input + 1);
//        input = '\n';//odradkovani
//        System.out.println("Hello " + input + " world");
//        input = '\t';//tabulator
//        System.out.println("Hello " + input + " world");
//        //porovnavani
//        char a = 'a';
//        char A = 'A';
//        if (a == A){
//            System.out.println("Same");
//        }
//
//        String hello = "Hello!";
//        Scanner sc = new Scanner(System.in);
//        String ehlo = sc.nextLine();
//        System.out.println("Zadal jsi " + ehlo);
//        //problem s  "Hello!ESC"
//        // !! u Stringu se nikdy nepoužívájí ==
//        if (hello == ehlo){
//            System.out.println("Same");
//        }
//        //pouziva se
//        if (hello.equals(ehlo)){
//            System.out.println("Jsou stejny");
//        }

        String showcase = "Obsah \t\t str\tingu";
        System.out.println(showcase);
        String more = showcase + "Hello";
        System.out.println(more);
        //Java je case sensitive
        boolean isSame = "hello".equals("Hello");
        String helloTest = "hello";
        helloTest.equals("Neco dalsiho"); //rovna se
        String upperHello = helloTest.toUpperCase();
        //po zavolani se puvodni nezmeni
        System.out.println(helloTest);
        System.out.println(upperHello);
        System.out.println("Pismeno na 2: " +  helloTest.charAt(2));
        System.out.println("kde je 'l'?" + helloTest.indexOf('l'));
        System.out.println("kde je 'l'?" + helloTest.lastIndexOf('l'));
    }
}
