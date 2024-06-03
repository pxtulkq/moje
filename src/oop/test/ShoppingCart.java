//package src.oop.test;
//
//public class ShoppingCart {
//
//    public ShoppingCart(double totalPrice) {
//        this.totalPrice = totalPrice;
//    }
//
//    double totalPrice;
//    int discount;
//
//    public void add(int itemPrice) {
//        totalPrice += itemPrice;
//    }
//
//    public void remove(int itemPrice) {
//        if (totalPrice < 0){
//            System.out.println("Nemuzete odstranit polozku");
//        } else {
//            totalPrice -= itemPrice;
//        }
//    }
//
//    public void discount(){
//        if (discount <= 0 && discount >= 99){
//            totalPrice -= discount;
//        } else {
//            System.out.println("Zadejte jinou slevu");
//        }
//    }
//
//    public int getPrice(){
//
//        return;
//    }
//
//
//}
