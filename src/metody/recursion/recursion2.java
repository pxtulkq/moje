//package src.metody.recursion;
//
//import java.io.File;
//
//public class recursion2 {
//
//    static void countdown(int n){
//        if (n < 1){
//            return;
//        }
//        System.out.println(n);
//        countdown(n-1);
//    }
//
//    static int factorial(int n){
//        if (n == 1){
//            return 1;
//        }
//        return n * factorial(n-1);
//    }
//
//    static void tree(String file){
//        File[] files = new File(file).listFiles();
//        for (File f : files){
//            if (f.isFile()){
//                System.out.println("Soubor: " + f.getName());
//            }else{
//                System.out.println("Slozka: " + f.getName());
//                tree(f.getPath());
//            }
//        }
//    }
//
//    public static void main(String[] args) {
//        countdown(5);
//        tree("src");
//    }
//}
