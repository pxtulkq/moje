package src.retezce;

public class hodina5 {
    public static void main(String[] args) {
//        String num = "5";
//        String reg = "[0-9]";
//
//        if (num.equals(reg)){
//            System.out.println("Jsou stejne");
//        }

//        String num = "d1";
//
//        if (num.matches("[0-9][a-z]")){
//            System.out.println("Jsou stejne");
//        }
        String num = "5";

        String rcReg = "[0-9]{2,}[[0-1][5-6]][0-3][0-9]/[0-9]{4}";
        if (num.matches("[0-9][0-9]")){
            System.out.println("Jsou stejne");
        }
    }
}
